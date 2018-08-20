package br.com.nexfe.siesma.service;

import br.com.nexfe.siesma.entidades.Aluno;
import br.com.nexfe.siesma.repositorios.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository repository;

    public Aluno salvar(Aluno aluno) {
        return repository.saveAndFlush(aluno);
    }

    public List<Aluno> listaTodos() {
        return repository.findAll();
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }

    public Aluno buscarPeloCodigo(Long id) {
        return repository.findById(id).orElse(null);
    }

}
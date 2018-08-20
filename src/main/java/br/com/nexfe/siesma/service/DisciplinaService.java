package br.com.nexfe.siesma.service;

import br.com.nexfe.siesma.entidades.Disciplina;
import br.com.nexfe.siesma.repositorios.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisciplinaService {

    @Autowired
    private DisciplinaRepository repository;

    public Disciplina salvar(Disciplina disciplina) {
        return repository.saveAndFlush(disciplina);
    }

    public List<Disciplina> listaTodos() {
        return repository.findAll();
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }

    public Disciplina buscarPeloCodigo(Long id) {
        return repository.findById(id).orElse(null);
    }

}
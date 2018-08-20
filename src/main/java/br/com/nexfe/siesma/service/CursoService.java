package br.com.nexfe.siesma.service;

import br.com.nexfe.siesma.entidades.Curso;
import br.com.nexfe.siesma.repositorios.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoRepository repository;

    public Curso salvar(Curso curso) {
        return repository.saveAndFlush(curso);
    }

    public List<Curso> listaTodos() {
        return repository.findAll();
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }

    public Curso buscarPeloCodigo(Long id) {
        return repository.findById(id).orElse(null);
    }

}
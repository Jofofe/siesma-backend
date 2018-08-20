package br.com.nexfe.siesma.service;

import br.com.nexfe.siesma.entidades.Matricula;
import br.com.nexfe.siesma.repositorios.MatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaService {

    @Autowired
    private MatriculaRepository repository;

    public Matricula salvar(Matricula matricula) {
        return repository.saveAndFlush(matricula);
    }

    public List<Matricula> listaTodos() {
        return repository.findAll();
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }

    public Matricula buscarPeloCodigo(Long id) {
        return repository.findById(id).orElse(null);
    }

}
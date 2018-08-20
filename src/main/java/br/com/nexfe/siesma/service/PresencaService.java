package br.com.nexfe.siesma.service;

import br.com.nexfe.siesma.entidades.Presenca;
import br.com.nexfe.siesma.repositorios.PresencaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PresencaService {

    @Autowired
    private PresencaRepository repository;

    public Presenca salvar(Presenca presenca) {
        return repository.saveAndFlush(presenca);
    }

    public List<Presenca> listaTodos() {
        return repository.findAll();
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }

    public Presenca buscarPeloCodigo(Long id) {
        return repository.findById(id).orElse(null);
    }

}
package br.com.nexfe.siesma.service;

import br.com.nexfe.siesma.entidades.AvaliacaoNota;
import br.com.nexfe.siesma.repositorios.AvaliacaoNotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoNotaService {

    @Autowired
    private AvaliacaoNotaRepository repository;

    public AvaliacaoNota salvar(AvaliacaoNota avaliacaoNota) {
        return repository.saveAndFlush(avaliacaoNota);
    }

    public List<AvaliacaoNota> listaTodos() {
        return repository.findAll();
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }

    public AvaliacaoNota buscarPeloCodigo(Long id) {
        return repository.findById(id).orElse(null);
    }

}
package br.com.nexfe.siesma.service;

import br.com.nexfe.siesma.entidades.Avaliacao;
import br.com.nexfe.siesma.repositorios.AvaliacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoService {

    @Autowired
    private AvaliacaoRepository repository;

    public Avaliacao salvar(Avaliacao avaliacao) {
        return repository.saveAndFlush(avaliacao);
    }

    public List<Avaliacao> listaTodos() {
        return repository.findAll();
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }

    public Avaliacao buscarPeloCodigo(Long id) {
        return repository.findById(id).orElse(null);
    }

}
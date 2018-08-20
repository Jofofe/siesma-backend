package br.com.nexfe.siesma.service;

import br.com.nexfe.siesma.entidades.LancamentoComercial;
import br.com.nexfe.siesma.repositorios.LancamentoComercialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LancamentoComercialService {

    @Autowired
    private LancamentoComercialRepository repository;

    public LancamentoComercial salvar(LancamentoComercial lancamentoComercial) {
        return repository.saveAndFlush(lancamentoComercial);
    }

    public List<LancamentoComercial> listaTodos() {
        return repository.findAll();
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }

    public LancamentoComercial buscarPeloCodigo(Long id) {
        return repository.findById(id).orElse(null);
    }

}
package br.com.nexfe.siesma.service;

import br.com.nexfe.siesma.entidades.Desconto;
import br.com.nexfe.siesma.repositorios.DescontoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DescontoService {

    @Autowired
    private DescontoRepository repository;

    public Desconto salvar(Desconto desconto) {
        return repository.saveAndFlush(desconto);
    }

    public List<Desconto> listaTodos() {
        return repository.findAll();
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }

    public Desconto buscarPeloCodigo(Long id) {
        return repository.findById(id).orElse(null);
    }

}
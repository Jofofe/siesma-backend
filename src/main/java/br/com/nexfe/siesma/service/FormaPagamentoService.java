package br.com.nexfe.siesma.service;

import br.com.nexfe.siesma.entidades.FormaPagamento;
import br.com.nexfe.siesma.repositorios.FormaPagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormaPagamentoService {

    @Autowired
    private FormaPagamentoRepository repository;

    public FormaPagamento salvar(FormaPagamento formaPagamento) {
        return repository.saveAndFlush(formaPagamento);
    }

    public List<FormaPagamento> listaTodos() {
        return repository.findAll();
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }

    public FormaPagamento buscarPeloCodigo(Long id) {
        return repository.findById(id).orElse(null);
    }

}
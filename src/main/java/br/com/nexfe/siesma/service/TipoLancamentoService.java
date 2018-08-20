package br.com.nexfe.siesma.service;

import br.com.nexfe.siesma.entidades.TipoLancamento;
import br.com.nexfe.siesma.repositorios.TipoLancamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoLancamentoService {

    @Autowired
    private TipoLancamentoRepository repository;

    public TipoLancamento salvar(TipoLancamento tipoLancamento) {
        return repository.saveAndFlush(tipoLancamento);
    }

    public List<TipoLancamento> listaTodos() {
        return repository.findAll();
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }

    public TipoLancamento buscarPeloCodigo(Long id) {
        return repository.findById(id).orElse(null);
    }

}
package br.com.nexfe.siesma.service;

import br.com.nexfe.siesma.entidades.DescontoAplicado;
import br.com.nexfe.siesma.repositorios.DescontoAplicadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DescontoAplicadoService {

    @Autowired
    private DescontoAplicadoRepository repository;

    public DescontoAplicado salvar(DescontoAplicado descontoAplicado) {
        return repository.saveAndFlush(descontoAplicado);
    }

    public List<DescontoAplicado> listaTodos() {
        return repository.findAll();
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }

    public DescontoAplicado buscarPeloCodigo(Long id) {
        return repository.findById(id).orElse(null);
    }

}
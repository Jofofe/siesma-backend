package br.com.nexfe.siesma.service;

import br.com.nexfe.siesma.entidades.Modulo;
import br.com.nexfe.siesma.repositorios.ModuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModuloService {

    @Autowired
    private ModuloRepository repository;

    public Modulo salvar(Modulo modulo) {
        return repository.saveAndFlush(modulo);
    }

    public List<Modulo> listaTodos() {
        return repository.findAll();
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }

    public Modulo buscarPeloCodigo(Long id) {
        return repository.findById(id).orElse(null);
    }

}
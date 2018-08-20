package br.com.nexfe.siesma.service;

import br.com.nexfe.siesma.entidades.Empregado;
import br.com.nexfe.siesma.repositorios.EmpregadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpregadoService {

    @Autowired
    private EmpregadoRepository repository;

    public Empregado salvar(Empregado empregado) {
        return repository.saveAndFlush(empregado);
    }

    public List<Empregado> listaTodos() {
        return repository.findAll();
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }

    public Empregado buscarPeloCodigo(Long id) {
        return repository.findById(id).orElse(null);
    }

}
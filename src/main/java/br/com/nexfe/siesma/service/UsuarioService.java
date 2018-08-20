package br.com.nexfe.siesma.service;

import br.com.nexfe.siesma.entidades.Usuario;
import br.com.nexfe.siesma.repositorios.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public Usuario salvar(Usuario usuario) {
        return repository.saveAndFlush(usuario);
    }

    public List<Usuario> listaTodos() {
        return repository.findAll();
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }

    public Usuario buscarPeloCodigo(Long id) {
        return repository.findById(id).orElse(null);
    }

}
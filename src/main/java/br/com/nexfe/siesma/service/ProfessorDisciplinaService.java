package br.com.nexfe.siesma.service;

import br.com.nexfe.siesma.entidades.ProfessorDisciplina;
import br.com.nexfe.siesma.repositorios.ProfessorDisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorDisciplinaService {

    @Autowired
    private ProfessorDisciplinaRepository repository;

    public ProfessorDisciplina salvar(ProfessorDisciplina professorDisciplina) {
        return repository.saveAndFlush(professorDisciplina);
    }

    public List<ProfessorDisciplina> listaTodos() {
        return repository.findAll();
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }

    public ProfessorDisciplina buscarPeloCodigo(Long id) {
        return repository.findById(id).orElse(null);
    }

}
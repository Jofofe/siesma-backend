package br.com.nexfe.siesma.repositorios;

import br.com.nexfe.siesma.entidades.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {



}
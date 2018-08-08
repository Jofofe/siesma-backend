package br.com.nexfe.siesma.repositorios;

import br.com.nexfe.siesma.entidades.ProfessorDisciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorDisciplinaRepository extends JpaRepository<ProfessorDisciplina, Long> {

}

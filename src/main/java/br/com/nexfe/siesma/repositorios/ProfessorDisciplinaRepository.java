package br.com.nexfe.siesma.repositorios;

import br.com.nexfe.siesma.entidades.ProfessorDisciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ProfessorDisciplinaRepository extends JpaRepository<ProfessorDisciplina, Long> {

    @Query("select e from ProfessorDisciplina e where :dataAtual between e.dtInicio and e.dtFim "
            + " and :dataAtual between e.disciplina.dtInicio and e.disciplina.dtFim and :dataAtual between e.disciplina.modulo.dtInicio and e.disciplina.modulo.dtFim "
            + " and e.disciplina.modulo.curso.inExcluido = 'N' and e.empregado.dtFimVinculo is null order by e.disciplina.nome")
    List<ProfessorDisciplina> findAllAtivo(@Param("dataAtual") LocalDate dataAtual);


}

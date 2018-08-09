package br.com.nexfe.siesma.repositorios;

import br.com.nexfe.siesma.entidades.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {

    @Query("select e from Disciplina e order by e.nome")
    List<Disciplina> findAllOrdenado();

    @Query("select e from Disciplina e where :dataAtual between e.dtInicio and e.dtFim "
            + " and :dataAtual < e.modulo.dtFim and e.modulo.curso.inExcluido = 'N' order by e.nome")
    List<Disciplina> findAllAtivo(@Param("dataAtual") LocalDate dataAtual);

    @Query("select e from Disciplina e join e.professoresDisciplinas pd where "
            + "pd.empregado.idUsuario in (:idEmpregado) order by e.nome")
    List<Disciplina> findAllPorProfessor(@Param("idEmpregado") Long idEmpregado);

}
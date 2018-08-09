package br.com.nexfe.siesma.repositorios;

import br.com.nexfe.siesma.entidades.Modulo;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Repository
public interface ModuloRepository extends JpaRepository<Modulo, Long> {

    @Query("select e from Modulo e order by e.nome")
    List<Modulo> findAllOrdenado();

    @Query("select e from Modulo e where e.curso.inExcluido = 'N' "
            + "and :dataAtual < e.dtFim order by e.nome")
    List<Modulo> findAllAtivo(@Param("dataAtual") LocalDate dataAtual);

    @Query("select e from Modulo e where e.curso.idCurso = :idCurso "
            + "and :dataAtual < e.dtFim order by e.nome")
    List<Modulo> findAllPorCurso(@Param("idCurso") Long idCurso);

    @Query("select e from Modulo e join e.matriculas m where "
            + " m.aluno.idUsuario in (:idAluno) and :dataAtual < e.dtFim order by e.nome")
    List<Modulo> findAllPorMatriculados(@Param("idAluno") Long idCurso, @Param("dataAtual") LocalDate dataAtual);
}

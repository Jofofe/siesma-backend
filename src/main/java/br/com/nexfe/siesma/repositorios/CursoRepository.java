package br.com.nexfe.siesma.repositorios;

import br.com.nexfe.siesma.entidades.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {

    @Query("select e from Curso e order by e.nome")
    List<Curso> findAllOrdenado();

    @Query("select e from Curso e where e.inExcluido = 'N' order by e.nome")
    List<Curso> findAllAtivo();


    @Query("select e from Curso e join e.matriculas m where e.inExcluido = 'N' "
            + "and m.aluno.idUsuario in (:idAluno) order by e.nome")
    Curso findAluno(@Param("idAluno") Long idAluno);
	
}

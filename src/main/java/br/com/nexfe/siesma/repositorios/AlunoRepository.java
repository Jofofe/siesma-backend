package br.com.nexfe.siesma.repositorios;

import br.com.nexfe.siesma.entidades.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    @Query("select e from Aluno e order by e.nome")
    List<Aluno> findAllOrdenado();

    @Query("select e from Aluno e where e.dtFimVinculo is null order by e.nome")
    List<Aluno> findAllSemFimVinculo();
}
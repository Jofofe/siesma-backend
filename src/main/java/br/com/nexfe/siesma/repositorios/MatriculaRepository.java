package br.com.nexfe.siesma.repositorios;

import br.com.nexfe.siesma.entidades.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {

    @Query("select e from Matricula e where e.dtCancelamento is null"
            + " and e.dtFimEfetivo is null and e.aluno.dtFimVinculo is null order by e.aluno.nome")
    List<Matricula> findAllAtivo();

    @Query("select e from Matricula e order by e.aluno.nome")
    List<Matricula> findAllOrdenado();

}
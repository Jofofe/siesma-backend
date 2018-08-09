package br.com.nexfe.siesma.repositorios;

import br.com.nexfe.siesma.entidades.Empregado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpregadoRepository extends JpaRepository<Empregado, Long> {

    @Query("select e from Empregado e order by e.nome")
    List<Empregado> findAllOrdenado();

    @Query("select e from Empregado e where e.dtFimVinculo is null order by e.nome")
    List<Empregado> findAllAtivo();

    @Query("select e from Empregado e where e.funcao.idFuncao = 2 "
            + "and e.dtFimVinculo is null order by e.nome")
    List<Empregado> findAllProfessores();

}

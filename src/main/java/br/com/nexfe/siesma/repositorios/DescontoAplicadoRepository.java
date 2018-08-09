package br.com.nexfe.siesma.repositorios;

import br.com.nexfe.siesma.entidades.DescontoAplicado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface DescontoAplicadoRepository extends JpaRepository<DescontoAplicado, Long> {

    @Query("select e from DescontoAplicado e where e.aluno.dtFimVinculo is null "
            + "and :dataAtual between e.modulo.dtInicio and e.modulo.dtFim and :dataAtual between e.desconto.dtInicio and e.desconto.dtFim order by e.aluno.nome")
    List<DescontoAplicado> findAllAtivos(@Param("dataAtual") LocalDate dataAtual);

}

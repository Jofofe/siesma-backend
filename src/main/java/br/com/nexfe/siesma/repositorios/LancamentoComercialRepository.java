package br.com.nexfe.siesma.repositorios;

import br.com.nexfe.siesma.entidades.LancamentoComercial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface LancamentoComercialRepository extends JpaRepository<LancamentoComercial, Long> {

    @Query("select e from LancamentoComercial e where :dataAtual between e.formaPagamento.dtInicio and e.formaPagamento.dtFim "
            + " order by e.formaPagamento.nome")
    List<LancamentoComercial> findAllAtivo(@Param("dataAtual") LocalDate dataAtual);

    @Query("select e from LancamentoComercial e where e.matricula is null")
    List<LancamentoComercial> findAllEmpregados();

    @Query("select e from LancamentoComercial e where e.empregado is null")
    List<LancamentoComercial> findAllAlunos();

}
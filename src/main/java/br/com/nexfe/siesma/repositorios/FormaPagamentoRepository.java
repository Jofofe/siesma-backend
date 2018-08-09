package br.com.nexfe.siesma.repositorios;

import br.com.nexfe.siesma.entidades.FormaPagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface FormaPagamentoRepository extends JpaRepository<FormaPagamento, Long> {

    @Query("select e from FormaPagamento e where :dataAtual between e.dtInicio and e.dtFim order by e.nome")
    List<FormaPagamento> findAllAtivo(@Param("dataAtual") LocalDate dataAtual);

}
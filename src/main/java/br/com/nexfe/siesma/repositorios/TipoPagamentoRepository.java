package br.com.nexfe.siesma.repositorios;

import br.com.nexfe.siesma.entidades.TipoPagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TipoPagamentoRepository extends JpaRepository<TipoPagamento, Long> {

    @Query("select e from TipoPagamento e order by e.nomeTipoPagamento")
    List<TipoPagamento> findAllOrdenado();

}

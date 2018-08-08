package br.com.nexfe.siesma.repositorios;

import br.com.nexfe.siesma.entidades.TipoPagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoPagamentoRepository extends JpaRepository<TipoPagamento, Long> {

}

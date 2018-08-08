package br.com.nexfe.siesma.repositorios;

import br.com.nexfe.siesma.entidades.TipoLancamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoLancamentoRepository extends JpaRepository<TipoLancamento, Long> {

}

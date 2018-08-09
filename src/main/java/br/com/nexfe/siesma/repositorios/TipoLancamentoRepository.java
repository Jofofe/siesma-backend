package br.com.nexfe.siesma.repositorios;

import br.com.nexfe.siesma.entidades.TipoLancamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TipoLancamentoRepository extends JpaRepository<TipoLancamento, Long> {

    @Query("select e from TipoLancamento e where e.status = 'Ativo' order by e.descricao")
    List<TipoLancamento> findAllAtivoOrdenado();

    @Query("select e from TipoLancamento e order by e.descricao")
    List<TipoLancamento> findAllOrdenado();

}

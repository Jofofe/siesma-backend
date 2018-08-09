package br.com.nexfe.siesma.repositorios;

import br.com.nexfe.siesma.entidades.TipoAvaliacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TipoAvaliacaoRepository extends JpaRepository<TipoAvaliacao, Long> {

    @Query("select e from TipoAvaliacao e order by e.nomeAvaliacao")
    List<TipoAvaliacao> findAllOrdenado();

}

package br.com.nexfe.siesma.repositorios;

import br.com.nexfe.siesma.entidades.UnidadeMedida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UnidadeMedidaRepository extends JpaRepository<UnidadeMedida, Long> {

    @Query("select e from UnidadeMedida e order by e.nomeUnidadeMedida")
    List<UnidadeMedida> findAllOrdenado();

}

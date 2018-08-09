package br.com.nexfe.siesma.repositorios;

import br.com.nexfe.siesma.entidades.NivelAcesso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NivelAcessoRepository extends JpaRepository<NivelAcesso, Long> {

    @Query("select e from NivelAcesso e order by e.nomeAcesso")
    List<NivelAcesso> findAllOrdenado();

}

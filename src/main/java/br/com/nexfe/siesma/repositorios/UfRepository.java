package br.com.nexfe.siesma.repositorios;

import br.com.nexfe.siesma.entidades.Uf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UfRepository extends JpaRepository<Uf, Long> {

    @Query("select e from Uf e order by e.nomeUf")
    List<Uf> findAllOrdenado();

}

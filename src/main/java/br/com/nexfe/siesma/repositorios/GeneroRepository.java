package br.com.nexfe.siesma.repositorios;

import br.com.nexfe.siesma.entidades.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, Long> {

    @Query("select e from Genero e order by e.nomeGenero")
    List<Genero> findAllOrdenado();

}

package br.com.nexfe.siesma.repositorios;

import br.com.nexfe.siesma.entidades.Funcao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FuncaoRepository extends JpaRepository<Funcao, Long> {

    @Query("select e from Funcao e order by e.nomeFuncao")
    List<Funcao> findAllOrdenado();

}

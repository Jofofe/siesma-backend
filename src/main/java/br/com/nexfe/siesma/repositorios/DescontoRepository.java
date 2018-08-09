package br.com.nexfe.siesma.repositorios;

import br.com.nexfe.siesma.entidades.Desconto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface DescontoRepository extends JpaRepository<Desconto, Long> {

    @Query("select e from Desconto e where :dataAtual between e.dtInicio and e.dtFim order by e.nome")
    List<Desconto> findAllDescontoAtivo(@Param("dataAtual") LocalDate dataAtual);

}
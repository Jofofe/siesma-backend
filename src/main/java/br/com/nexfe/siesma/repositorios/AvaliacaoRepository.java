package br.com.nexfe.siesma.repositorios;

import br.com.nexfe.siesma.entidades.Avaliacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AvaliacaoRepository  extends JpaRepository<Avaliacao, Long> {

    @Query("select e from Avaliacao e where :dataAtual between e.disciplina.dtInicio and e.disciplina.dtFim "
            + " and :dataAtual between e.disciplina.modulo.dtInicio and e.disciplina.modulo.dtFim and e.disciplina.modulo.curso.inExcluido = 'N' order by e.disciplina.nome")
    List<Avaliacao> findAllModuloAtivo(@Param("dataAtual") LocalDate dataAtual);

    @Query("select distinct e from Avaliacao e INNER JOIN e.avaliacoesNotas an where :dataAtual between e.disciplina.dtInicio and e.disciplina.dtFim "
            + " and :dataAtual between e.disciplina.modulo.dtInicio and e.disciplina.modulo.dtFim and e.disciplina.modulo.curso.inExcluido = 'N'")
    List<Avaliacao> findAllComNota(@Param("dataAtual") LocalDate dataAtual);

}
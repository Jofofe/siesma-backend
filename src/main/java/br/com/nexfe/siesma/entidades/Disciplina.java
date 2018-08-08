package br.com.nexfe.siesma.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@NamedQueries(value = { 
		@NamedQuery(name="Disciplina.selectAll", query="select e from Disciplina e order by e.nome"),
		@NamedQuery(name="Disciplina.selectAllDate", query="select e from Disciplina e where :dataAtual between e.dtInicio and e.dtFim "
		+ " and :dataAtual < e.modulo.dtFim and e.modulo.curso.inExcluido = 'N' order by e.nome"),
		@NamedQuery(name="Disciplina.selectDisciplinasMagistradas", query="select e from Disciplina e join e.professoresDisciplinas pd where "
				+ "pd.empregado.idUsuario in (:idEmpregado) order by e.nome")
} )
@Table(name = "DISCIPLINA")
public class Disciplina implements Serializable {
	
	private static final long serialVersionUID = 742106924413082846L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_DISCIPLINA")
	private Long idDisciplina;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_MODULO")
	private Modulo modulo;
	
	@Column(name = "NOME_DISCIPLINA", length = 100, nullable = false)
	private String nome;
	
	@Column(name = "DT_INICIO", nullable = false)
	private Date dtInicio;
	
	@Column(name = "DT_FIM", nullable = false)
	private Date dtFim;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = ProfessorDisciplina.class, mappedBy="disciplina")
	private List<ProfessorDisciplina> professoresDisciplinas;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = Avaliacao.class, mappedBy="disciplina")
	private List<Avaliacao> avaliacoes;

}
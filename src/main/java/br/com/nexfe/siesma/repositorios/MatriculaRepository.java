package br.com.nexfe.siesma.repositorios;

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
		@NamedQuery(name="Matricula.selectAll", query="select e from Matricula e where e.dtCancelamento is null"
		+ " and e.dtFimEfetivo is null and e.aluno.dtFimVinculo is null order by e.aluno.nome"), 
		@NamedQuery(name="Matricula.selectAllNoDistinction", query="select e from Matricula e order by e.aluno.nome")	
})
@Table(name = "MATRICULA")
public class MatriculaRepository implements Serializable {
	
	private static final long serialVersionUID = 2751071098684390695L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_MATRICULA")
	private Long idMatricula;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_ALUNO")
	private Aluno aluno;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_CURSO")
	private CursoRepository curso;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_MODULO")
	private ModuloRepository modulo;
	
	@Column(name = "DT_MATRICULA", nullable = false)
	private Date dtMatricula;
	
	@Column(name = "DT_FIM_PREVISTO")
	private Date dtFimPrevisto;
	
	@Column(name = "DT_FIM_EFETIVA")
	private Date dtFimEfetivo;
	
	@Column(name = "DT_CANCELAMENTO")
	private Date dtCancelamento;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = LancamentoComercialRepository.class, mappedBy="matricula")
	private List<LancamentoComercialRepository> lancamentosComerciais;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = PresencaMatriculaRepository.class, mappedBy="matricula")
	private List<PresencaMatriculaRepository> presencasMatriculas;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = AvaliacaoNota.class, mappedBy="matricula")
	private List<AvaliacaoNota> avaliacoesNotas;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, 
			targetEntity = MatriculaDocumentoRepository.class, mappedBy="matricula")
	private List<MatriculaDocumentoRepository> matriculasDocumentos;
	
}
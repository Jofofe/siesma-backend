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
@Table(name = "MATRICULA")
public class Matricula implements Serializable {
	
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
	private Curso curso;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_MODULO")
	private Modulo modulo;
	
	@Column(name = "DT_MATRICULA", nullable = false)
	private Date dtMatricula;
	
	@Column(name = "DT_FIM_PREVISTO")
	private Date dtFimPrevisto;
	
	@Column(name = "DT_FIM_EFETIVA")
	private Date dtFimEfetivo;
	
	@Column(name = "DT_CANCELAMENTO")
	private Date dtCancelamento;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = LancamentoComercial.class, mappedBy="matricula")
	private List<LancamentoComercial> lancamentosComerciais;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = PresencaMatricula.class, mappedBy="matricula")
	private List<PresencaMatricula> presencasMatriculas;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = AvaliacaoNota.class, mappedBy="matricula")
	private List<AvaliacaoNota> avaliacoesNotas;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, 
			targetEntity = MatriculaDocumento.class, mappedBy="matricula")
	private List<MatriculaDocumento> matriculasDocumentos;
	
}
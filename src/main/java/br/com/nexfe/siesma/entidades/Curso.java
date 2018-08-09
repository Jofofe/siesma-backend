package br.com.nexfe.siesma.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "CURSO")
public class Curso implements Serializable {
	
	private static final long serialVersionUID = 5664191229458738516L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CURSO")
	private Long idCurso;
	
	@Column(name = "NOME_CURSO", length = 100, nullable = false)
	private String nome;
	
	@Column(name = "CARGA_HORARIA", nullable = false)
	private Integer cargaHoraria;
	
	@Column(name = "VALOR_CURSO", nullable = false)
	private BigDecimal valorCurso;
	
	@Column(name = "IN_EXCLUIDO", nullable = false)
	private String inExcluido;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_TURNO")
	private Turno turno;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = Modulo.class, mappedBy="curso")
	private List<Modulo> modulos;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = Matricula.class, mappedBy="curso")
	private List<Matricula> matriculas;
	
	@Column(name = "DT_INICIO", nullable = false)
	private Date dtInicio;
	
	@Column(name = "DT_FIM")
	private Date dtFim;
	
}

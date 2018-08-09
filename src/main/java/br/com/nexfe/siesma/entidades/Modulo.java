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
@Table(name = "MODULO")
public class Modulo implements Serializable {
	
	private static final long serialVersionUID = -1721700426616048551L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_MODULO")
	private Long idModulo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_CURSO")
	private Curso curso;
	
	@Column(name = "NOME_MODULO", length = 100, nullable = false)
	private String nome;
	
	@Column(name = "DT_INICIO", nullable = false)
	private Date dtInicio;
	
	@Column(name = "DT_FIM", nullable = false)
	private Date dtFim;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = Disciplina.class, mappedBy="modulo")
	private List<Disciplina> disciplinas;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = DescontoAplicado.class, mappedBy="modulo")
	private List<DescontoAplicado> descontosAplicados;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = Matricula.class, mappedBy="modulo")
	private List<Matricula> matriculas;

}

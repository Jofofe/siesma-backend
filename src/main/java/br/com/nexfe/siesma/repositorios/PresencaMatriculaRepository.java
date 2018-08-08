package br.com.nexfe.siesma.repositorios;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NamedQueries(value = { @NamedQuery(name="PresencaMatricula.selectAll", query="select e from PresencaMatricula e") } )
@Table(name = "PRESENCA_MATRICULA")
public class PresencaMatriculaRepository implements Serializable {
	
	static final long serialVersionUID = -5858676501460136026L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PRESENCA_MATRICULA")
	private Long idPresencaMatricula;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_PRESENCA")
	private PresencaRepository presenca;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_MATRICULA")
	private MatriculaRepository matricula;
	
	@Column(name = "PRESENCA_DIA", nullable = false)
	private boolean presencaDia;

}

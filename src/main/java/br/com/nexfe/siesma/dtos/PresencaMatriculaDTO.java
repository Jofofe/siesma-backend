package br.com.nexfe.siesma.dtos;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name = "PRESENCA_MATRICULA")
public class PresencaMatriculaDTO implements Serializable {
	
	static final long serialVersionUID = -5858676501460136026L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PRESENCA_MATRICULA")
	private Long idPresencaMatricula;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_PRESENCA")
	private PresencaDTO presencaDTO;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_MATRICULA")
	private MatriculaDTO matriculaDTO;
	
	@Column(name = "PRESENCA_DIA", nullable = false)
	private boolean presencaDia;

}

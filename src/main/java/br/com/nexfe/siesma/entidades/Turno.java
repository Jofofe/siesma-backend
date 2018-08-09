package br.com.nexfe.siesma.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "TURNO")
public class Turno implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_TURNO")
	private Long idTurno;
	
	@Column(name = "NOME_Turno")
	private String nomeTurno;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = Curso.class, mappedBy="turno")
	private List<Curso> cursos;

}

package br.com.nexfe.siesma.repositorios;

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
@NamedQueries(value = { @NamedQuery(name="Turno.selectAll", query="select e from Turno e order by e.nomeTurno") } )
@Table(name = "TURNO")
public class TurnoRepository implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_TURNO")
	private Long idTurno;
	
	@Column(name = "NOME_Turno")
	private String nomeTurno;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = CursoRepository.class, mappedBy="turno")
	private List<CursoRepository> cursos;

}

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
@NamedQueries(value = { @NamedQuery(name="Presenca.selectAll", query="select e from Presenca e") } )
@Table(name = "PRESENCA")
public class PresencaRepository implements Serializable {
	
	private static final long serialVersionUID = 7645164975625551773L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PRESENCA")
	private Long idPresenca;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_DISCIPLINA")
	private DisciplinaRepository disciplina;
	
	@Column(name = "DATA_PRESENCA", nullable = false)
	private Date dtPresenca;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, 
			targetEntity = PresencaMatriculaRepository.class, mappedBy="presenca")
	private List<PresencaMatriculaRepository> presencasMatriculas;

}
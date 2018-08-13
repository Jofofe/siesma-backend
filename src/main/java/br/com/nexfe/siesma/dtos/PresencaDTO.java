package br.com.nexfe.siesma.dtos;

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
@Table(name = "PRESENCA")
public class PresencaDTO implements Serializable {
	
	private static final long serialVersionUID = 7645164975625551773L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PRESENCA")
	private Long idPresenca;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_DISCIPLINA")
	private DisciplinaDTO disciplinaDTO;
	
	@Column(name = "DATA_PRESENCA", nullable = false)
	private Date dtPresenca;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, 
			targetEntity = PresencaMatriculaDTO.class, mappedBy="presencaDTO")
	private List<PresencaMatriculaDTO> presencasMatriculas;

}
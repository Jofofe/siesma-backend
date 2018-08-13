package br.com.nexfe.siesma.dtos;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "PROFESSOR_DISCIPLINA")
public class ProfessorDisciplinaDTO implements Serializable {
	
	private static final long serialVersionUID = -8680107554646482802L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PROFESSOR_DISCIPLINA")
	private Long idProfessorDisciplina;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_EMPREGADO")
	private EmpregadoDTO empregadoDTO;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_DISCIPLINA")
	private DisciplinaDTO disciplinaDTO;
	
	@Column(name = "DT_INICIO", nullable = false)
	private Date dtInicio;
	
	@Column(name = "DT_FIM", nullable = false)
	private Date dtFim;

}

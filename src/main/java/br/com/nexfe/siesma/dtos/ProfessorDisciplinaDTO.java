package br.com.nexfe.siesma.dtos;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

public class ProfessorDisciplinaDTO {

	private Long idProfessorDisciplina;

	private EmpregadoDTO empregadoDTO;

	private DisciplinaDTO disciplinaDTO;
	
	private Date dtInicio;
	
	private Date dtFim;

}

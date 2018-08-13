package br.com.nexfe.siesma.dtos;

import java.util.Date;

public class MatriculaDTO {

	private Long idMatricula;

	private AlunoDTO alunoDTO;

	private CursoDTO cursoDTO;

	private ModuloDTO moduloDTO;
	
	private Date dtMatricula;
	
	private Date dtFimPrevisto;
	
	private Date dtFimEfetivo;
	
	private Date dtCancelamento;
	
}
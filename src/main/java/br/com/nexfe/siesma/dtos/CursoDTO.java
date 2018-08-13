package br.com.nexfe.siesma.dtos;

import java.math.BigDecimal;
import java.util.Date;

public class CursoDTO {

	private Long idCurso;
	
	private String nome;
	
	private Integer cargaHoraria;
	
	private BigDecimal valorCurso;
	
	private String inExcluido;

	private TurnoDTO turnoDTO;

	private Date dtInicio;
	
	private Date dtFim;
	
}

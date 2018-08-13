package br.com.nexfe.siesma.dtos;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class MatriculaDTO {

	private Long idMatricula;

	private AlunoDTO alunoDTO;

	private CursoDTO cursoDTO;
	
	private ModuloDTO moduloDTO;
	
	@Column(name = "DT_MATRICULA", nullable = false)
	private Date dtMatricula;
	
	@Column(name = "DT_FIM_PREVISTO")
	private Date dtFimPrevisto;
	
	@Column(name = "DT_FIM_EFETIVA")
	private Date dtFimEfetivo;
	
	@Column(name = "DT_CANCELAMENTO")
	private Date dtCancelamento;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = LancamentoComercialDTO.class, mappedBy="matriculaDTO")
	private List<LancamentoComercialDTO> lancamentosComerciais;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = PresencaMatriculaDTO.class, mappedBy="matriculaDTO")
	private List<PresencaMatriculaDTO> presencasMatriculas;

	@OneToMany(fetch = FetchType.LAZY, targetEntity = AvaliacaoNotaDTO.class, mappedBy="matriculaDTO")
	private List<AvaliacaoNotaDTO> avaliacoesNotas;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true,
			targetEntity = MatriculaDocumentoDTO.class, mappedBy="matriculaDTO")
	private List<MatriculaDocumentoDTO> matriculasDocumentos;
	
}
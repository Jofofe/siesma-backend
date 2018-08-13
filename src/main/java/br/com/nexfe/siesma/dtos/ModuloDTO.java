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
@Table(name = "MODULO")
public class ModuloDTO implements Serializable {
	
	private static final long serialVersionUID = -1721700426616048551L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_MODULO")
	private Long idModulo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_CURSO")
	private CursoDTO cursoDTO;
	
	@Column(name = "NOME_MODULO", length = 100, nullable = false)
	private String nome;
	
	@Column(name = "DT_INICIO", nullable = false)
	private Date dtInicio;
	
	@Column(name = "DT_FIM", nullable = false)
	private Date dtFim;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = DisciplinaDTO.class, mappedBy="moduloDTO")
	private List<DisciplinaDTO> disciplinaDTOS;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = DescontoAplicadoDTO.class, mappedBy="moduloDTO")
	private List<DescontoAplicadoDTO> descontosAplicados;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = MatriculaDTO.class, mappedBy="moduloDTO")
	private List<MatriculaDTO> matriculaDTOS;

}

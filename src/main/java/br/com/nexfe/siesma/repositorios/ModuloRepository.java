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
@NamedQueries(value = { 
		@NamedQuery(name="Modulo.selectAll", query="select e from Modulo e order by e.nome") ,
		@NamedQuery(name="Modulo.selectAllDate", query="select e from Modulo e where e.curso.inExcluido = 'N' "
		+ "and :dataAtual < e.dtFim order by e.nome") ,
		@NamedQuery(name="Modulo.selectModulosCurso", query="select e from Modulo e where e.curso.idCurso = :idCurso "
				+ "and :dataAtual < e.dtFim order by e.nome") ,
		@NamedQuery(name="Modulo.selectModulosMatriculados", query="select e from Modulo e join e.matriculas m where "
				+ " m.aluno.idUsuario in (:idAluno) and :dataAtual < e.dtFim order by e.nome")
} )
@Table(name = "MODULO")
public class ModuloRepository implements Serializable {
	
	private static final long serialVersionUID = -1721700426616048551L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_MODULO")
	private Long idModulo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_CURSO")
	private CursoRepository curso;
	
	@Column(name = "NOME_MODULO", length = 100, nullable = false)
	private String nome;
	
	@Column(name = "DT_INICIO", nullable = false)
	private Date dtInicio;
	
	@Column(name = "DT_FIM", nullable = false)
	private Date dtFim;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = DisciplinaRepository.class, mappedBy="modulo")
	private List<DisciplinaRepository> disciplinas;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = DescontoAplicadoRepository.class, mappedBy="modulo")
	private List<DescontoAplicadoRepository> descontosAplicados;

	@OneToMany(fetch = FetchType.LAZY, targetEntity = MatriculaRepository.class, mappedBy="modulo")
	private List<MatriculaRepository> matriculas;

}

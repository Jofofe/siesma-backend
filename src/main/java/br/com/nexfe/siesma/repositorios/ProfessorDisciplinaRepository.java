package br.com.nexfe.siesma.repositorios;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NamedQueries(value = { @NamedQuery(name="ProfessorDisciplina.selectAllDate", query="select e from ProfessorDisciplina e where :dataAtual between e.dtInicio and e.dtFim "
		+ " and :dataAtual between e.disciplina.dtInicio and e.disciplina.dtFim and :dataAtual between e.disciplina.modulo.dtInicio and e.disciplina.modulo.dtFim "
		+ " and e.disciplina.modulo.curso.inExcluido = 'N' and e.empregado.dtFimVinculo is null order by e.disciplina.nome") } )
@Table(name = "PROFESSOR_DISCIPLINA")
public class ProfessorDisciplinaRepository implements Serializable {
	
	private static final long serialVersionUID = -8680107554646482802L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PROFESSOR_DISCIPLINA")
	private Long idProfessorDisciplina;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_EMPREGADO")
	private EmpregadoRepository empregadoRepository;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_DISCIPLINA")
	private DisciplinaRepository disciplina;
	
	@Column(name = "DT_INICIO", nullable = false)
	private Date dtInicio;
	
	@Column(name = "DT_FIM", nullable = false)
	private Date dtFim;

}

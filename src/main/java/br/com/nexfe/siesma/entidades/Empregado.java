package br.com.nexfe.siesma.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "EMPREGADO")
@PrimaryKeyJoinColumn(name="ID_EMPREGADO", referencedColumnName = "ID_USUARIO")
public class Empregado extends Usuario{

	private static final long serialVersionUID = 2128384515857966003L;
	
	@Column(name = "VALOR_HORA")
	private BigDecimal valorHora;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_FUNCAO")
	private Funcao funcao;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = ProfessorDisciplina.class, mappedBy="empregado")
	private List<ProfessorDisciplina> professoresDisciplinas;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = LancamentoComercial.class, mappedBy="empregado")
	private List<LancamentoComercial> lancamentosComerciais;

}

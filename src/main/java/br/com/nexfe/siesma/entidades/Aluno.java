package br.com.nexfe.siesma.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@NamedQueries(value = { 
		@NamedQuery(name="Aluno.selectAllNoDistinction", query="select e from Aluno e order by e.nome"),
		@NamedQuery(name="Aluno.selectAll", query="select e from Aluno e where e.dtFimVinculo is null order by e.nome")
} )
@Table(name = "ALUNO")
@PrimaryKeyJoinColumn(name="ID_ALUNO", referencedColumnName = "ID_USUARIO")
public class Aluno extends Usuario {

	private static final long serialVersionUID = 9005969662213209863L;
	
	@Column(name = "DT_NASCIMENTO", nullable = false)
	private Date dtNascimento;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_GENERO")
	private Genero genero;
	
	@Column(name = "NATURALIDADE", length = 20, nullable = false)
	private String naturalidade;
	
	@Column(name = "PROFISSAO", length = 20)
	private String profissao;
	
	@Column(name = "ENDERECO", length = 100, nullable = false)
	private String endereco;
	
	@Column(name = "BAIRRO", length = 50, nullable = false)
	private String bairro;
	
	@Column(name = "CIDADE", length = 50, nullable = false)
	private String cidade;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_UF")
	private Uf uf;
	
	@Column(name = "CEP", length = 20, nullable = false)
	private String cep;
	
	@Column(name = "TEL_RESID", length = 20)
	private String telResidencia;
	
	@Column(name = "TEL_COMERCIAL", length = 20)
	private String telComercial;
	
	@Column(name = "IES_GRADUACAO", length = 50, nullable = false)
	private String iesGraduacao;
	
	@Column(name = "NOME_PAI", length = 100, nullable = false)
	private String nomePai;
	
	@Column(name = "NOME_MAE", length = 100, nullable = false)
	private String nomeMae;
	
	@Column(name = "CURSO_GRADUACAO", length = 50)
	private String cursoGraduacao;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = Matricula.class, mappedBy="aluno")
	private List<Matricula> matriculas;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = DescontoAplicado.class, mappedBy="aluno")
	private List<DescontoAplicado> descontosAplicados;

}
package br.com.nexfe.siesma.repositorios;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@NamedQueries(value = { @NamedQuery(name="Funcao.selectAll", query="select e from Funcao e order by e.nomeFuncao") } )
@Table(name = "FUNCAO")
public class FuncaoRepository implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_FUNCAO")
	private Long idFuncao;
	
	@Column(name = "NOME_FUNCAO")
	private String nomeFuncao;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = EmpregadoRepository.class, mappedBy="funcao")
	private List<EmpregadoRepository> empregadoRepositories;

}

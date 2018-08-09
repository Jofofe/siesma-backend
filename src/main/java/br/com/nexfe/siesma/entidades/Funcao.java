package br.com.nexfe.siesma.entidades;

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
@Table(name = "FUNCAO")
public class Funcao implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_FUNCAO")
	private Long idFuncao;
	
	@Column(name = "NOME_FUNCAO")
	private String nomeFuncao;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = Empregado.class, mappedBy="funcao")
	private List<Empregado> empregados;

}

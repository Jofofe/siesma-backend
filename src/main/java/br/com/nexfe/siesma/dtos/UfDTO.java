package br.com.nexfe.siesma.dtos;

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
@Table(name = "UF")
public class UfDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_UF")
	private Long idUf;
	
	@Column(name = "NOME_UF")
	private String nomeUf;
	
	@Column(name = "SG_UF")
	private String sgUf;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = AlunoDTO.class, mappedBy="ufDTO")
	private List<AlunoDTO> alunoDTOS;

}

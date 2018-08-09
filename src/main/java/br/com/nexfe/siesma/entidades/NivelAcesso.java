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
@Table(name = "NIVEL_ACESSO")
public class NivelAcesso implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_NIVEL_ACESSO")
	private Long idNivelAcesso;
	
	@Column(name = "NOME_ACESSO")
	private String nomeAcesso;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = Usuario.class, mappedBy="nivelAcesso")
	private List<Usuario> usuarios;

}

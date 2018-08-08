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
@NamedQueries(value = { @NamedQuery(name="NivelAcesso.selectAll", query="select e from NivelAcesso e order by e.nomeAcesso") } )
@Table(name = "NIVEL_ACESSO")
public class NivelAcessoRepository implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_NIVEL_ACESSO")
	private Long idNivelAcesso;
	
	@Column(name = "NOME_ACESSO")
	private String nomeAcesso;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = UsuarioRepository.class, mappedBy="nivelAcesso")
	private List<UsuarioRepository> usuarios;

}

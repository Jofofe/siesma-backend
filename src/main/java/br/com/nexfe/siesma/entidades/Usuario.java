package br.com.nexfe.siesma.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "USUARIO")
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario implements Serializable {
	
	private static final long serialVersionUID = 2020574501561031630L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_USUARIO")
    private Long idUsuario;
	
	@Column(name = "NOME", length = 100, nullable = false)
	private String nome;
	
	@Column(name = "CPF", length = 15, nullable = false)
	private String cpf;
	
	@Column(name = "RG", length = 20, nullable = false)
	private String rg;
	
	@Column(name = "ORGAO_EXPEDITOR", length = 6, nullable = false)
	private String orgaoExpeditor;
	
	@Column(name = "EMAIL", length = 50, nullable = false)
	private String email;
	
	@Column(name = "TEL_CELULAR", length = 20, nullable = false)
	private String telCelular;
	
	@Column(name = "SENHA_USUARIO", length = 20, nullable = false)
	private String senha;
	
	@Column(name = "DT_CADASTRO", nullable = false)
	private Date dtCadastro;
	
	@Column(name = "DT_FIM_VINCULO")
	private Date dtFimVinculo;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_NIVEL_ACESSO")
	private NivelAcesso nivelAcesso;
	
}

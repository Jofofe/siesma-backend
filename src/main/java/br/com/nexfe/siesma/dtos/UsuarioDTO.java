package br.com.nexfe.siesma.dtos;

import java.util.Date;

public class UsuarioDTO{

    private Long idUsuario;
	
	private String nome;
	
	private String cpf;
	
	private String rg;
	
	private String orgaoExpeditor;
	
	private String email;
	
	private String telCelular;
	
	private String senha;
	
	private Date dtCadastro;
	
	private Date dtFimVinculo;

	private NivelAcessoDTO nivelAcessoDTO;
	
}

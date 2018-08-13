package br.com.nexfe.siesma.dtos;

import java.util.Date;

public class FormaPagamentoDTO {

	private Long idFormaPagamento;
	
	private String nome;

	private ClassePagamentoDTO classePagamentoDTO;
	
	private Integer qtdParcelas;
	
	private Date dtInicio;
	
	private Date dtFim;
	
}
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
@NamedQueries(value = { @NamedQuery(name="ClassePagamento.selectAll", query="select e from ClassePagamento e order by e.nomeClassePagamento") } )
@Table(name = "CLASSE_PAGAMENTO")
public class ClassePagamento implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_CLASSE_PAGAMENTO")
	private Long idClassePagamento;
	
	@Column(name = "NOME_CLASSE_PAGAMENTO")
	private String nomeClassePagamento;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = FormaPagamento.class, mappedBy="classePagamento")
	private List<FormaPagamento> formasPagamento;

}

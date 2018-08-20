package br.com.nexfe.siesma.mapper;

import br.com.nexfe.siesma.dtos.TipoPagamentoDTO;
import br.com.nexfe.siesma.entidades.TipoPagamento;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel="spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TipoPagamentoMapper extends  BaseMapper<TipoPagamento, TipoPagamentoDTO>  {
}

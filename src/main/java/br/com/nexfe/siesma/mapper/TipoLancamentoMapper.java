package br.com.nexfe.siesma.mapper;

import br.com.nexfe.siesma.dtos.TipoLancamentoDTO;
import br.com.nexfe.siesma.entidades.TipoLancamento;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel="spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TipoLancamentoMapper extends  BaseMapper<TipoLancamento, TipoLancamentoDTO>  {
}

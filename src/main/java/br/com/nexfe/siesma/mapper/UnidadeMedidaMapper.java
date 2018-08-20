package br.com.nexfe.siesma.mapper;

import br.com.nexfe.siesma.dtos.UnidadeMedidaDTO;
import br.com.nexfe.siesma.entidades.UnidadeMedida;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel="spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UnidadeMedidaMapper extends  BaseMapper<UnidadeMedida, UnidadeMedidaDTO>  {
}

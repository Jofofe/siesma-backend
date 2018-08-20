package br.com.nexfe.siesma.mapper;

import br.com.nexfe.siesma.dtos.LancamentoComercialDTO;
import br.com.nexfe.siesma.entidades.LancamentoComercial;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel="spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface LancamentoComercialMapper extends  BaseMapper<LancamentoComercial, LancamentoComercialDTO>  {
}

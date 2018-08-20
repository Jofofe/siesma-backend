package br.com.nexfe.siesma.mapper;

import br.com.nexfe.siesma.dtos.FuncaoDTO;
import br.com.nexfe.siesma.entidades.Funcao;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel="spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface FuncaoMapper extends  BaseMapper<Funcao, FuncaoDTO>  {
}

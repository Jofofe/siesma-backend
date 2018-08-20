package br.com.nexfe.siesma.mapper;

import br.com.nexfe.siesma.dtos.UfDTO;
import br.com.nexfe.siesma.entidades.Uf;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel="spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UfMapper extends  BaseMapper<Uf, UfDTO>  {
}

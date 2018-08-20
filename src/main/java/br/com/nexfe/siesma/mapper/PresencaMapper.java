package br.com.nexfe.siesma.mapper;

import br.com.nexfe.siesma.dtos.PresencaDTO;
import br.com.nexfe.siesma.entidades.Presenca;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel="spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PresencaMapper extends  BaseMapper<Presenca, PresencaDTO>  {
}

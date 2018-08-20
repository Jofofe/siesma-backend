package br.com.nexfe.siesma.mapper;

import br.com.nexfe.siesma.dtos.TurnoDTO;
import br.com.nexfe.siesma.entidades.Turno;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel="spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TurnoMapper extends  BaseMapper<Turno, TurnoDTO>  {
}

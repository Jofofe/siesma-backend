package br.com.nexfe.siesma.mapper;

import br.com.nexfe.siesma.dtos.CursoDTO;
import br.com.nexfe.siesma.entidades.Curso;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel="spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CursoMapper extends  BaseMapper<Curso, CursoDTO>  {
}

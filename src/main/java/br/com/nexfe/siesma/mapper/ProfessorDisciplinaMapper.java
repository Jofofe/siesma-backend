package br.com.nexfe.siesma.mapper;

import br.com.nexfe.siesma.dtos.ProfessorDisciplinaDTO;
import br.com.nexfe.siesma.entidades.ProfessorDisciplina;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel="spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProfessorDisciplinaMapper extends  BaseMapper<ProfessorDisciplina, ProfessorDisciplinaDTO>  {
}

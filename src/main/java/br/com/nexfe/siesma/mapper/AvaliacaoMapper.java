package br.com.nexfe.siesma.mapper;

import br.com.nexfe.siesma.dtos.AvaliacaoDTO;
import br.com.nexfe.siesma.entidades.Avaliacao;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel="spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AvaliacaoMapper extends BaseMapper<Avaliacao, AvaliacaoDTO> {
}

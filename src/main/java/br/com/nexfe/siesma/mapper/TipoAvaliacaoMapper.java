package br.com.nexfe.siesma.mapper;

import br.com.nexfe.siesma.dtos.TipoAvaliacaoDTO;
import br.com.nexfe.siesma.entidades.TipoAvaliacao;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel="spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TipoAvaliacaoMapper extends  BaseMapper<TipoAvaliacao, TipoAvaliacaoDTO>  {
}

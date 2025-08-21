package br.com.casasbahia.crud_h2.controller.mapper;

import br.com.casasbahia.crud_h2.controller.dto.ProdutoRequest;
import br.com.casasbahia.crud_h2.controller.dto.ProdutoResponse;
import br.com.casasbahia.crud_h2.model.Produto;
import org.springframework.stereotype.Component;

@Component
public class ProdutoMapper {

    public Produto toEntity(ProdutoRequest dto) {
        Produto p = new Produto();
        p.setNome(dto.getNome());
        p.setNcm(dto.getNcm());
        p.setDescricaoNcm(dto.getDescricaoNcm());
        p.setPreco(dto.getPreco());
        p.setQuantidade(dto.getQuantidade());
        return p;
    }

    public ProdutoResponse toResponse(Produto produto) {
        ProdutoResponse dto = new ProdutoResponse();
        dto.setId(produto.getId());
        dto.setNome(produto.getNome());
        dto.setNcm(produto.getNcm());
        dto.setDescricaoNcm(produto.getDescricaoNcm());
        dto.setPreco(produto.getPreco());
        dto.setQuantidade(produto.getQuantidade());
        return dto;
    }
}

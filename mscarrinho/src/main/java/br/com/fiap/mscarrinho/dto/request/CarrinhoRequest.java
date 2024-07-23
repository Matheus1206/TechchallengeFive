package br.com.fiap.mscarrinho.dto.request;

import br.com.fiap.mscarrinho.model.Item;

public record CarrinhoRequest(Item itens, Double valor) {
}

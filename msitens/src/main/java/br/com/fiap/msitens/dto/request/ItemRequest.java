package br.com.fiap.msitens.dto.request;

import java.math.BigDecimal;

public record ItemRequest(String nome, String descricao, BigDecimal preco) {
}

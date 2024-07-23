package br.com.fiap.mscarrinho.model;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document
@Getter
public class Item {

    @Id
    private String id;

    private String nome;

    private String descricao;

    private BigDecimal preco;

    public Item() {
    }
}

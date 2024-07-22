package br.com.fiap.msitens.model;

import br.com.fiap.msitens.dto.request.ItemRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Item {

    @Id
    private String id;

    private String nome;

    private String descricao;

    private BigDecimal preco;


    public Item(ItemRequest itemRequest) {
        this.nome = itemRequest.nome();
        this.descricao = itemRequest.descricao();
        this.preco = itemRequest.preco();
    }
}

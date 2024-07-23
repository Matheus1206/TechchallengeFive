package br.com.fiap.mscarrinho.model;

import br.com.fiap.mscarrinho.dto.request.CarrinhoRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Carrinho {

    @Id
    private String id;

    private List<Item> itens;

    private Double valor;

    public Carrinho(CarrinhoRequest carrinhoRequest) {
        this.itens.add(carrinhoRequest.itens());
        this.valor = carrinhoRequest.valor();
    }

    public void setItens(Item itens) {
        this.itens.add(itens);
    }
}

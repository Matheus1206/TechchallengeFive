package br.com.fiap.mscarrinho.controller;

import br.com.fiap.mscarrinho.model.Carrinho;
import br.com.fiap.mscarrinho.repository.CarrinhoRepository;
import br.com.fiap.mscarrinho.service.CarrinhoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/carrinho")
public class CarrinhoController {

    @Autowired
    private CarrinhoRepository carrinhoRepository;

    @Autowired
    private CarrinhoService carrinhoService;

    @PostMapping
    public ResponseEntity<Carrinho> criarCarrinho(){

        Carrinho carrinho = carrinhoService.criar();

        return ResponseEntity.status(201).body(carrinho);
    }

    @PostMapping("/{id}/item/{itemId}")
    public ResponseEntity<?> adicionarItem(@Valid @PathVariable String id, @PathVariable String itemId) {
        carrinhoService.cadastrarItem(itemId, id);

        return ResponseEntity.status(200).build();
    }
}

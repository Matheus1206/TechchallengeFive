package br.com.fiap.mscarrinho.repository;

import br.com.fiap.mscarrinho.model.Carrinho;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CarrinhoRepository extends MongoRepository<Carrinho, String> {

}

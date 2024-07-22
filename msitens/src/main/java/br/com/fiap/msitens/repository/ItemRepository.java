package br.com.fiap.msitens.repository;

import br.com.fiap.msitens.model.Item;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ItemRepository extends MongoRepository<Item, String> {
}

package br.com.fiap.mscarrinho.client;

import br.com.fiap.mscarrinho.model.Item;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "item-service", url = "http://localhost:8082/api/v1/item")
public interface ServiceItensClient {

    @GetMapping("/{id}")
    ResponseEntity<Item> retornarUmItem(@PathVariable String id);

}

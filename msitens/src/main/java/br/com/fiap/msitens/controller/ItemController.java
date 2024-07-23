package br.com.fiap.msitens.controller;

import br.com.fiap.msitens.dto.request.ItemRequest;
import br.com.fiap.msitens.model.Item;
import br.com.fiap.msitens.service.ItemService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping
    public void cadastrar(@Valid @RequestBody ItemRequest itemRequest){
        itemService.cadastrarItem(itemRequest);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> retornarUmItem(@PathVariable String id) {
        Item item = itemService.retornarItem(id);

        return ResponseEntity.status(200).body(item);
    }
}

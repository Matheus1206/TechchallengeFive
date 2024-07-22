package br.com.fiap.msitens.controller;

import br.com.fiap.msitens.dto.request.ItemRequest;
import br.com.fiap.msitens.service.ItemService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping
    public void cadastrar(@Valid @RequestBody ItemRequest itemRequest){
        itemService.cadastrarItem(itemRequest);
    }
}

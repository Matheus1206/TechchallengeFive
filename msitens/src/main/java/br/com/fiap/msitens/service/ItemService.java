package br.com.fiap.msitens.service;

import br.com.fiap.msitens.dto.request.ItemRequest;
import br.com.fiap.msitens.model.Item;
import br.com.fiap.msitens.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public void cadastrarItem(ItemRequest itemRequest){
        itemRepository.save(new Item(itemRequest));
    }

    public Item retornarItem(String id) {
        return itemRepository.findById(id).get();
    }
}

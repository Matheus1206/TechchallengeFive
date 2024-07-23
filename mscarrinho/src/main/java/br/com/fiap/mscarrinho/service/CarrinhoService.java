package br.com.fiap.mscarrinho.service;

import br.com.fiap.mscarrinho.client.ServiceItensClient;
import br.com.fiap.mscarrinho.model.Carrinho;
import br.com.fiap.mscarrinho.model.Item;
import br.com.fiap.mscarrinho.repository.CarrinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarrinhoService {

    @Autowired
    private ServiceItensClient serviceItensClient;

    @Autowired
    private CarrinhoRepository carrinhoRepository;

    public Carrinho criar() {
        Carrinho carrinho = new Carrinho();
        carrinhoRepository.save(carrinho);
        return carrinho;
    }

    public void cadastrarItem(String carrinhoId, String itemId){
        Item item = serviceItensClient.retornarUmItem(itemId).getBody();

        Carrinho carrinho = carrinhoRepository.findById(carrinhoId).get();

        carrinho.setItens(item);

        carrinhoRepository.save(carrinho);
    }
}

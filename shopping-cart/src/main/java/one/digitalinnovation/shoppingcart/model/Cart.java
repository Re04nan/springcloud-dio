package one.digitalinnovation.shoppingcart.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.ArrayList;
import java.util.List;

@RedisHash("cart")
public class Cart {

    @Id
    private Long id;

    List<Item> itens;

    public Cart() {
        this.itens = new ArrayList<>();
    }

    public Cart(Long id) {
        this();
        this.id = id;
    }

    public void addItem(Item item) {
        this.itens.add(item);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens.addAll(itens);
    }
}

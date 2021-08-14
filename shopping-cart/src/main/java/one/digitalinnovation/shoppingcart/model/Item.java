package one.digitalinnovation.shoppingcart.model;

import org.springframework.data.redis.core.RedisHash;


@RedisHash("item")
public class Item {

    private Long itemId;
    private Integer amount;

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}

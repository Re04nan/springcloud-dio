package one.digitalinnovation.shoppingcart.repository;

import one.digitalinnovation.shoppingcart.model.Cart;
import org.springframework.data.repository.CrudRepository;


public interface CartRepository extends CrudRepository<Cart, Long> {
}

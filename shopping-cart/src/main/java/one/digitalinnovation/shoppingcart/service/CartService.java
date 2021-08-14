package one.digitalinnovation.shoppingcart.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

import one.digitalinnovation.shoppingcart.model.Cart;
import one.digitalinnovation.shoppingcart.model.Item;
import one.digitalinnovation.shoppingcart.repository.CartRepository;


@Service
public class CartService {

    private CartRepository cartRepository;

    @Autowired
    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public Cart addItem(Long id,Item item) {
        Optional<Cart> optionalCart = cartRepository.findById(id);

        Cart cart = optionalCart.isEmpty()
                ? new Cart(id)
                : optionalCart.get();

        cart.addItem(item);

        return cartRepository.save(cart);
    }

    public Cart findById(Long id) throws Exception {
        Optional<Cart> optionalCart = cartRepository.findById(id);

        if(optionalCart.isEmpty()) {
            throw new Exception("Cart not found!");
        }

        return optionalCart.get();
    }

    public Cart deleteById(@PathVariable Long id) throws Exception {
        Optional<Cart> optionalCart = cartRepository.findById(id);

        if(optionalCart.isEmpty()) {
            throw new Exception("Cart not found!");
        }

        Cart deletedCart = optionalCart.get();
        cartRepository.deleteById(id);

        return deletedCart;

    }

}

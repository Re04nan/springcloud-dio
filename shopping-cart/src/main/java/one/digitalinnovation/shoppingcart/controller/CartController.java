package one.digitalinnovation.shoppingcart.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import one.digitalinnovation.shoppingcart.model.Cart;
import one.digitalinnovation.shoppingcart.model.Item;
import one.digitalinnovation.shoppingcart.service.CartService;


@RestController
@RequestMapping(path = "/cart")
public class CartController {

    private CartService cartService;

    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @PostMapping(path = "/{id}")
    public Cart addItem(
            @PathVariable Long id,
            @RequestBody Item item) {

        return cartService.addItem(id, item);
    }

    @GetMapping(path = "/{id}")
    public Cart findById(@PathVariable Long id) throws Exception {
        return cartService.findById(id);
    }

    @DeleteMapping(path = "/{id}")
    public Cart deleteById(@PathVariable Long id) throws Exception {
        return cartService.deleteById(id);
    }
}

package one.digitalinnovation.productcatalog.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import one.digitalinnovation.productcatalog.model.Product;
import one.digitalinnovation.productcatalog.repository.ProductRepository;

import java.util.Optional;


@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(method = RequestMethod.POST)
    Product createProduct(@RequestBody final Product product) {
        return productRepository.save(product);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    Optional<Product> findById(@PathVariable final Long id) {
        return productRepository.findById(id);
    }
}

package one.digitalinnovation.productcatalog.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import one.digitalinnovation.productcatalog.model.Product;


public interface ProductRepository extends ElasticsearchRepository<Product, Long> {

}

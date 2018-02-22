package com.viet.le.springboot.controller;

import com.viet.le.springboot.model.Product;
import com.viet.le.springboot.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by associate on 2/21/18.
 */
@RestController
@RequestMapping(path = "/api/products/")
public class ProductsController {

    private ProductRepository productRepository;

    @Autowired
    public void productRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @RequestMapping(path = "{id}", method = RequestMethod.GET)
    public Product getProduct(@PathVariable(name = "id") String id) {
        return productRepository.findOne(id);
    }

}

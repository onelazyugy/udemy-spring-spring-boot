package com.viet.le.springboot.controller;

import com.viet.le.springboot.exception.CustomException;
import com.viet.le.springboot.model.Product;
import com.viet.le.springboot.repository.ProductRepository;
import com.viet.le.springboot.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by associate on 2/21/18.
 */
@RestController
@RequestMapping(path = "/api/products/")
public class ProductsController {

    private Logger LOG = LoggerFactory.getLogger(ProductsController.class);
    private ProductService productService;
    //setter injection of productService
    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(path = "{id}", method = RequestMethod.GET)
    public Product getProduct(@PathVariable(name = "id") String id) {
        return this.productService.getProduct(id);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Product saveProduct(@RequestBody Product product) {
        return this.productService.saveProduct(product);
    }

    @RequestMapping(path="{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Product updateProduct(@RequestBody Product productToUpdate, @PathVariable(name = "id") String id) {
        return this.productService.updateProduct(productToUpdate, id);
    }

    @RequestMapping(path = "{id}", method = RequestMethod.DELETE)
    public void deleteProduct(@PathVariable(name = "id") String id) {
        this.productService.deleteProduct(id);
    }

    @RequestMapping(path = "test", method = RequestMethod.GET)
    public void test() {
        throw new NullPointerException("null");
    }

    @RequestMapping(path = "custom", method = RequestMethod.GET)
    public void custom() throws CustomException {
        throw new CustomException("custom exception", "CUSTOM");
    }
}

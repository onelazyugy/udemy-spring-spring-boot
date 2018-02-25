package com.viet.le.springboot.service;

import com.viet.le.springboot.model.Product;
import com.viet.le.springboot.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by VTL on 2/22/18.
 */
@Service
public class ProductService {
    private Logger LOG = LoggerFactory.getLogger(ProductService.class);
    private ProductRepository productRepository;
    //setter inject of productRepository
    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product getProduct(String id) {
        LOG.info("Getting the product with given id:" + id);
        return this.productRepository.findOne(id);
    }

    public Product saveProduct(Product product) {
        Product productToSave;
        try{
            LOG.info("Saving product...");
            productToSave = this.productRepository.save(product);
            return productToSave;
        } catch (Exception e) {
            LOG.error("An error occurred during product saving:" + e.getMessage());
        }
        return new Product();
    }

    public Product updateProduct(Product productToUpdate, String id) {
        Product foundProduct = this.productRepository.findOne(id);
        try{
            foundProduct.setName(productToUpdate.getName());
            foundProduct.setDescription(productToUpdate.getDescription());
            foundProduct.setType(productToUpdate.getType());
            foundProduct.setCategory(productToUpdate.getCategory());
            return this.productRepository.save(foundProduct);
        }catch (Exception e) {
            LOG.error("An error occurred during update of product:" + e.getMessage());
        }
        return productToUpdate;
    }

    public void deleteProduct(String id) {
        try{
            this.productRepository.delete(id);
        }catch (Exception e) {
            LOG.error("An error occurred during deleting of product:" + e.getMessage());
        }
    }
}

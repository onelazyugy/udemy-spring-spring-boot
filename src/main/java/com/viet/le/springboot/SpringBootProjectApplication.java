package com.viet.le.springboot;

import com.viet.le.springboot.model.Product;
import com.viet.le.springboot.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringBootProjectApplication implements CommandLineRunner{

	private ProductRepository productRepository;

	//setter inject of productRepository
	@Autowired
	public void productRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProjectApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {

		Product testProduct = new Product();
		testProduct.setName("Simple Product");
		testProduct.setDescription("This is a tester product");
		testProduct.setType("CUSTOM");
		testProduct.setCategory("SPECIAL");

		productRepository.save(testProduct);

	}
}
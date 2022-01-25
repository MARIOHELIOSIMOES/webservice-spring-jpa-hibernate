package com.simoes.webspring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simoes.webspring.entities.Product;
import com.simoes.webspring.services.ProductService;

@RestController
@RequestMapping(value="/products")
public class ProductResource {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product> list = productService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		Product product = productService.findById(id);
		return ResponseEntity.ok().body(product);
	}

}

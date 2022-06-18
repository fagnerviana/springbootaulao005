package com.devsupeior.springbootaulao005.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.devsupeior.springbootaulao005.entities.Product;
import com.devsupeior.springbootaulao005.repositories.ProductRepository;

@RestController
@RequestMapping(value="/products")
public class ProductResource {
	
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product> list = productRepository.findAll();
		
		//list.add(new Category(1L,"Eletronics"));
		//list.add(new Category(2L,"Books"));
		//list.add(new Category(3L,"Saude"));
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Product> bunscarPeloId(@PathVariable Long id){
		//Testando linha de comandos  
		//Category cat = new Category(1L,"Eletronics");
		
		Product prod = productRepository.findById(id);
		return ResponseEntity.ok().body(prod);
	}
	

}

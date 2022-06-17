package com.devsupeior.springbootaulao005.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsupeior.springbootaulao005.entities.Category;
import com.devsupeior.springbootaulao005.repositories.CategoryRepository;

@RestController
@RequestMapping(value="/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> list = categoryRepository.findAll();
		
		//list.add(new Category(1L,"Eletronics"));
		//list.add(new Category(2L,"Books"));
		//list.add(new Category(3L,"Saude"));
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Category> bunscarPeloId(@PathVariable Long id){
		//Testando linha de comandos  
		//Category cat = new Category(1L,"Eletronics");
		
		Category cat = categoryRepository.findById(id);
		return ResponseEntity.ok().body(cat);
	}
	
	
}

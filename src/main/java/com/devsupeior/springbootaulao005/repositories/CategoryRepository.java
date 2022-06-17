package com.devsupeior.springbootaulao005.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;
import com.devsupeior.springbootaulao005.entities.Category;

@Component
public class CategoryRepository {
	
	//criando metodo para realizar o teste em memoria para testes 
	private Map<Long, Category> map =new HashMap<>();
	
		
	public void save(Category obj) {
		map.put(obj.getId(), obj);
	}
	
	public Category findById(Long id) {
		return map.get(id);
	}
	
	public List<Category> findAll(){
		return new ArrayList<Category>(map.values());
	}
	
}

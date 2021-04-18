package co.edu.digital.app.model.repository;

import org.springframework.data.repository.CrudRepository;

import co.edu.digital.app.model.entity.User;

public interface UserRepository extends CrudRepository<User,Integer>{
	
	public User findByEmailAndPassword(String email,String password); 
		
	
	
	
}

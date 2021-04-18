package co.edu.digital.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.digital.app.model.entity.User;
import co.edu.digital.app.model.repository.UserRepository;
import co.edu.digital.app.service.iface.UserService;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void create(User user) {
		
		
	}
	
	@Override
	public User login(User user) throws Exception{
		User existsUser=userRepository.findByEmailAndPassword(user.getEmail(), user.getPassword());
	 
		if(existsUser==null) {
			throw new Exception("usuario o contraseña invalida");
			
		}
	return existsUser;
	}
	
	
}

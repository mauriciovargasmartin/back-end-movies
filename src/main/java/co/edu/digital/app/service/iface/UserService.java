package co.edu.digital.app.service.iface;

import co.edu.digital.app.model.entity.User;

public interface UserService {

	/**
	 * crear usuario nuevo
	 * @param user
	 */
	
	public void create(User user);
	
	/**
	 * Loguea usuario
	 * @param user
	 * @return user 
	 * @throws Exception
	 */
	
	
	
	
	public User login(User user )throws Exception;
	
	
	
	
}

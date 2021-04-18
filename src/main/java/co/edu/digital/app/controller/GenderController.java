package co.edu.digital.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.digital.app.model.entity.Gender;
import co.edu.digital.app.service.iface.GenderService;

@RestController
@RequestMapping("/gender")
@CrossOrigin("*")
public class GenderController {
	
	@Autowired
	private GenderService genderService;
	
	@GetMapping
	public List<Gender> getAll(){
		return genderService.getAll();
		
	}

}

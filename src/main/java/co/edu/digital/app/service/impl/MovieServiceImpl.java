package co.edu.digital.app.service.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.digital.app.model.entity.Movie;
import co.edu.digital.app.model.repository.GenderRepository;
import co.edu.digital.app.model.repository.MovieRepository;
import co.edu.digital.app.service.iface.MovieService;


@Service
public class MovieServiceImpl implements MovieService {

	
	@Autowired
	private MovieRepository movieRepository;
	
	@Autowired
	private GenderRepository genderRepository;
	
	
	@Override
	public List<Movie> getAll() {
		List<Movie> movies = new ArrayList<>();
		movies = (List<Movie>) movieRepository.findAll();
		return movies;
	}
	
	

	@Override
	public void create(Movie movie) {
		
		boolean existsGender = genderRepository.existsById(movie.getGenderId().getId());
		
		if(existsGender) {
			movie.setCreateAt(LocalDateTime.now());
			movieRepository.save(movie);
		}
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void edit(Movie movie, int movieId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int movieId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rate(Movie movie, int movieId) {
		// TODO Auto-generated method stub
		
	}
	

}

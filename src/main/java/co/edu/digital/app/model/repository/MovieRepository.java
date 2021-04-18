package co.edu.digital.app.model.repository;

import org.springframework.data.repository.CrudRepository;

import co.edu.digital.app.model.entity.Movie;

public interface MovieRepository extends CrudRepository<Movie,Integer>{

}

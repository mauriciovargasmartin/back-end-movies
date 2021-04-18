package co.edu.digital.app.model.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "movie")
public class Movie implements Serializable {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "movie_id")
	private int id;
	private String name;
	private String description;
	private String image;
	@Column(name = "create_at")
	private LocalDateTime createAt;
	@Column(name="release_date")
	private LocalDate releaseDate;
	private String actors;
	@ManyToOne
	@JoinColumn(name ="gende_id")
	private Gender genderId;
	private int rating;
	
	public Movie() {
		 
	}
	
	public Movie(int id, String name, String description, String image, LocalDateTime createAt, LocalDate releaseDate,
			String actors, Gender genderId, int rating) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.image = image;
		this.createAt = createAt;
		this.releaseDate = releaseDate;
		this.actors = actors;
		this.genderId = genderId;
		this.rating = rating;
	}
	
	
}

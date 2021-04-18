package co.edu.digital.app.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="profile")

public class Profile implements Serializable{

	@Id
	@Column(name="profile_id")
	private int id;
	private String name;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param nombre the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}

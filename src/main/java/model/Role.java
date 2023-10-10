package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Eric Grabe - egrabe
 * CIS175 - Fall 2023
 * Oct 10, 2023
 */

@Entity(name = "role")
@Table(name = "role")
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roleId;
	
	private String charName;
	private String movieName;
	
	@ManyToOne
	@JoinColumn(name = "actorId", nullable=false)
	private Actor actor = new Actor();

	
	public Role() {
		super();
	}
	
	public Role(String charName, String movieName) {
		this.charName = charName;
		this.movieName = movieName;
	}

	/**
	 * @return the charName
	 */
	public String getCharName() {
		return charName;
	}

	/**
	 * @param charName the charName to set
	 */
	public void setCharName(String charName) {
		this.charName = charName;
	}

	/**
	 * @return the movieName
	 */
	public String getMovieName() {
		return movieName;
	}

	/**
	 * @param movieName the movieName to set
	 */
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
	
	
}

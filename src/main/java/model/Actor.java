package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Eric Grabe - egrabe
 * CIS175 - Fall 2023
 * Oct 10, 2023
 */

@Entity(name = "actor")
@Table(name = "actor")
public class Actor {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private String actorId;
		private String name;
		private String birthday;
		private String academyAwards;
		
		//each actor may have many roles
		@OneToMany(mappedBy = "actor", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
		private List<Role> roles;
		
		
		public Actor() {
			super();
		}
		
		public Actor(String name, String birthday, String academyAwards) {
			this.name= name;
			this.birthday = birthday;
			this.academyAwards = academyAwards;
			}

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		/**
		 * @return the actorId
		 */
		public String getActorId() {
			return actorId;
		}

		/**
		 * @param actorId the actorId to set
		 */
		public void setActorId(String actorId) {
			this.actorId = actorId;
		}

		/**
		 * @return the birthday
		 */
		public String getBirthday() {
			return birthday;
		}

		/**
		 * @param birthday the birthday to set
		 */
		public void setBirthday(String birthday) {
			this.birthday = birthday;
		}

		/**
		 * @return the academyAwards
		 */
		public String getAcademyAwards() {
			return academyAwards;
		}

		/**
		 * @param academyAwards the academyAwards to set
		 */
		public void setAcademyAwards(String academyAwards) {
			this.academyAwards = academyAwards;
		}

		/**
		 * @return the roles
		 */
		public List<Role> getRoles() {
			return roles;
		}

		/**
		 * @param roles the roles to set
		 */
		public void setRoles(List<Role> roles) {
			this.roles = roles;
		}

		
}

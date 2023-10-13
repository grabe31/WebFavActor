package controller.Helpers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import model.Actor;



/**
 * @author Eric Grabe - egrabe
 * CIS175 - Fall 2023
 * Oct 10, 2023
 */
public class ActorHelper {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("WebFavActor");

	public void persist(Actor model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(model);
		manager.getTransaction().commit();
		manager.close();
	}
	
	public void delete(Actor model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.remove(manager.find(Actor.class, model.getActorId()));
		manager.getTransaction().commit();
		manager.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Actor> showAllActors() {
		EntityManager manager = factory.createEntityManager();
		manager.clear();
		Query q = manager.createQuery("SELECT i FROM actor i");
		List<Actor> allItems = q.getResultList();
		manager.close();
		return allItems;
	}
	
	public void update(Actor model) {
		EntityManager manager = factory.createEntityManager();
		Actor dbEntity = manager.find(Actor.class, model.getActorId());
		manager.getTransaction().begin();
		dbEntity.setName(model.getName());
		dbEntity.setBirthday(model.getBirthday());
		dbEntity.setAcademyAwards(model.getAcademyAwards());
		manager.getTransaction().commit();
		manager.close();
	}
	
	public Actor searchActorByName(String name) {
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Actor> query = manager.createQuery("SELECT i FROM actor AS i WHERE i.name = :name", Actor.class);
		query.setParameter("name", name);
		System.out.println(name);
		Actor dbEntity;
		try {
			dbEntity = query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		} finally {
			manager.close();
		}
		return dbEntity;
	}
	
	
}

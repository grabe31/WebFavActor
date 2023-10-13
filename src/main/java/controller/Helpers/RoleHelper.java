package controller.Helpers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Role;

/**
 * @author Eric Grabe - egrabe
 * CIS175 - Fall 2023
 * Oct 10, 2023
 */
public class RoleHelper {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("WebFavActor");
	ActorHelper actorHelper = new ActorHelper();
	
	public void persist(Role model) {
		EntityManager manager = factory.createEntityManager();
		model.setActor(actorHelper.searchActorByName(model.getActor().getName()));
		manager.getTransaction().begin();
		manager.persist(model);
		manager.getTransaction().commit();
		manager.close();
	}
	
	public void delete(Role model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.remove(manager.find(Role.class, model.getRoleId()));
		manager.getTransaction().commit();
		manager.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Role> showAllRoles() {
		EntityManager manager = factory.createEntityManager();
		List<Role> allItems = manager.createQuery("SELECT i FROM role i").getResultList();
		manager.close();
		return allItems;
		
	}
	
	public void update(Role model) {
		EntityManager manager = factory.createEntityManager();
		model.setActor(actorHelper.searchActorByName(model.getActor().getName()));
		Role dbEntity = manager.find(Role.class, model.getRoleId());
		manager.getTransaction().begin();
		dbEntity.setCharName(model.getCharName());
		dbEntity.setMovieName(model.getMovieName());
		dbEntity.setActor(model.getActor());
		manager.getTransaction().commit();
		manager.close();
		
	}
	
	public Role searchRoleByName(String oldName) {
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Role> query = manager.createQuery("SELECT i FROM role AS i WHERE i.charName = :charName", Role.class);
		query.setParameter("heroName", oldName);
		Role dbEntity = query.getSingleResult();
		manager.close();
		return dbEntity;
	}
}

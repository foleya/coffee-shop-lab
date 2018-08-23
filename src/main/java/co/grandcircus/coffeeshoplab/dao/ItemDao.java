package co.grandcircus.coffeeshoplab.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.grandcircus.coffeeshoplab.entity.Item;

@Repository
@Transactional
public class ItemDao {

	@PersistenceContext
	private EntityManager em;

	public List<Item> findAll() {
		return em.createQuery("FROM Item ORDER BY name", Item.class).getResultList();

	}
	
	public List<Item> findByKeyword(String keyword) {
		return em.createQuery("FROM Item WHERE LOWER(name) LIKE :regex", Item.class)
				.setParameter("regex", "%" + keyword.toLowerCase() + "%")
				.getResultList();
	}
	
	public Item findById(int itemId) {
		return em.find(Item.class, itemId);
	}

	public void createItem(Item item) {
		em.persist(item);
	}
	
	public void update(Item item) {
		em.merge(item);
	}

	public void deleteItem(int itemId) {
		Item item = em.getReference(Item.class, itemId);
		em.remove(item);
	}

}

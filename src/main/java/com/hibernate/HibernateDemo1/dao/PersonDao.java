//package com.hibernate.HibernateDemo1.dao;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.TypedQuery;
//import javax.transaction.Transactional;
//
//import org.springframework.stereotype.Repository;
//
//import com.hibernate.HibernateDemo1.entity.Person;
//
//// this is technically known as a repository
//@Repository
//@Transactional // allows us to manage all of the transactions that take place in regards to the
//				// DB
//public class PersonDao {
//
//	@PersistenceContext // entities are stored in the persistence context and the EntityManager is an
//						// interface that manages this
//	EntityManager eManager; // allows us to manage all of the entities that we will interact with in our DB

//	// select * from customers
//	public List<Person> findAll() {
//		// we need to perform a typed query using JPQL for this task
//		TypedQuery<Person> namedQuery = eManager.createNamedQuery("find_all_persons", Person.class);
//		return namedQuery.getResultList(); // this allows us to get the list of results
//
//	}
//
//	public Person findById(int id) {
//		return eManager.find(Person.class, id); // JPA
//	}
//
//	// to update or insert we will use the merge method
//	// so therefore it will insert if the id doesn't exist in the table
//	// and we don't technically need another method that will do the same thing
//	public Person update(Person p) {
//		return eManager.merge(p);
//	}
//
//	// the remove method returns a void
//	public void deleteById(int id) {
//		Person p = findById(id); // we are using the findById method to find the person to delete
//		eManager.remove(p);
//	}
//
//}

package com.hibernate.HibernateDemo1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernate.HibernateDemo1.entity.Person;
// this is the best way to set up based on JPA standards
// update this later

public interface PersonSpringDataRepository extends JpaRepository<Person, Integer> {

}

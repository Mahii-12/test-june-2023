package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


import entity.Messages;

/**
 * 
 */
@Repository
public interface MessageRepo extends JpaRepository<Messages,Integer> {
	
	

}

package com.williapoletto.springbootkafka.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.williapoletto.springbootkafka.entity.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer>  {  
	
	
}  
	
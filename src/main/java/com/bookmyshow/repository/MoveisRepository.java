package com.bookmyshow.repository;

import com.bookmyshow.model.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoveisRepository extends JpaRepository<Movies,Integer> {
}

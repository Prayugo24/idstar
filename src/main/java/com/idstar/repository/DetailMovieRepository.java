package com.idstar.repository;


import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.idstar.model.entity.DetailMovie;

@Repository
public interface DetailMovieRepository extends JpaRepository<DetailMovie, Long> {
	
	
	
	public Optional<DetailMovie> findById(Long id);

	public Page<DetailMovie> findAll(Pageable pageable);

}

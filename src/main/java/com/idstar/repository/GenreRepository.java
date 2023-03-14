package com.idstar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.idstar.model.entity.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {
	
	@Query(nativeQuery = true, value = "SELECT id, slug, name_index, genre FROM genre_list WHERE name_index = :nameIndex")
	List<Genre> findByNameIndex(@Param("nameIndex") String nameIndex);

}

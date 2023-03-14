package com.idstar.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.idstar.model.dto.DetailMovieResponse;
import com.idstar.model.entity.DetailMovie;

public interface DetailMovieService {
	Optional<DetailMovieResponse> listDetailMovie() ;
	List<DetailMovieResponse> findAll();
}

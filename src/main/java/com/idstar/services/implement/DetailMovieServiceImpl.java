package com.idstar.services.implement;

import java.util.List;
import java.util.Optional;

import com.idstar.services.mapper.DetailMovieMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.idstar.model.dto.DetailMovieResponse;
import com.idstar.model.entity.DetailMovie;
import com.idstar.repository.DetailMovieRepository;
import com.idstar.services.interfaces.DetailMovieService;

@Service
public class DetailMovieServiceImpl implements DetailMovieService{

	@Autowired
	DetailMovieRepository detailMovieRepository;

	@Autowired
	DetailMovieMapper mapper;
	
	@Override
	public Optional<DetailMovieResponse> listDetailMovie() {
		
		Optional<DetailMovie> detailMovie = detailMovieRepository.findById(10L);
		return detailMovie.map(movie -> Optional.of(mapper.toDto(movie))).orElse(null);
	}

	@Override
	public List<DetailMovieResponse> findAll() {
		Pageable page = Pageable.ofSize(10);
		Page<DetailMovie> detailMovie = detailMovieRepository.findAll(page);


		return detailMovie.stream().map(movie -> mapper.toDto(movie)).collect(java.util.stream.Collectors.toList());
	}

}

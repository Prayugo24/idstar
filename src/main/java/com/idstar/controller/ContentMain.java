package com.idstar.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idstar.model.dto.DetailMovieResponse;
import com.idstar.model.dto.GenreReqBody;
import com.idstar.model.entity.DetailMovie;
import com.idstar.model.entity.Genre;
import com.idstar.services.interfaces.DetailMovieService;
import com.idstar.services.interfaces.GenreService;

@RestController
@RequestMapping("/content")
public class ContentMain {
	
	GenreService genreService;
	DetailMovieService detailMovieService;
	
	public ContentMain(GenreService genreService, DetailMovieService detailMovieService) {
		this.genreService = genreService;
		this.detailMovieService = detailMovieService;
	}



	@GetMapping("/genre")
	public List<Genre> getListGenre(@RequestBody GenreReqBody req) {
		return genreService.listGenre(req);
	}
	
	@GetMapping("/searchMovie")
	public Optional<DetailMovieResponse> listDetailMovie(){
		return detailMovieService.listDetailMovie();
	}

	@GetMapping("/")
	public List<DetailMovieResponse> detailMovies(){
		return detailMovieService.findAll();
	}

}

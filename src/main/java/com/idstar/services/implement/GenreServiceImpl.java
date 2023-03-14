package com.idstar.services.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idstar.model.dto.GenreReqBody;
import com.idstar.model.entity.Genre;
import com.idstar.repository.GenreRepository;
import com.idstar.services.interfaces.GenreService;

@Service
public class GenreServiceImpl implements GenreService {

	@Autowired
	GenreRepository genreRepository;
	
	@Override
	public List<Genre> listGenre(GenreReqBody request) {
		// TODO Auto-generated method stub
		if (request.getNameIndex() != null 
				&& !request.getNameIndex().isEmpty() 
				&& !request.getAllIndex()) {
			System.out.println(request.getNameIndex());
			return genreRepository.findByNameIndex(request.getNameIndex());	
		} 
	
		return genreRepository.findAll();
		
	}

}

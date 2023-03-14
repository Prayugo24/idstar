package com.idstar.services.interfaces;
import com.idstar.model.dto.GenreReqBody;
import com.idstar.model.entity.Genre;
import java.util.List;


public interface GenreService {
	List<Genre> listGenre(GenreReqBody body);
}

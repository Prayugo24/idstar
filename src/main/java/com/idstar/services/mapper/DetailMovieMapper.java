package com.idstar.services.mapper;

import com.idstar.model.dto.DetailMovieResponse;
import com.idstar.model.dto.ListEpisodeResponse;
import com.idstar.model.entity.ListEpisode;
import org.mapstruct.Mapper;

import com.idstar.model.entity.DetailMovie;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;


@Mapper(componentModel = "spring")
public interface DetailMovieMapper {
	DetailMovieMapper INSTANCE = Mappers.getMapper( DetailMovieMapper.class );
	@Mapping(source = "listEpisode", target = "episode")
	public DetailMovieResponse toDto(DetailMovie detailMovie);
	public DetailMovie toEntity(DetailMovieResponse detailMovieResponse);

	public List<ListEpisode> toEpisodeEntity(List<ListEpisodeResponse> episodeDTO);

	public List<ListEpisodeResponse> toEpisodeDTO(List<ListEpisode> episodeEntity);
}

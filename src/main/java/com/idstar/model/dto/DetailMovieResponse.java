package com.idstar.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class DetailMovieResponse {

	public long id;
	@JsonProperty("id_list_anime")
	public long idListAnime;
	public String title;
	public String image;
	public String genre;
	public String status;
	public String hariTayang;
	public Integer totalEpisode;
	public Integer votes;
	public Integer score;
	public Integer rating;
	public String synopsis;

	@JsonProperty("episodes")
	public List<ListEpisodeResponse> episode;
	
	
	
}

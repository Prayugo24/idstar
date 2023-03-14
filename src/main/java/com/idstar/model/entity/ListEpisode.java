package com.idstar.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="list_episode")
public class ListEpisode {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	public long id;
	
	@Column(name="id_detail_anime")
	public long idDetailMovie;
	
	
	@Column(name="slug")
	public String slug;
	
	@Column(name="episode")
	public String episode;
	
	

}

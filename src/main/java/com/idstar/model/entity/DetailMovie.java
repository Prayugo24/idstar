package com.idstar.model.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="detail_anime")
public class DetailMovie {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	public long id;
	
	@Column(name="id_list_anime")
	public long idListAnime;
	
	@Column(name="slug")
	public String slug;
	
	@Column(name="title")
	public String title;
	
	@Column(name="image")
	public String image;
	
	@Column(name="genre")
	public String genre;
	
	@Column(name="status")
	public String status;
	
	@Column(name="hari_tayang")
	public String hariTayang;
	
	@Column(name="episode_total")
	public Integer totalEpisode;
	
	@Column(name="votes")
	public Integer votes;
	
	@Column(name="score")
	public Integer score;
	
	@Column(name="rating")
	public Integer rating;
	
	@Column(name="synopsis")
	public String synopsis;
	
	@OneToMany(targetEntity = ListEpisode.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_detail_anime", referencedColumnName = "id")
	public List<ListEpisode> listEpisode;

}

package com.meuprojeto.JavaSpring.DTO;

import com.meuprojeto.JavaSpring.entities.Game;
import com.meuprojeto.JavaSpring.projections.GameMinProjection;

public class GameMinDTO {

	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;

	public GameMinDTO() {
	}

	public GameMinDTO(Game entity) {
		
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescriprion();
		
	}
	
	public GameMinDTO(GameMinProjection projection) {
		
		id = projection.getId();
		title = projection.getTitle();
		year = projection.getYear();
		imgUrl = projection.getImgUrl();
		shortDescription = projection.getShortDescriprion();
		
	}

	public Long getId() {
		return id;
	}


	public String getTitle() {
		return title;
	}


	public Integer getYear() {
		return year;
	}


	public String getImgUrl() {
		return imgUrl;
	}


	public String getShortDescription() {
		return shortDescription;
	}


}

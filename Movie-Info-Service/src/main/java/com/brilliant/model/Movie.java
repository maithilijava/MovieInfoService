package com.brilliant.model;

public class Movie {
	private String movieId;
	private String name;
	private String getOverview;
	
	public String getGetOverview() {
		return getOverview;
	}
	public void setGetOverview(String getOverview) {
		this.getOverview = getOverview;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getName() {
		return name;
	}
	public Movie(String movieId, String name, String getOverview) {
		super();
		this.movieId = movieId;
		this.name = name;
		this.getOverview = getOverview;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Movie(String movieId, String name) {
		super();
		this.movieId = movieId;
		this.name = name;
	}
	

}

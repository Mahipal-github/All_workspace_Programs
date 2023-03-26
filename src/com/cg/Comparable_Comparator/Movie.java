package com.cg.Comparable_Comparator;

public class Movie implements Comparable<Movie>{

	private String movieName;
	private double mrating;
	private long year;
	public Movie(String movieName, double mrating, long year) {
		super();
		this.movieName = movieName;
		this.mrating = mrating;
		this.year = year;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public double getMrating() {
		return mrating;
	}
	public void setMrating(double mrating) {
		this.mrating = mrating;
	}
	public long getYear() {
		return year;
	}
	public void setYear(long year) {
		this.year = year;
	}
	@Override
	public int compareTo(Movie o) {
		if (this.getMrating()>o.getMrating())
		return 1;
		else
			return -1;
	}
	
	
}

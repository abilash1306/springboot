package com.example.demo.model;

public class LocationStats {

	private String state;
	private String region;
	private int totalCases;
	private int diffFromPrevDay;
	
	
	public int getDiffFromPrevDay() {
		return diffFromPrevDay;
	}
	public void setDiffFromPrevDay(int diffFromPrevDay) {
		this.diffFromPrevDay = diffFromPrevDay;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public int getTotalCases() {
		return totalCases;
	}
	public void setTotalCases(int totalCases) {
		this.totalCases = totalCases;
	}
	@Override
	public String toString() {
		return "LocationStats [state=" + state + ", region=" + region + ", totalCases=" + totalCases
				+ ", diffFromPrevDay=" + diffFromPrevDay + "]";
	}
	
	
	
	
}

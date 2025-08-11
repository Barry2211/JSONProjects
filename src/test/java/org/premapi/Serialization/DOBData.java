package org.premapi.Serialization;

import java.util.List;

public class DOBData {
	
	private int day;
	private String month;
	private List<Integer> year;
	public int getDay() {
		return day;
	}
	public DOBData(int day, String month, List<Integer> year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public List<Integer> getYear() {
		return year;
	}
	public void setYear(List<Integer> year) {
		this.year = year;
	}
	
	
}

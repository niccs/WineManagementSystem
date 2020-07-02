package com.winery.codingChallange.wines.model;

import java.io.Serializable;

public class GrapeComponent implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double percentage;
	private int year;
	private String variety;
	private String region;

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof GrapeComponent))
			return false;
		if (obj == this)
			return true;
		return (this.getPercentage() == ((GrapeComponent) obj).getPercentage()
				&& this.getYear() == ((GrapeComponent) obj).getYear()
				&& this.getVariety() == ((GrapeComponent) obj).getVariety()
				&& this.getRegion() == ((GrapeComponent) obj).getRegion());
	}

	@Override
	public int hashCode() {
		int hash = 47;
		hash = 31 * hash + (int) percentage;
		hash = 31 * hash + (int) year;
		hash = 31 * hash + (region == null ? 0 : region.hashCode());
		hash = 31 * hash + (variety == null ? 0 : variety.hashCode());
		return hash;
	}

}

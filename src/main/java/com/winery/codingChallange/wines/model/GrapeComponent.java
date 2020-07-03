package com.winery.codingChallange.wines.model;

import java.io.Serializable;
import java.util.Objects;

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

		return Objects.hash(percentage, year, variety, region);
	}

}

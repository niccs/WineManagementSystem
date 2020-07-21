package com.winery.codingChallange.wines.service;

import java.util.List;
import java.util.Set;

import com.winery.codingChallange.wines.model.GrapeComponent;
import com.winery.codingChallange.wines.model.Wine;

public interface WineService {

	List<Wine> getWines();

	Wine getWine(String id);
	
	List<String>printYearBreakdown(Set<GrapeComponent>  components);
	List<String>printRegionBreakdown(Set<GrapeComponent>  components);
	List<String>printVarietyBreakdown(Set<GrapeComponent>  components);
	List<String>printYearAndVarietyBreakdown(Set<GrapeComponent>  components);
}

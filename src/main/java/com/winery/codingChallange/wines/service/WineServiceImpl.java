package com.winery.codingChallange.wines.service;

import java.io.InputStream;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

import com.winery.codingChallange.wines.model.GrapeComponent;
import com.winery.codingChallange.wines.model.Wine;

@ApplicationScoped
public class WineServiceImpl implements WineService {

	private final List<Wine> wines;

	public WineServiceImpl() {

		Jsonb jsonb = JsonbBuilder.create();

		Wine wine1 = null;
		Wine wine2 = null;
		Wine wine3 = null;
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		InputStream inputStream = externalContext.getResourceAsStream("/11YVCHAR001.json");
		wine1 = jsonb.fromJson(inputStream, Wine.class);
		inputStream = externalContext.getResourceAsStream("/11YVCHAR002.json");
		wine2 = jsonb.fromJson(inputStream, Wine.class);
		inputStream = externalContext.getResourceAsStream("/15MPPN002-VK.json");
		wine3 = jsonb.fromJson(inputStream, Wine.class);
		wines = new ArrayList<Wine>();
		wines.add(wine1);
		wines.add(wine2);
		wines.add(wine3);
	}

	@Override
	public List<Wine> getWines() {
		return wines;
	}

	@Override
	public Wine getWine(String lotId) {

		Optional<Wine> optional = wines.stream().filter(wine -> lotId.equals(wine.getLotCode())).findFirst();

		if (optional.isPresent()) {// Check whether optional has element you are looking for
			return optional.get();// get it from optional
		}
		return null;
	}

	public List<String> printYearBreakdown(Set<GrapeComponent> components) {

		// First step is to do grouping matching year as key and value as collector of double(adding percentage)
		Map<Integer, Double> grapeComponentsGroupedByYear = components.stream().collect(Collectors
				.groupingBy(GrapeComponent::getYear, Collectors.summingDouble(GrapeComponent::getPercentage)));
		
		// Do the reverse sorting and collect in a list
		List<String> printYearList = grapeComponentsGroupedByYear.entrySet().stream()
				.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				.map(e -> e.getKey() + "  -  " + e.getValue() + "%").collect(Collectors.toList());

		return printYearList;

	}

	@Override
	public List<String> printRegionBreakdown(Set<GrapeComponent> components) {
		
		// First step is to do grouping matching Region as key and value as collector of double(adding percentage)
		Map<String, Double> grapeComponentsGroupedByRegion = components.stream().collect(Collectors
				.groupingBy(GrapeComponent::getRegion, Collectors.summingDouble(GrapeComponent::getPercentage)));
		
		// Do the reverse sorting and collect in a list
		List<String> printRegionList = grapeComponentsGroupedByRegion.entrySet().stream()
				.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				.map(e -> e.getKey() + "  -  " + e.getValue() + "%").collect(Collectors.toList());


		return printRegionList;

	}

	@Override
	public List<String> printVarietyBreakdown(Set<GrapeComponent> components) {
		
		// First step is to do grouping matching variety as key and value as collector of double(adding percentage)
		Map<String, Double> grapeComponentsGroupedByVariety = components.stream().collect(Collectors
				.groupingBy(GrapeComponent::getVariety, Collectors.summingDouble(GrapeComponent::getPercentage)));

		// Do the reverse sorting and collect in a list
		List<String> printVarietyList = grapeComponentsGroupedByVariety.entrySet().stream()
				.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				.map(e -> e.getKey() + "  -  " + e.getValue() + "%").collect(Collectors.toList());

		return printVarietyList;
	}

	@Override
	public List<String> printYearAndVarietyBreakdown(Set<GrapeComponent> components) {
		
		//  First step is to do multi-level grouping matching year and variety and get map of maps
		Map<Integer, Map<String, Double>> grapeComponentsGroupedByYearAndVariety = components.stream().collect(
				Collectors.groupingBy(GrapeComponent::getYear, Collectors.groupingBy(GrapeComponent::getVariety,
						Collectors.summingDouble(GrapeComponent::getPercentage))));

		// Transforming Map of Maps to a simple map using flatmap to perform reverse sorting
		Map<String, Double> grapeComponentsByYearAndVariety = grapeComponentsGroupedByYearAndVariety.entrySet().stream()
				.flatMap(e -> e.getValue().entrySet().stream()
						.flatMap(v -> Stream.of(new SimpleEntry<>(e.getKey() + " - " + v.getKey(), v.getValue()))))
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue));
		
		// Do the reverse sorting and collect in a list
		List<String> printYearVarietyList = grapeComponentsByYearAndVariety.entrySet().stream()
				.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				.map(e -> e.getKey() + "  -  " + e.getValue() + "%").collect(Collectors.toList());

		return printYearVarietyList;
	}
}

;

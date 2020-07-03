package com.winery.codingChallange.wines.service;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import com.winery.codingChallange.wines.model.GrapeComponent;
import com.winery.codingChallange.wines.model.Wine;

public class WineTest {

	static Wine[] wines() {

		Wine wine1 = new Wine();
		Set<GrapeComponent> components1 = new HashSet<GrapeComponent>();
		Set<GrapeComponent> components2 = new HashSet<GrapeComponent>();
		Set<GrapeComponent> components3 = new HashSet<GrapeComponent>();
		wine1.setLotCode("11YVCHAR001");
		wine1.setVolume(1000);
		wine1.setDescription("2011 Yarra Valley Chardonnay");
		wine1.setTankCode("T25-01");
		wine1.setProductState("Ready for bottling");
		wine1.setOwnerName("YV Wines Pty Ltd");

		components1 = new HashSet<GrapeComponent>();

		GrapeComponent grapeComp5 = new GrapeComponent();
		grapeComp5.setYear(2011);
		grapeComp5.setRegion("Mornington");
		grapeComp5.setVariety("Pinot Noir");
		grapeComp5.setPercentage(5);
		components1.add(grapeComp5);

		GrapeComponent grapeComp6 = new GrapeComponent();
		grapeComp6.setYear(2011);
		grapeComp6.setRegion("Yara valley");
		grapeComp6.setVariety("Chardnoy");
		grapeComp6.setPercentage(80);
		components1.add(grapeComp6);

		GrapeComponent grapeComp7 = new GrapeComponent();
		grapeComp7.setYear(2010);
		grapeComp7.setRegion("Macdeon");
		grapeComp7.setVariety("Pinot Noir");
		grapeComp7.setPercentage(5);
		components1.add(grapeComp7);

		GrapeComponent grapeComp8 = new GrapeComponent();
		grapeComp8.setYear(2010);
		grapeComp8.setRegion("Macdeon");
		grapeComp8.setVariety("Chardnoy");
		grapeComp8.setPercentage(10);
		components1.add(grapeComp8);
		wine1.setComponents(components1);

		Wine wine2 = new Wine();
		wine2.setLotCode("11YVCHAR002");
		wine2.setVolume(5077.0);
		wine2.setDescription("");
		wine2.setTankCode("T25-06");
		wine2.setProductState("");
		wine2.setOwnerName("YV Wines P/L and Vintage Kerr Joint Venture");

		components2 = new HashSet<GrapeComponent>();

		GrapeComponent grapeComp1 = new GrapeComponent();
		grapeComp1.setYear(2011);
		grapeComp1.setRegion("Mornington");
		grapeComp1.setVariety("Pinot Noir");
		grapeComp1.setPercentage(5.0);
		components2.add(grapeComp1);

		GrapeComponent grapeComp2 = new GrapeComponent();
		grapeComp2.setYear(2011);
		grapeComp2.setRegion("Yara valley");
		grapeComp2.setVariety("Chardnoy");
		grapeComp2.setPercentage(80);
		components2.add(grapeComp2);

		GrapeComponent grapeComp3 = new GrapeComponent();
		grapeComp3.setYear(2010);
		grapeComp3.setRegion("Macdeon");
		grapeComp3.setVariety("Pinot Noir");
		grapeComp3.setPercentage(5);
		components2.add(grapeComp3);

		GrapeComponent grapeComp4 = new GrapeComponent();
		grapeComp4.setYear(2010);
		grapeComp4.setRegion("Macdeon");
		grapeComp4.setVariety("Chardnoy");
		grapeComp4.setPercentage(10);
		components2.add(grapeComp4);
		wine2.setComponents(components2);

		Wine wine3 = new Wine();
		wine3.setLotCode("15MPPN002-VK");
		wine3.setVolume(100000.0);
		wine3.setDescription("2015 Mornington Peninsula Pinot Noir - Vintage Kerr special batch");
		wine3.setTankCode("T100-03");
		wine3.setProductState("Filtered");
		wine3.setOwnerName("Vintage Kerr");

		components3 = new HashSet<GrapeComponent>();

		GrapeComponent grapeCom1 = new GrapeComponent();
		grapeCom1.setYear(2015);
		grapeCom1.setRegion("Mornington");
		grapeCom1.setVariety("Pinot Noir");
		grapeCom1.setPercentage(60.0);
		components3.add(grapeCom1);

		GrapeComponent grapeCom2 = new GrapeComponent();
		grapeCom2.setYear(2015);
		grapeCom2.setRegion("Yara valley");
		grapeCom2.setVariety("Pinot Noir");
		grapeCom2.setPercentage(2);
		components3.add(grapeCom2);

		GrapeComponent grapeCom3 = new GrapeComponent();
		grapeCom3.setYear(2014);
		grapeCom3.setRegion("Yara valley");
		grapeCom3.setVariety("Pinot Noir");
		grapeCom3.setPercentage(5);
		components3.add(grapeCom3);

		GrapeComponent grapeCom4 = new GrapeComponent();
		grapeCom4.setYear(2015);
		grapeCom4.setRegion("Yara valley");
		grapeCom4.setVariety("Merlot");
		grapeCom4.setPercentage(3);
		components3.add(grapeCom4);

		GrapeComponent grapeCom5 = new GrapeComponent();
		grapeCom5.setYear(2015);
		grapeCom5.setRegion("Mornington");
		grapeCom5.setVariety("Shiraz");
		grapeCom5.setPercentage(1);
		components1.add(grapeCom5);

		GrapeComponent grapeCom6 = new GrapeComponent();
		grapeCom6.setYear(2015);
		grapeCom6.setRegion("Macdeon");
		grapeCom6.setVariety("Zinfandel");
		grapeCom6.setPercentage(2);
		components3.add(grapeCom6);

		GrapeComponent grapeCom7 = new GrapeComponent();
		grapeCom7.setYear(2014);
		grapeCom7.setRegion("Port Phillip");
		grapeCom7.setVariety("Malbec");
		grapeCom7.setPercentage(2);
		components3.add(grapeCom7);

		GrapeComponent grapeCom8 = new GrapeComponent();
		grapeCom8.setYear(2014);
		grapeCom8.setRegion("Mornington");
		grapeCom8.setVariety("Pinot Noir");
		grapeCom8.setPercentage(10);
		components3.add(grapeCom8);

		GrapeComponent grapeCom9 = new GrapeComponent();
		grapeCom9.setYear(2015);
		grapeCom9.setRegion("Mornington");
		grapeCom9.setVariety("Pinot Noir");
		grapeCom9.setPercentage(10);
		components3.add(grapeCom9);

		GrapeComponent grapeCom10 = new GrapeComponent();
		grapeCom10.setYear(2013);
		grapeCom10.setRegion("Heathcote");
		grapeCom10.setVariety("Cabernet");
		grapeCom10.setPercentage(5);
		components3.add(grapeCom10);
		wine3.setComponents(components3);

		return new Wine[] { wine1, wine2, wine3 };
	}

	@DisplayName("printYearBreakdown test for sorting by percentage in descending order and a single record for each unique year")
	@ParameterizedTest(name = "#{index} - Test with Wine object {0}")
	@MethodSource("wines")
	public void printYearBreakdownTest(Wine wine) {
		WineServiceImpl wineService = new WineServiceImpl("value");
		List<String> value = wineService.printYearBreakdown(wine.getComponents());

		assertNotNull(value);
		assertNotNull(value.get(0));
		assertNotNull(value.get(1));
//		assertEquals(value.size(), 2);
		assertTrue(value.stream().map(s -> s.substring(0, 4)).distinct().count() == value.size());
//		assertEquals(value.get(0), "2011  -  85.0%");
//		assertEquals(value.get(1), "2010  -  15.0%");
		List<Integer> sortedList = value.stream().map(s -> Integer.parseInt(s.substring(s.length() - 5, s.length() - 3).trim()))
				.sorted(Collections.reverseOrder()).collect(Collectors.toList());
		List<Integer> valueList = value.stream().map(s -> Integer.parseInt(s.substring(s.length() - 5, s.length() - 3).trim()))
				.collect(Collectors.toList());
		assertTrue(valueList.equals(sortedList));

	}

	@DisplayName("printVarietyBreakdown test for sorting by percentage in descending order and a single record for each unique Variety")
	@ParameterizedTest(name = "#{index} - Test with Wine object {0}")
	@MethodSource("wines")
	public void printVarietyBreakdownTest(Wine wine) {
		WineServiceImpl wineService = new WineServiceImpl("value");
		List<String> value = wineService.printVarietyBreakdown(wine.getComponents());

		assertNotNull(value);
		assertNotNull(value.get(0));
		assertNotNull(value.get(1));
//		assertEquals(value.size(), 2);
		assertTrue(value.stream().map(s -> s.substring(0, 4)).distinct().count() == value.size());
//		assertEquals(value.get(0), "Chardnoy  -  90.0%");
//		assertEquals(value.get(1), "Pinot Noir  -  10.0%");
		List<Integer> sortedList = value.stream()
				.map(s -> Integer.parseInt(s.substring(s.length() - 5, s.length() - 3).trim()))
				.sorted(Collections.reverseOrder()).collect(Collectors.toList());
		List<Integer> valueList = value.stream()
				.map(s -> Integer.parseInt(s.substring(s.length() - 5, s.length() - 3).trim()))
				.collect(Collectors.toList());
		assertTrue(valueList.equals(sortedList));
	}

	@DisplayName("printRegionBreakdownTest test for sorting by percentage in descending order and a single record for each unique Region")
	@ParameterizedTest(name = "#{index} - Test with Wine object {0}")
	@MethodSource("wines")
	public void printRegionBreakdownTest(Wine wine) {
		WineServiceImpl wineService = new WineServiceImpl("value");
		List<String> value = wineService.printRegionBreakdown(wine.getComponents());

		assertNotNull(value);
		assertNotNull(value.get(0));
		assertNotNull(value.get(1));
		assertNotNull(value.get(2));
//		assertEquals(value.size(), 3);
		assertTrue(value.stream().map(s -> s.substring(0, 4)).distinct().count() == value.size());
//		assertEquals(value.get(0), "Yara valley  -  80.0%");
//		assertEquals(value.get(1), "Macdeon  -  15.0%");
//		assertEquals(value.get(2), "Mornington  -  5.0%");
		List<Integer> sortedList = value.stream()
				.map(s -> Integer.parseInt(s.substring(s.length() - 5, s.length() - 3).trim()))
				.sorted(Collections.reverseOrder()).collect(Collectors.toList());
		List<Integer> valueList = value.stream()
				.map(s -> Integer.parseInt(s.substring(s.length() - 5, s.length() - 3).trim()))
				.collect(Collectors.toList());
		assertTrue(valueList.equals(sortedList));

	}

	@DisplayName("printYearAndVarietyBreakdownTest test for sorting by percentage in descending order and a single record for each unique YearAndVariety")
	@ParameterizedTest(name = "#{index} - Test with Wine object {0}")
	@MethodSource("wines")
	public void printYearAndVarietyBreakdownTest(Wine wine) {
		WineServiceImpl wineService = new WineServiceImpl("value");
		List<String> value = wineService.printYearAndVarietyBreakdown(wine.getComponents());

		assertNotNull(value);
		assertNotNull(value.get(0));
		assertNotNull(value.get(1));
		assertNotNull(value.get(2));
		assertNotNull(value.get(3));
//		assertEquals(value.size(), 4);
		assertTrue(value.stream().map(s -> s.substring(0, 13)).distinct().count() == value.size());
//		assertEquals(value.get(0), "2011 - Chardnoy  -  80.0%");
//		assertEquals(value.get(1), "2010 - Chardnoy  -  10.0%");
//		assertEquals(value.get(2), "2010 - Pinot Noir  -  5.0%");
//		assertEquals(value.get(3), "2011 - Pinot Noir  -  5.0%");
		List<Integer> sortedList = value.stream()
				.map(s -> Integer.parseInt(s.substring(s.length() - 5, s.length() - 3).trim()))
				.sorted(Collections.reverseOrder()).collect(Collectors.toList());
		List<Integer> valueList = value.stream()
				.map(s -> Integer.parseInt(s.substring(s.length() - 5, s.length() - 3).trim()))
				.collect(Collectors.toList());
		assertTrue(valueList.equals(sortedList));

	}

}

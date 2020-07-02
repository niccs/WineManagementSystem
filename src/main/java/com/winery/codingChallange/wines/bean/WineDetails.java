package com.winery.codingChallange.wines.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.winery.codingChallange.wines.model.Wine;
import com.winery.codingChallange.wines.service.WineService;

@Named
@ViewScoped
public class WineDetails implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private WineService wineService;

    private String wineId;

    private Wine wine;
    
    private String selectedWineComponent;

    public String getSelectedWineComponent() {
		return selectedWineComponent;
	}

	public void setSelectedWineComponent(String selectedWineComponent) {
		this.selectedWineComponent = selectedWineComponent;
	}

	public String getWineId() {
        return wineId;
    }

    public void setWineId(String wineId) {
        this.wineId = wineId;
    }

    public void onload() {
    	wine = wineService.getWine(wineId);
    }

    public Wine getWine() {
        return wine;
    }
    
    public void ajaxListener(AjaxBehaviorEvent event) {
    	
    	
//        System.out.println(selectedWineComponent); 
//        System.out.println("------------------");
//        System.out.println(wineService.printYearBreakdown(wine.getComponents()));
//        
//        if("year".equals(selectedWineComponent)){
//        	wineService.printYearBreakdown(wine.getComponents());
//        }
//        else if("region".equals(selectedWineComponent)){
//        	wineService.printRegionBreakdown(wine.getComponents());
//        }else {
//        	wineService.printVarietyBreakdown(wine.getComponents());
//        }
        
    }
    public List<String> getCompositionData() {
    	
    	if("YEAR".equals(selectedWineComponent)){
    		return wineService.printYearBreakdown(wine.getComponents());
        }
        else if("REGION".equals(selectedWineComponent)){
        	return wineService.printRegionBreakdown(wine.getComponents());
        }else if("VARIETY".equals(selectedWineComponent)){
        	return wineService.printVarietyBreakdown(wine.getComponents());
        }else if("YEAR + VARIETY".equals(selectedWineComponent)){
        	return wineService.printYearAndVarietyBreakdown(wine.getComponents());
        }
        else {
        	return new ArrayList<String>();
        }
    }
    
   
}

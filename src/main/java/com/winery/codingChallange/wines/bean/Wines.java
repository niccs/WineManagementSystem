package com.winery.codingChallange.wines.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.winery.codingChallange.wines.model.Wine;
import com.winery.codingChallange.wines.service.WineService;

@Named
@RequestScoped
public class Wines {

    @Inject
    private WineService wineService;

    private List<Wine> allWines;

    @PostConstruct
    public void initialize() {
    	allWines = wineService.getWines();
    }

    public List<Wine> getAllWines() {
        return allWines;
    }
}

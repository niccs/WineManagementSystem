package com.winery.codingChallange.wines;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class Theme implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name = "light";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

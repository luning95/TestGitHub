package com.ldn.demo.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertiesPojo {
    @Value("${com.ldn.title}")
    public String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Value("${com.ldn.description}")
    public String description;
}

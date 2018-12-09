package com.duck2play.duck2play.Entity;


import org.glassfish.grizzly.http.util.TimeStamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String title;
    private String description;
    private TimeStamp datePublish;

    public Article() {
    }

    public Article(String title, String description, TimeStamp datePublish) {
        this.title = title;
        this.description = description;
        this.datePublish = datePublish;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TimeStamp getDatePublish() {
        return datePublish;
    }

    public void setDatePublish(TimeStamp datePublish) {
        this.datePublish = datePublish;
    }
}

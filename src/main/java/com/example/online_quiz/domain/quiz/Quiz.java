package com.example.online_quiz.domain.quiz;

import java.time.LocalDateTime;

public class Quiz {
    private Integer id;
    private String title;
    private String description;
    private LocalDateTime dateAdded;
    private Integer categoryId;

    public Quiz(Integer id, String title, String description, LocalDateTime dateAdded, Integer categoryId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dateAdded = dateAdded;
        this.categoryId = categoryId;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getDateAdded() {
        return dateAdded;
    }

    public Integer getCategoryId() {
        return categoryId;
    }
}

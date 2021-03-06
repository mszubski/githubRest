package com.springrest.githubrest.model;

public class TestModel {

    private final long id;
    private final String content;

    public TestModel(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}

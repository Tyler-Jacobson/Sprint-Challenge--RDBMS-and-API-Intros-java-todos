package com.lambdaschool.todos.models;

public class Todo {

    private long todoid;

    private String description;

    private boolean completed;

    private User userid;

    public Todo() {
    }

    public Todo(String description, boolean completed, User userid) {
        this.description = description;
        this.completed = completed;
        this.userid = userid;
    }

    public long getTodoid() {
        return todoid;
    }

    public void setTodoid(long todoid) {
        this.todoid = todoid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public User getUserid() {
        return userid;
    }

    public void setUserid(User userid) {
        this.userid = userid;
    }
}

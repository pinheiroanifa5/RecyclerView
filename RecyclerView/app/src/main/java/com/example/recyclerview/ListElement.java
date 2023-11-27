package com.example.recyclerview;

public class ListElement {
    private String color;
    private String name;
    private String status;

    public ListElement(String color, String name, String status) {
        this.color = color;
        this.name = name;
        this.status = status;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

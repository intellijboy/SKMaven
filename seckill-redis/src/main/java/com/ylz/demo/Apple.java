package com.ylz.demo;

/**
 * Created by liuburu on 2017/2/27.
 */
public class Apple {
    private int id;
    private String name;

    public Apple(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

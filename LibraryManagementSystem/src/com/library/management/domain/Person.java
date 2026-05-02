package com.library.management.domain;

public abstract class Person
{
    private String name;
    private String id;
    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }
    abstract public String getDetails();
    public String getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
}
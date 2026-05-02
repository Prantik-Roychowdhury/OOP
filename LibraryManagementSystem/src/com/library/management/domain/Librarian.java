package com.library.management.domain;

public class Librarian extends Person {

    private String employeeId;

    public Librarian(String name, String id, String employeeId) {
        super(name, id);
        this.employeeId = employeeId;
    }

    @Override
    public String getDetails() {
        return "Librarian: " + getName();
    }
}
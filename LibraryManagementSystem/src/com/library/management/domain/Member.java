package com.library.management.domain;

import java.util.ArrayList;
import java.util.List;

class Member extends Person
{
    private List<BookItem>borrowedItems = new ArrayList<>();
    private List<Reservation>reservations = new ArrayList<>();

    public Member(String name, String id)
    {
        super(name, id);
    }

    public void borrowItem(BookItem item)
    {
        borrowedItems.add(item);
    }
    public void returnItem(BookItem item)
    {
        borrowedItems.remove(item);
    }
    public void addReservation(Reservation r)
    {
        reservations.add(r);
    }
    @Override
    public String getDetails()
    {
        return "Member: "+getName();
    }
}
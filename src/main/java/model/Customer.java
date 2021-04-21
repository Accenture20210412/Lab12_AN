package model;

import java.util.Objects;

public class Customer {
    private String name;
    private String lastName;
    private String adress;
    private Trip trip;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name) && Objects.equals(lastName, customer.lastName) && Objects.equals(adress, customer.adress) && Objects.equals(trip, customer.trip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, adress, trip);
    }

    public Customer(String name, String lastName, String adress) {
        this.name = name;
        this.lastName = lastName;
        this.adress = adress;
    }

    public Customer(String name, String lastName, String adress, Trip trip) {
        this.name = name;
        this.lastName = lastName;
        this.adress = adress;
        this.trip = trip;
    }

    @Override
    public String toString() {
        return name + " " +
                lastName + ", adress: " +
                adress + ", trip: " +
                trip;
    }
}

package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TravelOffice {

    List<Customer> customers = new ArrayList<>();
    List<Trip> trips = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public boolean addTrip(Trip trip) {
        for(Trip tr : trips) {
            if(tr.getName().equals(trip.getName())) {
                return false;
            }
        }
        trips.add(trip);
        return true;
    }

    public void deleteCustomer(Customer customer) {
        customers = customers.stream()
                .filter(c -> !c.getLastName().equals(customer.getLastName()))
                .collect(Collectors.toList());
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public Optional<Trip> getTripByName(String name) {
        return trips.stream().filter(trip -> trip.getName().equals(name)).findFirst();
    }

    public List<Trip> getTripsAfterStartDate(LocalDate date) {
        return trips.stream().filter(trip -> trip.getStartOfTrip().isAfter(date)).collect(Collectors.toList());
    }

    public List<Trip> getTripsForDestination(String destiny) {
        return trips.stream().filter(trip -> trip.getDestiny().equals(destiny)).collect(Collectors.toList());
    }




    public String getCustomersInfo(){
        StringBuilder result = new StringBuilder();
        result.append("Klienci Biura: \n");
        for (Customer i : customers) {
            if(i != null) {
                result.append(i + "\n");
            }
        }
        return result.toString();
    }
}

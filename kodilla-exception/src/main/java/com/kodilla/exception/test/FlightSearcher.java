package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearcher {

    public String findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> destinations = new HashMap<>();

        String homeAirport = "Home airport";
        Flight flight1 = new Flight(homeAirport, "Airport 1");
        Flight flight2 = new Flight(homeAirport, "Airport 2");
        Flight flight3 = new Flight(homeAirport, "Airport 3");
        Flight flight4 = new Flight(homeAirport, "Airport 4");
        Flight flight5 = new Flight(homeAirport, "Airport 5");

        destinations.put(flight1.getArrivalAirport(), true);
        destinations.put(flight2.getArrivalAirport(), true);
        destinations.put(flight3.getArrivalAirport(), true);
        destinations.put(flight4.getArrivalAirport(), true);
        destinations.put(flight5.getArrivalAirport(), true);
        destinations.put("Airport 6", false);
        destinations.put("Airport 7", false);

        if(destinations.containsKey(flight.getArrivalAirport())) {
            return "Flight to " + flight.getArrivalAirport() + " found!";
        } else {
            throw new RouteNotFoundException();
        }
    }

    public static void main(String[] args) {
        FlightSearcher flightSearcher = new FlightSearcher();
        Flight testFlight = new Flight("A", "Airport A");

        try {
            System.out.println(flightSearcher.findFlight(testFlight));
        } catch (RouteNotFoundException e) {
            System.out.println("Destination not found.");
        } finally {
            System.out.println("Thank you for travelling with us.");
        }

        try {
            System.out.println(flightSearcher.findFlight(new Flight("B", "Airport 5")));
        } catch (RouteNotFoundException e) {
            System.out.println("Destination not found.");
        } finally {
            System.out.println("Thank you for travelling with us.");
        }
    }
}

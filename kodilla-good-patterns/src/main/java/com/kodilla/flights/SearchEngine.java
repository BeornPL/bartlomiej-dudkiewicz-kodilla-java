package com.kodilla.flights;

import java.util.ArrayList;
import java.util.List;

public class SearchEngine {
    public static List<Flight> searchFlightsFrom(Airport airport, FlightsList theList) {
        ArrayList<Flight> result = new ArrayList<>();
        theList.getFlightsList().stream()
                .filter(f -> f.getDepartureAirport().equals(airport))
                .forEach(result::add);
        return result;
    }

    public static List<Flight> searchFlightsTo(Airport airport, FlightsList theList) {
        ArrayList<Flight> result = new ArrayList<>();
        theList.getFlightsList().stream()
                .filter(f -> f.getArrivalAirport().equals(airport))
                .forEach(result::add);
        return result;
    }

    public static boolean seachConnectingFlight(Airport from, Airport via, Airport to, FlightsList theList) {
        ArrayList<Flight> result1 = new ArrayList<>();
        ArrayList<Flight> result2 = new ArrayList<>();

        theList.getFlightsList().stream()
                .filter(f -> f.getDepartureAirport().equals(from))
                .filter(f -> f.getArrivalAirport().equals(via))
                .forEach(result1::add);

        theList.getFlightsList().stream()
                .filter(f -> f.getDepartureAirport().equals(via))
                .filter(f -> f.getArrivalAirport().equals(to))
                .forEach(result2::add);

        if (!result1.isEmpty() && !result2.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}

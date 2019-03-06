package com.kodilla.flights;

public class FlightsListRetriever {
    FlightsList retrieve() {
        FlightsList flightsList = new FlightsList();

        Airport airport1 = new Airport("Warszawa", "WAW");
        Airport airport2 = new Airport("Krakow", "KRV");
        Airport airport3 = new Airport("Wroclaw", "WRO");
        Airport airport4 = new Airport("Gdansk", "GDA");
        Airport airport5 = new Airport("Katowice", "KAT");

        flightsList.getFlightsList().add(new Flight(airport1, airport2));
        flightsList.getFlightsList().add(new Flight(airport1, airport3));
        flightsList.getFlightsList().add(new Flight(airport1, airport5));
        flightsList.getFlightsList().add(new Flight(airport2, airport1));
        flightsList.getFlightsList().add(new Flight(airport2, airport3));
        flightsList.getFlightsList().add(new Flight(airport2, airport4));
        flightsList.getFlightsList().add(new Flight(airport3, airport2));
        flightsList.getFlightsList().add(new Flight(airport3, airport1));
        flightsList.getFlightsList().add(new Flight(airport4, airport2));
        flightsList.getFlightsList().add(new Flight(airport5, airport1));

        return flightsList;
    }
}

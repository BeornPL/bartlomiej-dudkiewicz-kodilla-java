package com.kodilla.flights;

public class Application {
    public static void main(String[] args) {
        FlightsListRetriever flightsListRetriever = new FlightsListRetriever();
        FlightsList flightsList = flightsListRetriever.retrieve();

        SearchProcessor.process(flightsList);
    }
}

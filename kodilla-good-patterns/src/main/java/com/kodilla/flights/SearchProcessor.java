package com.kodilla.flights;

public class SearchProcessor {
    public static void process(FlightsList flightsList) {
        System.out.println(SearchEngine.searchFlightsTo(new Airport("Warszawa","WAW"), flightsList));
        System.out.println(SearchEngine.searchFlightsFrom(new Airport("Katowice","KAT"), flightsList));
        System.out.println(SearchEngine.seachConnectingFlight(new Airport("Warszawa","WAW"), new Airport("Krakow","KRV"), new Airport("Gdansk","GDA"), flightsList));
    }
}

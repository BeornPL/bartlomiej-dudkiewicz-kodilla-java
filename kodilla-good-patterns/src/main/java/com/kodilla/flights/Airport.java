package com.kodilla.flights;

public class Airport {
    private String city;
    private String acronym;

    public Airport(String city, String acronym) {
        this.city = city;
        this.acronym = acronym;
    }

    public String getCity() {
        return city;
    }

    public String getAcronym() {
        return acronym;
    }

    @Override
    public String toString() {
        return "Airport{" + city + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Airport airport = (Airport) o;

        return acronym.equals(airport.acronym);
    }

    @Override
    public int hashCode() {
        int result = city != null ? city.hashCode() : 0;
        result = 31 * result + (acronym != null ? acronym.hashCode() : 0);
        return result;
    }
}

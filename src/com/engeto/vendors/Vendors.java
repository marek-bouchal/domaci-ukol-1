package com.engeto.vendors;

public class Vendors {
    public static void main(String[] args) {
        String firstName;
        String lastName;
        int contracts;
        int carrotSold;
        String city;
        String registrationNumber; // company car registration number
        double fuelConsumption; // of the company car; in litres per 100 km
        String ipAddress;

        firstName = "Bedrich";
        lastName = "Kalivoda";
        contracts = 200;
        carrotSold = 600;
        city="Brno";
        registrationNumber="2B3-1337";
        ipAddress = "127.0.0.1";

        int avarageSellPerContract=carrotSold/contracts;
        System.out.println("Averege sale per contract for " + firstName + " " + lastName + " is " + avarageSellPerContract + " tons of carrot.");
    }
}

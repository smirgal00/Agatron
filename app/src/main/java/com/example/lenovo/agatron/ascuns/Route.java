package com.example.lenovo.agatron.ascuns;

/**
 * Created by NewBest on 4/6/2017.
 */

public class Route {
    String[] cities;
    String[] times;
    String[] days;
    String company;

    public Route(String cities, String times, String timesDays, String company) {
        this.cities = cities.split("-");
        this.company = company.replace("_", " ");

        this.times = times.split("-");
        this.days = timesDays.split("-");
    }

    public String getFirstCity() {
        return this.cities[0];
    }

    public String getLastCity() {
        return this.cities[this.cities.length - 1];
    }

    public String[] getCities() {
        return this.cities.clone();
    }

    public String[] getTimes() {
        return this.times.clone();
    }

    public String[] getTimesDays() {
        return this.days.clone();
    }
}













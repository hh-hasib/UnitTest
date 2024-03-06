package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Represents a list of City objects and provides operations for managing the list.
 */
public class CityList {

    private List<City> cities = new ArrayList<>();

    /**
     * Adds a City object to the list.
     *
     * @param city The City object to add.
     * @throws IllegalArgumentException If the city already exists in the list.
     */
    public void addCity(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException("City already exists in the list.");
        }
        cities.add(city);
    }

    /**
     * Deletes a City object from the list.
     *
     * @param city The City object to delete.
     * @throws IllegalArgumentException If the city does not exist in the list.
     */
    public void deleteCity(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException("City does not exist in the list.");
        }
        cities.remove(city);
    }

    /**
     * Returns the total number of cities in the list.
     *
     * @return The total number of cities.
     */
    public int getCityCount() {
        return cities.size();
    }

    /**
     * Retrieves the list of cities, optionally sorted by either city name or province name.
     *
     * @param sortByCityName If true, the list will be sorted by city name; otherwise, it will be sorted by province name.
     * @return The sorted list of cities.
     */
    public List<City> getCities(boolean sortByCityName) {
        List<City> cityList = new ArrayList<>(cities);
        if (sortByCityName) {
            Collections.sort(cityList);
        } else {
            cityList.sort(Comparator.comparing(City::getProvinceName));
        }
        return cityList;
    }
}

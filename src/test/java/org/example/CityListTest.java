package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Tests for the CityList class.
 * Right Button Click->Go To->Test
 */
class CityListTest {

    @Test
    public void testDeleteCity() {
        CityList cityList = new CityList();
        City city1 = new City("City1", "Province1");
        City city2 = new City("City2", "Province2");
        cityList.addCity(city1);
        cityList.addCity(city2);

        assertEquals(2, cityList.getCityCount());
        cityList.deleteCity(city1);
        assertEquals(1, cityList.getCityCount());
    }

    @Test
    public void testDeleteCityException() {
        CityList cityList = new CityList();
        City city1 = new City("City1", "Province1");

        assertThrows(IllegalArgumentException.class, () -> cityList.deleteCity(city1));
    }

    @Test
    public void testGetCityCount() {
        CityList cityList = new CityList();
        City city1 = new City("City1", "Province1");
        City city2 = new City("City2", "Province2");

        assertEquals(0, cityList.getCityCount());
        cityList.addCity(city1);
        assertEquals(1, cityList.getCityCount());
        cityList.addCity(city2);
        assertEquals(2, cityList.getCityCount());
    }

    @Test
    void testSortByCityName() {
        CityList cityList = new CityList();
        City city1 = new City("CityB", "ProvinceB");
        City city2 = new City("CityA", "ProvinceA");
        City city3 = new City("CityC", "ProvinceA");

        cityList.addCity(city1);
        cityList.addCity(city2);
        cityList.addCity(city3);

        List<City> sortedCities = cityList.getCities(true);

        assertEquals("CityA", sortedCities.get(0).getCityName());
        assertEquals("CityB", sortedCities.get(1).getCityName());
        assertEquals("CityC", sortedCities.get(2).getCityName());
    }

    @Test
    void testSortByProvinceName() {
        CityList cityList = new CityList();
        City city1 = new City("CityB", "ProvinceB");
        City city2 = new City("CityA", "ProvinceA");
        City city3 = new City("CityC", "ProvinceC");

        cityList.addCity(city1);
        cityList.addCity(city2);
        cityList.addCity(city3);

        List<City> sortedCities = cityList.getCities(false);

        assertEquals("CityA", sortedCities.get(0).getCityName());
        assertEquals("CityB", sortedCities.get(1).getCityName());
        assertEquals("CityC", sortedCities.get(2).getCityName());
    }
}

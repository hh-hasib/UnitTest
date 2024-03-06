package org.example;

/**
 * Represents a city and its associated information.
 */
public class City implements Comparable<City> {
    private String cityName;
    private String provinceName;

    /**
     * Constructs a City object with the given city and province names.
     *
     * @param cityName     The name of the city.
     * @param provinceName The name of the province.
     */
    public City(String cityName, String provinceName) {
        this.cityName = cityName;
        this.provinceName = provinceName;
    }

    /**
     * Retrieves the name of the city.
     *
     * @return The city name.
     */
    public String getCityName() {
        return this.cityName;
    }

    /**
     * Retrieves the name of the province.
     *
     * @return The province name.
     */
    public String getProvinceName() {
        return this.provinceName;
    }

    /**
     * Compares this City object with another City based on city name.
     *
     * @param otherCity The City object to compare.
     * @return A negative integer, zero, or a positive integer as this City is less than, equal to, or greater than the specified City.
     */
    @Override
    public int compareTo(City otherCity) {
        return this.cityName.compareTo(otherCity.getCityName());
    }
}

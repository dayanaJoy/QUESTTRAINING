package com.quest.Weather;

public interface Weatheroperations {
    void addCityWeather(WeatherData weatherData);
    void updateWeather(String cityName, double temperature, int humidity, String condition);
    void displayWeatherByCity(String cityName);
    void displayAllCitiesWeather();
    void Findextremes();
    void Reports();
    void alerts();
}

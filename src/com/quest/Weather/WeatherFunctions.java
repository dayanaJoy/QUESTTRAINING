package com.quest.Weather;

import java.util.ArrayList;

public class WeatherFunctions implements Weatheroperations {
    private ArrayList<WeatherData> cities = new ArrayList<>();

    @Override
    public void addCityWeather(WeatherData weatherData) {
        cities.add(weatherData);
    }

    @Override
    public void updateWeather(String name, double temperature, int humidity, String condition) {
        for (int i = 0; i < cities.size(); i++) {
            WeatherData weather = cities.get(i);
            if (weather.getName().equalsIgnoreCase(name)) {
                weather.setTemp(temperature);
                weather.setHumidity(humidity);
                weather.setCondition(condition);
                break;
            }
        }
    }

    @Override
    public void displayWeatherByCity(String name) {
        for (int i = 0; i < cities.size(); i++) {
            WeatherData weather = cities.get(i);
            if (weather.getName().equalsIgnoreCase(name)) {
                weather.display();
                return;
            }
        }
        System.out.println("City not found.");
    }

    @Override
    public void displayAllCitiesWeather() {
        for (int i = 0; i < cities.size(); i++) {
            WeatherData weather = cities.get(i);
            weather.display();
        }
    }


    @Override
    public void Findextremes() {
        if (cities.isEmpty()) {
            System.out.println("No cities found");
        }

        WeatherData highestTempCity = cities.get(0);
        WeatherData lowestTempCity = cities.get(0);
        for (int i = 0; i < cities.size(); i++) {
            WeatherData weather = cities.get(i);
            if (weather.getTemp() > highestTempCity.getTemp()) {
                highestTempCity = weather;
            }
            if (weather.getTemp() < lowestTempCity.getTemp()) {
                lowestTempCity = weather;
            }
        }
        System.out.println("City with the Highest Temperature: " + highestTempCity.getName() + " (" + highestTempCity.getTemp() + "°C)");
        System.out.println("City with the Lowest Temperature: " + lowestTempCity.getName() + " (" + lowestTempCity.getTemp() + "°C)");
    }

    @Override
    public void Reports() {
        System.out.println("\nCities grouped by condition:");
        String[] conditions = {"Sunny", "Rainy", "Cloudy"};
        for (int i = 0; i <=conditions.length; i++) {
            String condition = conditions[i];
            System.out.print(condition + ": ");
            for (i = 0; i < cities.size(); i++) {
                WeatherData weather = cities.get(i);
                if (weather.getCondition().equalsIgnoreCase(condition)) {
                    System.out.print(weather.getName() + " ");
                }
                System.out.print(", ");
            }
        }

        double totalTemp = 0;
        for (int i = 0; i < cities.size(); i++) {
            WeatherData weather = cities.get(i);
            totalTemp += weather.getTemp();
        }
        double averageTemperature = totalTemp / cities.size();
        System.out.println("Average Temperature: " + averageTemperature + "°C");
    }

    @Override
    public void alerts() {
        for (int i = 0; i < cities.size(); i++) {
            WeatherData weather = cities.get(i);
            if (weather.getTemp() > 40) {
                System.out.println("Heatwave Alert: " + weather.getName() + " is experiencing extreme heat (" + weather.getTemp() + "°C)!");
            }
            if (weather.getHumidity() < 20) {
                System.out.println("Low Humidity Warning: " + weather.getName() + " has dangerously low humidity (" + weather.getHumidity() + "%)!");
            }
        }
    }
}


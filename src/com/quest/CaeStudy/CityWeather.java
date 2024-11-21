package com.quest.CaeStudy;

public class CityWeather extends WeatherData {
    public CityWeather(String name, double temp, double humidity, String condition) {
        super(name, temp, humidity, condition);
    }

    @Override
    public void display() {
            System.out.println("City : " + getName() + ", Temperature: " + getTemp() + "°C, Humidity: " + getHumidity() + "%, Condition: " + getCondition());
    }
}

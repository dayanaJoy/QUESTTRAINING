package com.quest.CaeStudy;

public abstract class WeatherData {
    String name;
    double temp;
    double humidity;
    String condition;

    public WeatherData(String name, double temp, double humidity, String condition) {
        this.name = name;
        this.temp = temp;
        this.humidity = humidity;
        this.condition = condition;
    }

    public String getName() {
        return name;
    }

    public double getTemp() {
        return temp;
    }

    public double getHumidity() {
        return humidity;
    }

    public String getCondition() {
        return condition;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public abstract void display();
}

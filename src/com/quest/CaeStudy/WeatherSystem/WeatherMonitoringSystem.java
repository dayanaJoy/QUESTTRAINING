package com.quest.CaeStudy.WeatherSystem;

import java.util.Scanner;

public class WeatherMonitoringSystem {
    public static void main(String[] args) {
        WeatherFunctions weather = new WeatherFunctions();
        weather.addCityWeather(new CityWeather("New York", 22.5, 65, "Sunny"));
        weather.addCityWeather(new CityWeather("Tokyo", 18.0, 80, "Rainy"));
        weather.addCityWeather(new CityWeather("Dubai", 43.0, 25, "Sunny"));

        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("\nWeather Monitoring System");
            System.out.println("1. Add Weather Data");
            System.out.println("2. Update Weather Data");
            System.out.println("3. Display Weather for a City");
            System.out.println("4. Display All Cities ");
            System.out.println("5. Find Extreme Temperatures");
            System.out.println("6. Reports");
            System.out.println("7.Alerts");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter City Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Temperature (°C): ");
                    double temperature = sc.nextDouble();
                    System.out.print("Enter Humidity (%): ");
                    int humidity = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Weather Condition (Sunny/Rainy/Cloudy): ");
                    String condition = sc.nextLine();
                    weather.addCityWeather(new CityWeather(name, temperature, humidity, condition));
                    System.out.println("Weather Data Added for " + name);
                    break;

                case 2:
                    System.out.print("Enter City Name to Update: ");
                    name = sc.nextLine();
                    System.out.print("Enter New Temperature (°C): ");
                    double newTemp = sc.nextDouble();
                    System.out.print("Enter New Humidity (%): ");
                    int newHumidity = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Weather Condition (Sunny/Rainy/Cloudy): ");
                    String newCondition = sc.nextLine();
                    weather.updateWeather(name, newTemp, newHumidity, newCondition);
                    System.out.println("Weather Data Updated for " + name);
                    break;

                case 3:
                    System.out.print("Enter City Name: ");
                    name = sc.nextLine();
                    weather.displayWeatherByCity(name);
                    break;

                case 4:
                    System.out.println("Displaying All Cities:");
                    weather.displayAllCitiesWeather();
                    break;

                case 5:
                    weather.Findextremes();
                    break;

                case 6:
                    weather.Reports();
                    break;

                case 7:
                    weather.alerts();
                    break;

                case 8:
                    exit = true;
                    System.out.println("Exit!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}

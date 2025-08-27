package com.example;

import org.json.JSONArray;
import org.json.JSONObject;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            //Load  resource using ClassLoader
            String data = new String(
                    Main.class.getClassLoader().getResourceAsStream("weather.json").readAllBytes()
            );

            JSONObject jsonObject = new JSONObject(data);
            JSONArray cities = jsonObject.getJSONArray("cities");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter city name: ");
            String cityName = scanner.nextLine();

            boolean found = false;
            for (int i = 0; i < cities.length(); i++) {
                JSONObject city = cities.getJSONObject(i);
                if (city.getString("name").equalsIgnoreCase(cityName)) {
                    System.out.println("\nWeather Data for " + city.getString("name") + ":");
                    System.out.println("Temperature: " + city.getString("temperature"));
                    System.out.println("Humidity: " + city.getString("humidity"));
                    System.out.println("Condition: " + city.getString("condition"));
                    found = true;
                    break;
                }
            }

            if (!found) System.out.println("City not found.");
            scanner.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

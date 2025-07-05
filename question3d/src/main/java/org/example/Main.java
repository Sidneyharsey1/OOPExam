package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] aqiReadings = new int[30];
        Random random = new Random();

        for (int i = 0; i < aqiReadings.length; i++) {
            aqiReadings[i] = random.nextInt(300) + 1;
        }

        System.out.println("Generated AQI readings:");
        for (int aqi : aqiReadings) {
            System.out.print(aqi + " ");
        }
        System.out.println();

        double median = computeMedian(aqiReadings);
        System.out.println("The median AQI value is: " + median);

        int hazardousDaysCount = countHazardousDays(aqiReadings);
        System.out.println("The number of hazardous days (AQI > 200) is: " + hazardousDaysCount);
    }

    public static double computeMedian(int[] aqiReadings) {
        Arrays.sort(aqiReadings);  // Sort the AQI readings in ascending order

        int n = aqiReadings.length;
        if (n % 2 == 1) {
            return aqiReadings[n / 2];
        } else {
            return (aqiReadings[n / 2 - 1] + aqiReadings[n / 2]) / 2.0;
        }
    }

    public static int countHazardousDays(int[] aqiReadings) {
        int count = 0;
        for (int aqi : aqiReadings) {
            if (aqi > 200) {
                count++;
            }
        }
        return count;
    }
}

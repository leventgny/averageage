package averageage.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class AverageAgeService {


    public static final int AVERAGE_AGE_RANGE = 5;

    public String average(String[] names, int[] ages) {

        if( names == null ||
            ages == null ||
            names.length < 1 ||
            ages.length < 1 ||
            names.length != ages.length) {
            throw new Error("Invalid arguments.");
        }

        double average = Arrays.stream(ages)
                .average().orElse(0);

        Map<String, Integer> result = new HashMap<>();

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            if(age <= average + AVERAGE_AGE_RANGE &&
                age >= average - AVERAGE_AGE_RANGE) {
                result.put(names[i], age);
            }
        }

        return result.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .map(e -> e.getKey() + " is " + e.getValue() + " years old")
                .collect(Collectors.joining("\n"));
    }

}

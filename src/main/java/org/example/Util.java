package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Util {
    public static String removeDuplicates(String string) {
        return Arrays.asList(string.split(""))
                .stream()
                .distinct()
                .collect(Collectors.joining());
    }
}

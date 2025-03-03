package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class UtilTest {
    @ParameterizedTest
    @MethodSource("inputStrings")
    void removeDuplicates(String input, String expectedOutput) {
        String result = Util.removeDuplicates(input);
        Assertions.assertEquals(result, expectedOutput);
    }

    private static Stream<Arguments> inputStrings() {
        return Stream.of(
                Arguments.of("AABBCCD112233", "ABCD123"),
                Arguments.of("cbacdcbc", "cbad"),
                Arguments.of("aAbDDBD4477123", "aAbDB47123"),
                Arguments.of("1232243890", "1234890")
        );
    }
}

package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UtilTest {
    @Test
    void removeDuplicates() {
        String[] inputs = {
                "AABBCCD112233",
                "cbacdcbc",
                "aAbDDBD4477123",
                "1232243890"
        };
        String[] expectedOutput = {
                "ABCD123",
                "cbad",
                "aAbDB47123",
                "1234890"
        };

        int index = 0;
        for (String input : inputs) {
           String result = Util.removeDuplicates(input);
           Assertions.assertEquals(result, expectedOutput[index]);
           index++;
        }
    }
}

package org.example;

/*
    Given a simple String AABBCCD112233. All you need is to return new String, that will not contain any duplicates.
    Code should be clean, readable and optimised. Also, I expect test coverage with a different test cases.
    You need to do this in your repository and give us a link to the solution
*/
public class Main {
    public static void main(String[] args) {
        String s = "AABBCCD112233";
        System.out.println("Input string: " + s);
        System.out.println("Output string: " + Util.removeDuplicates(s));
    }
}

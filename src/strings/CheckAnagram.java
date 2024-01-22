package strings;

import java.util.Arrays;

public class CheckAnagram {
    public static void main(String[] args) {
        // Example strings
        String str1 = "night";
        String str2 = "thing";

        // Check if the strings are anagrams
        boolean areAnagrams = areAnagrams(str1, str2);

        // Display the result
        if (areAnagrams) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

    // Method to check if two strings are anagrams
    private static boolean areAnagrams(String s1, String s2) {
        // Remove spaces and convert to lowercase for case-insensitivity
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        // Check if the lengths are the same
        if (s1.length() != s2.length()) {
            return false;
        }

        // Convert strings to char arrays and sort them
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted char arrays
        return Arrays.equals(charArray1, charArray2);
    }
}

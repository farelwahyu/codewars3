public class Kata {
    public static String shortcut(String input) {
        StringBuilder result = new StringBuilder();

        // Iterate through each character in the input string
        for (char c : input.toCharArray()) {
            // Check if the character is not a lowercase vowel
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                result.append(c); // Append non-vowel characters to the result
            }
        }

        return result.toString();
    }
}
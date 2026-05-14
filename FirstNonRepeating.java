import java.util.HashMap;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String input = "swiss";
        char result = findFirst(input);
        
        if (result != '\0') {
            System.out.println("First non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    public static char findFirst(String str) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (char c : str.toCharArray()) {
            if (charCount.get(c) == 1) {
                return c;
            }
        }
        return '\0'; 
    }
}

public class SearchArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 30;
        int foundIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                foundIndex = i;
                break; 
            }
        }

        if (foundIndex != -1) {
            System.out.println("Element " + target + " found at index: " + foundIndex);
        } else {
            System.out.println("Element not found.");
        }
    }
}

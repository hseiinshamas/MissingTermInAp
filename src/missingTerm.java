import java.util.Arrays;



/*
                       Find the missing term in an Arithmetic Progression

 */


public class missingTerm {
    public static int findMissing(int[] numbers) {
        Arrays.sort(numbers);
        int max_ele = numbers[numbers.length-1];
        int min_ele = numbers[0];

        // For xor of all elements
        int x = 0;

        // Common difference of AP series
        int d;

        // Calculating common difference
        d = (max_ele - min_ele) / numbers.length;

        // Calculate the XOR of all elements
        for (int i = 0; i < numbers.length; i++) {
            x = x ^ numbers[i];
        }

        // Perform XOR with actual AP series
        // resultant x will be the ans
        for (int i = 0; i <= numbers.length; i++) {
            x = x ^ (min_ele + (i * d));
        }

        // Return the missing element
        return x;
    }

    public static void main(String[] args) {
        System.out.println(findMissing(new int[]{1, 3, 5, 7, 9, 11, 15}));

    }
}

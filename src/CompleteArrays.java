/*
create a variable
assign variable with array index value
add variables
print new number
 */

import java.util.Arrays;

public class CompleteArrays {
    public static void main(String[] args) {
        int[] numbers = {2, 29, 33, 4, 15, 62, 7, 81, 9, 10};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println(sum);
    }
}
// Declare sum variable, assign it initial value of zero
     //   int sum = 0;


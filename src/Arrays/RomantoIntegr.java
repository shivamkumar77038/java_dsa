package Arrays;
import java.util.*;
public class RomantoIntegr {

    public static int romanToInt(String s) {
 /* intialize map data to use key value pair for getting the integer value
 respected to their key in string
 */
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        // Traverse the string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {

            int currValue = map.get(s.charAt(i));

            /* Compare current value with previous value if prevoius value is small
            it will deduct from result and in case of greter than it will add to  result
            */
            if (currValue >= prevValue) {
                result += currValue;
            } else {
                result -= currValue;
            }

            // Update previous value
            prevValue = currValue;
        }

        return result;
    }
    public static void main(String[] args) {
        String str = "XVII";
        int num = romanToInt(str);
        System.out.println(num);
    }
}

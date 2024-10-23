package Arrays;

public class integerToroman {
    public static String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder str = new StringBuilder();
        for(int i=0;i<values.length;i++){
            while(num>=values[i]){
                str.append(romans[i]);
                num -=values[i];
            }
        }
        return str.toString();
    }
    public static void main(String[] args) {
        int num = 3479;
        System.out.println(intToRoman(num));
    }
}


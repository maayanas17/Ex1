package assignments.ex1;
/**
 * This class represents a simple solution for Ex1.
 * As defined here: https://docs.google.com/document/d/1AJ9wtnL1qdEs4DAKqBlO1bXCM6r6GJ_J/r/edit/edit
 * In this assignment, we will design a number formatting converter and calculator.
 * In general, we will use Strings as numbers over basis of binary till Hexa.
 * [2-16], 10-16 are represented by A,B,..G.
 * The general representation of the numbers is as a String with the following format:
 * <number><b><base> e.g., “135bA” (i.e., “135”, as 10 is the default base), “100111b2”, “12345b6”,”012b5”, “123bG”, “EFbG”.
 * The following are NOT in the format (not a valid number):
 * “b2”, “0b1”, “123b”, “1234b11”, “3b3”, “-3b5”, “3 b4”, “GbG”, "", null,
 * You should implement the following static functions:
 */
public class Ex1 {
        /**
         * Convert the given number (num) to a decimal representation (as int).
         * It the given number is not in a valid format returns -1.
         * @param num a String representing a number in basis [2,16]
         * @return
         */
        public static int number2Int(String num) {
            int base=10,indexLastChar,power,digit;
            int ans = -1;
            if (isNumber(num)) {
                ans=0;
                if (num.contains(String.valueOf('b')))
                {
                    base=Character.getNumericValue(num.charAt(num.length()-1));
                    num=num.substring(0,num.length()-2);
                }
                indexLastChar=num.length()-1;
                for(int i=0;i<num.length();i++)
                {
                    power=Math.abs(i-indexLastChar);
                    digit=Character.getNumericValue(num.charAt(i));
                    ans+=(int)digit*Math.pow((double)base,(double)power);
                }
                return ans;
            }
            return ans;
        }
        /**
         * This static function checks if the given String (g) is in a valid "number" format.
         * @param a a String representing a number
         * @return true iff the given String is in a number format
         */
        public static boolean isNumber(String a) {
            boolean ans = true;
            if (a==null||a.isEmpty())
                return false;
            if (a.contains(String.valueOf('b')))
            {
                if ((a.indexOf('b')==a.length()-1)||(a.indexOf('b')==0))
                    return false;
                if (a.indexOf('b')+1!=a.length()-1)
                    return false;
                char base=a.charAt(a.indexOf('b')+1);
                if ('2'>base||(base>'9'&&'A'>base)||base >'G')
                    return false;
                for (int i=0;i<a.indexOf('b');i++)
                    if (('0'<=a.charAt(i)&&a.charAt(i)<base)||(a.charAt(i)>='A'&&a.charAt(i)<base))
                        ans = true;
                    else
                        return false;
                return ans;
            }
            else
            {
                for (int c=0;c<a.length()-1;c++)
                {
                    if ('0'>a.charAt(c)|| a.charAt(c)>'9')
                        return false;
                }
                return ans;
            }
        }
        /**
         * Calculate the number representation (in basis base)
         * of the given natural number (represented as an integer).
         * If num<0 or base is not in [2,16] the function should return "" (the empty String).
         * @param num the natural number (include 0).
         * @param base the basis [2,16]
         * @return a String representing a number (in base) equals to num, or an empty String (in case of wrong input).
         */
        public static String int2Number(int num, int base) {
            String ans = "";
            int remainder;
            if (num<0 || base<2 || base>16)
                return ans;
            if (num==0)
                return "0";
            while(num>0) {
                remainder = num % base;
                if (remainder >= 10)
                    ans = (char) ('A' + (remainder - 10)) + ans;
                else
                    ans = remainder + ans;
                num=num/base;
            }
            return ans;
        }


        /**
         * Checks if the two numbers have the same value.
         * @param n1 first number
         * @param n2 second number
         * @return true iff the two numbers have the same values.
         */
        public static boolean equals(String n1, String n2) {
            boolean ans = true;
            int n1Int=number2Int(n1);
            int n2Int=number2Int(n2);
            if (n1Int==n2Int)
                return ans;
            return !ans;
        }

        /**
         * This static function search for the array index with the largest number (in value).
         * In case there are more than one maximum - returns the first index.
         * Note: you can assume that the array is not null and is not empty, yet it may contain null or none-valid numbers (with value -1).
         * @param arr an array of numbers
         * @return the index in the array in with the largest number (in value).
         *
         */
        public static int maxIndex(String[] arr) {
            int ans = 0,max=0;
            String maxStr;
            for(int i=0;i< arr.length;i++)
            {
                if(number2Int(arr[i])>max)
                {
                    max=number2Int(arr[i]);
                    ans=i;
                }
            }
            return ans;
        }
}

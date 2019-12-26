package algorithms;

/**
 * https://leetcode.com/problems/reverse-integer/
 * Given a 32-bit signed integer, reverse digits of an integer.
 */
public class ReverseInteger {
    public int reverse(int x) {
        int reverseNum = 0;
        while (x != 0) {
            int remainder = x%10;
            if (reverseNum > Integer.MAX_VALUE/10 || (reverseNum == Integer.MAX_VALUE/10 && remainder>7)) {
                return 0;
            }
            if (reverseNum < Integer.MIN_VALUE/10 || (reverseNum == Integer.MIN_VALUE/10 && remainder<-8)) {
                return 0;
            }
            reverseNum = reverseNum * 10 + remainder;
            x = x/10;
        }
        return reverseNum;
    }
}

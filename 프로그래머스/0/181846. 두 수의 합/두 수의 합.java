import java.math.BigInteger;
class Solution {
    public static String solution(String a, String b) {
        BigInteger num1 = new BigInteger(a);
        BigInteger num2 = new BigInteger(b);
        BigInteger sum = num1.add(num2);
        return sum.toString();
    }
}
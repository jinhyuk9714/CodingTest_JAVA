class Solution {
    public int[] solution(long n) {
        int[] answer = new int[Long.toString(n).length()];
        int idx = 0;
        while (n != 0) {
            answer[idx++] = (int) (n % 10);
            n /= 10;
        }
        return answer;
    }
}
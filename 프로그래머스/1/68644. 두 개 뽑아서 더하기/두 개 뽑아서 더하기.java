import java.util.ArrayList;
class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if(!list.contains(numbers[i] + numbers[j])) {
                    list.add(numbers[i]+numbers[j]);
                }
            }
        }
        list.sort(Integer::compareTo);
        return list.stream().mapToInt(i -> i).toArray();
    }
}
//nested loop ： O(N^2)
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        for(int i = 0; i  < numbers.length - 1; i++){
            for(int j = i + 1;j < numbers.length;j++){
                //check the possible
                if(numbers[i] + numbers[j] == target) {
                    result[0] = i+1;
                    result[1] = j+1;
                    return result;
                }
            }
        }
        return null;
    }
}

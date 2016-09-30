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

//binary search  out loop O(N) INSIDE LOOP O(lgN)------》TOTAL IS O(NlgN)
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int[] result = new int[2];
       
       for(int i = 0; i < numbers.length - 1;i++){
           int start = i + 1;
           int end = numbers.length - 1;
           
           while(start < end ){
               int mid = (start + end)/2;
               int value = numbers[i] + numbers[mid];
               if(value == target){
                   result[0] = i + 1;
                   result[1] = mid + 1;
                   return result;
               }else if ( value < target){
                   start = mid + 1;
               }else{
                   end = mid - 1;
               }
           }
           if(numbers[i] + numbers[start] == target){
               result[0] = i + 1;
               result[1] = start + 1;
               return result;
           }
       }
       return null;
    }
}

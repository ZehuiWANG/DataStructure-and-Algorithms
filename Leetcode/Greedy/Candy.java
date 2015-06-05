//Candy
/*
There are N children standing in a line. Each child is assigned a rating value.

You are giving candies to these children subjected to the following requirements:

Each child must have at least one candy.
Children with a higher rating get more candies than their neighbors.
What is the minimum candies you must give?

*/


public class Solution {
    public int candy(int[] ratings) {
        if(ratings==null||ratings.length==0){
            return 0;
        }
        
        int[]  candies=new int[ratings.length];
        //every child should has at least one candy
        for(int i=0;i<candies.length;i++){
            candies[i]=1;
        }
        
        //if child i has rating higher that i-1; which should 1 bigger than its left neighbour
        
        for(int i=1;i<ratings.length;i++){
            if(ratings[i]>ratings[i-1]){
                candies[i]=candies[i-1]+1;
            }
        }
        
        //if child i as rating higher than its right neighbour,but the candies array did not 
        //represented this situation correctly, then correct it 
        
        for(int i=ratings.length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]&&candies[i]<=candies[i+1]){
                candies[i]=candies[i+1]+1;
            }
        }
        
        int total=0;
        //calculate the total candies needed 
        
        for(int i=0;i<candies.length;i++){
            total+=candies[i];
        }
        
        return total;
    }
}


//solution 2
public class Solution {
    public int candy(int[] ratings) {
        //from left to right, from right to left;
        //基本思路就是进行两次扫描，一次从左往右，一次从右往左。第一次扫描的时候维护对于每一个小孩左边所需要最少的糖果数量，存入数组对应元素中，第二次扫描的时候维护右边所需的最少糖果数，并且比较将左边和右边大的糖果数量存入结果数组对应元素中。这样两遍扫描之后就可以得到每一个所需要的最最少糖果量，从而累加得出结果。
        
        if(ratings==null||ratings.length==0){
            return 0;
        }
        
        int[] nums=new int[ratings.length];
        nums[0]=1;
        
        for(int i=1;i<ratings.length;i++){
            if(ratings[i]>ratings[i-1]){
                nums[i]=nums[i-1]+1;
            }else{
                nums[i]=1;
            }
        }
        
        
        int res=nums[ratings.length-1];
        for(int i=ratings.length-2;i>=0;i--){
            int cur=1;
            if(ratings[i]>ratings[i+1]){
                cur=nums[i+1]+1;
            }
            res+=Math.max(cur,nums[i]);
            nums[i]=cur;
        }
        return res;
    }
}
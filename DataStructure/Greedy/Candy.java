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
        //����˼·���ǽ�������ɨ�裬һ�δ������ң�һ�δ������󡣵�һ��ɨ���ʱ��ά������ÿһ��С���������Ҫ���ٵ��ǹ����������������ӦԪ���У��ڶ���ɨ���ʱ��ά���ұ�����������ǹ��������ұȽϽ���ߺ��ұߴ���ǹ����������������ӦԪ���С���������ɨ��֮��Ϳ��Եõ�ÿһ������Ҫ���������ǹ������Ӷ��ۼӵó������
        
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
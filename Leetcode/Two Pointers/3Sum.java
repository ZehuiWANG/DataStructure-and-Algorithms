/*3Sum
Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

    For example, given array S = {-1 0 1 2 -1 -4},

    A solution set is:
    (-1, 0, 1)
    (-1, -1, 2)
	
	*/
	
public class Solution{
	public List<List<Integer>> threeSum(int[] num){
		List<List<Integer>> result=new ArrayList<List<Integer>>();
		if(num.length<3){
			return result;
		}
		
		//sort array
		Arrays.sort(num);
		
		for(int i=0;i<num.length-2;i++){
			if(i==0||num[i]>num[i-1]){
				int start=i+1;
				int end=num.length-1;
				
				while(start<end){
					//case1
					
					if(num[start]+num[end]+num[i]==0){
						ArrayList<Integer> temp=new ArrayList<Integer>();
						temp.add(num[i]);
						temp.add(num[start]);
						temp.add(num[end]);
						
						result.add(temp);
						start++;
						end--;
					}else if(num[start]+num[end]+num[i]<0){
						start++;
					}else{
						end++;
					}
				}
			}
		}
		return result;
	}
}
	

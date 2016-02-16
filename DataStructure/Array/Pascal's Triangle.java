/**
Pascal's Triangle
Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
*/

//java Version1.0
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        
        for(int i=0;i<numRows;i++){
            ArrayList<Integer> subList=new ArrayList<Integer>();
            for(int j=0;j<=i;j++){
                if(j==0){
                    subList.add(1);
                }else if(i==j){
                    subList.add(1);
                }else{
                    int thisNumber=0;
                    thisNumber=result.get(i-1).get(j-1)+result.get(i-1).get(j);
                    subList.add(thisNumber);
                }
            }
            result.add(subList);
        }
        return result;
    }
}
//python
class Solution:
    # @return a list of lists of integers
    def generate(self, numRows):
        if numRows==0:
            return []
        if numRows==1:
            return [[1]]
        res=[[1]]
        
        for i in range(1,numRows):
            sub=[1]
            for j in xrange(1,i):
                sub.append(res[i-1][j-1]+res[i-1][j])
            sub+=[1]
            res.append(sub)
        return res
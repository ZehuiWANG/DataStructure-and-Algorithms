public class Solution{
	public List<String> generatePossibleNextMoves(string s){
		list<String> result = new ArrayList<>();
		if(s == null || s.length() < 2){
			return result;
		}
		for(int i = 0; i < s.length();i++){
			if(s.charAt(i) == '+' && s.charAt(i + 1) == '+'){
				String s1 = substring(0,i);
				String s2 = "--"
				String s3 = substring(i + 2);
				String temp = s1 + s2 + s3;
				result.add(temp);
			}
		}
		return result;
	}
}
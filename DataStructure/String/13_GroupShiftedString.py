
##Given a string, we can "shift" each of its letter to its successive letter, for example: "abc" -> "bcd". We can keep "shifting" which forms the sequence: 

##"abc" -> "bcd" -> ... -> "xyz" 
##Given a list of strings which contains only lowercase alphabets, group all strings that belong to the same shifting sequence. 

##For example, given: ["abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"], 
##Return: 

#[ 
#  ["abc","bcd","xyz"], 
#  ["az","ba"], 
#  ["acef"], 
#  ["a","z"] 
#] 
#Note: For the return value, each inner list's elements must follow the lexicographic order. 

#[分析] 
#思路1：第一次按长度分组，然后在第一次的各分组中按照是否属于同一shifted sequence再次分组。如何判断是否属于同一shifted sequence呢？ 两个字符串x 和 y，若对于任意i，满足y[i] - x[i] = y[0] - x[0], 注意要处理类似"az", "yx"这种情况。代码很长，实现也容易出错。 
#思路2：对于输入数组中的每个字符串，将其“归零”，即求出该字符串对应的shifted squence中的第一个字符串（a为起始字符）。维护一个哈希表，key为各group的“零值”，value是输入数组中属于该group的字符串。 参考https://leetcode.com/discuss/50358/my-concise-java-solution 佩服作者~ 
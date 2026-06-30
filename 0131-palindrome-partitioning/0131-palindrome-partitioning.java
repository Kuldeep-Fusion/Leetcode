class Solution {
    public List<List<String>> partition(String s) {
    	List<String> li = new ArrayList<>();
		List<List<String>> ans = new ArrayList<>();
	    Partitioning(s, li ,ans);
	    return(ans);
	}
	public static void Partitioning(String ques, List<String> li, List<List<String>> ans)  {
		if(ques.length() == 0) {
			ans.add( new ArrayList<>(li));
			return;
		}
		for(int i =1; i<= ques.length(); i++) {
			
			String s = ques.substring(0, i);
			
			if(IsPalindrom(s)) {
				li.add(s);
			Partitioning(ques.substring(i), li, ans);
			li.remove(li.size()-1);
		}	
		}
	}
	
	public static boolean IsPalindrom(String s) {
		int i = 0;
		int j = s.length() -1;
		while(i<j) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<Integer> li = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		Permutations(candidates, target, li, 0, ans);
		return ans;
		
	}
	public static void Permutations(int[] coin, int amount, List<Integer> li, int idx, List<List<Integer>> ans  ) {
		if(amount ==0 ) {
			ans.add(new ArrayList<>(li));
			return;
		}
		
		for(int i =idx; i< coin.length; i++) {
			if(amount >= coin[i]) {
				li.add(coin[i]);
				Permutations(coin, amount - coin[i], li, i, ans);
				li.remove(li.size()-1);
			}
		}
	}
}
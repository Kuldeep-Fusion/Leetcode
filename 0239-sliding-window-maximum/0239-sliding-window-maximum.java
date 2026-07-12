class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        return MaximumWindow(nums, k);
    }
    public static int[] MaximumWindow(int[] arr, int k){
        int [] ans = new int[arr.length-k+1];
        Deque<Integer> dq = new LinkedList<>();
        int j = 0;
        //1st window ka answer
        for(int i =0; i<k; i++){
            while (!dq.isEmpty() && arr[i] > arr[dq.getLast()]){
                dq.removeLast();
            }
            dq.add(i);
        }
        ans[j++] = arr[dq.getFirst()];
        for(int i=k; i<arr.length; i++){
            //Window grow
            while (!dq.isEmpty() && arr[i] > arr[dq.getLast()]){
                dq.removeLast();
            }
            dq.add(i);
            //window shrink
            if(dq.getFirst() == i-k){
                dq.removeFirst();
            }
            //ans update
            ans[j++] = arr[dq.getFirst()];
        }
        return ans;
    }
}

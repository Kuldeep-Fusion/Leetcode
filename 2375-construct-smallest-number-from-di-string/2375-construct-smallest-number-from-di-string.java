class Solution {
    public static String smallestNumber(String pattern) {
        int[] arr = new int[pattern.length() + 1];
        Stack<Integer> st = new Stack<>();
        int c = 1;
        for(int i = 0; i<=pattern.length(); i++){
            if(i ==pattern.length() ||  pattern.charAt(i) == 'I'){
                arr[i]= c++;
                while (!st.isEmpty()){
                    arr[st.pop()] = c++;
                }
            }
            else {
                st.push(i);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int x : arr){
            sb.append(x);
        }
        return sb.toString();
    }
}
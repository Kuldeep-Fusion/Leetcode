class Solution {
    public int maximalRectangle(char[][] matrix) {
         int[] arr = new int[matrix[0].length];
        int area =0;
        for(int i=0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j] == '1'){
                    arr[j]++;
                }else {
                    arr[j] = 0;
                }
            }
            area = Math.max(area, Largest_rectangle(arr));
        }
        System.out.println(area);
       return area;
    }


    public static int Largest_rectangle(int[] height){
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[height.length];
        int area = 0;
        for(int i =0 ; i<height.length; i++){
            while(!st.isEmpty() && height[i]< height[st.peek()]) {
                int r = i;
                int h = height[st.pop()];
                if (st.isEmpty()) {
                    area = Math.max(area, h * r);
                } else {
                    int l = st.peek();
                    area = Math.max(area, h * (r - l - 1));
                }
            }
            st.push(i);
        }

        int r = height.length;
        while(!st.isEmpty()) {
            int h = height[st.pop()];
            if (st.isEmpty()) {
                area = Math.max(area, h * r);
            } else {
                int l = st.peek();
                area = Math.max(area, h * (r - l - 1));
            }
        }
        return area;
    }
    
}
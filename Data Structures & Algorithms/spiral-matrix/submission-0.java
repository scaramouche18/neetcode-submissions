class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new LinkedList<>();
        int top =0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        
        while(top <= bottom && left <= right){
            //left to right
            for(int i = left ; i<= right;i++){
                list.add(matrix[top][i]);
            }
            top++;
            //top to bottom
            for(int i = top; i <= bottom;i++){
                list.add(matrix[i][right]);
            }
            right--;
            //right to left
           if(top <= bottom){
            for(int i = right; i >= left;i--){
                list.add(matrix[bottom][i]);
            }
            bottom--;
           }
           if(left <= right){
            for(int i = bottom; i >= top; i--){
                list.add(matrix[i][left]);
            }
            left++;
           }

        }
        return list;
        
        
    }
}
///1. Traverse left → right along top, then increment top.
// 2. Traverse top → bottom along right, then decrement right.
// 3. If top <= bottom, traverse right → left along bottom, then decrement bottom.
// 4. If left <= right, traverse bottom → top along left, then increment left.
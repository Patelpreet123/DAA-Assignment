class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[] a=new int[n*m];
        int x=0;
        for(int i=0;i<n*m;i++){
            if(i!=0&&i%m==0){
                x++;
            }
            a[i]=matrix[x][i%m];
        }
        int s=0;
        int e=n*m-1;
        while(s<=e){
            int md=(s+e)/2;
            if(a[md]==target){
                return true;
            }
            else if(a[md]>target){
                e=md-1;
            }
            else{
                s=md+1;
            }
        }
        return false;
    }
}

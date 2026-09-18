class Solution {
    public int[] sortArray(int[] nums) {
        x(nums,0,nums.length-1);
        return nums;
    }
    void x(int[] a,int l,int r){
        if(l>=r){
            return;
        }
        int m=(l+r)/2;
        x(a,l,m);
        x(a,m+1,r);
        merge(a,l,m,r);
    }
    void merge(int[] a,int l,int m,int r){
        int n1=m+1-l;
        int n2=r-m;
        int[] x=new int[n1];
        int[] y=new int[n2];
        for(int i=0;i<n1;i++){
            x[i]=a[l+i];
        }
        for(int j=0;j<n2;j++){
            y[j]=a[m+1+j];
        }
        int i=0,j=0,k=l;
        while(i<n1&&j<n2){
            if(x[i]<=y[j]){
                a[k]=x[i];
                k++;
                i++;
            }
            else{
                a[k]=y[j];
                j++;
                k++;
            }
        }
        while(i<n1){
            a[k]=x[i];
            k++;
            i++;
        }
        while(j<n2){
            a[k]=y[j];
            k++;
            j++;
        }
    }
}

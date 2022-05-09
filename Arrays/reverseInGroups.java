public class Main {

    public static void reverseInGroups(int[] a,int k,int n){
        for(int i=0;i<n;i+=k){
            int left=i,right=Math.min(i+k-1,n-1);
            while(left<right){
                temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;
            }
        }
    }
}

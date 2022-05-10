public class Main {

    public static void SubArwithSumX(int[] a,int n,int X){
        int sum=a[0],start=0;
        for(int i=0;i<=n;i++){
            while(sum>X&&start<i-1){
                sum-=a[start++];
            }
        if(sum==X)
            System.out.print("the subarray between the indices is"+start+"to"+(i-1));

        if(i<n)
            sum+=a[i];
        }
        System.out.print("no subarrays found with the given sum in the given array");
    }
}

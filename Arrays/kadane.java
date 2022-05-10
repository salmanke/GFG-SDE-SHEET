public class Main {

    public static int kadane(int[] a,int n){
        int globalSum=Integer.MIN_VALUE,localSum=0;
        for(int i=0;i<n;i++){
            localSum+=a[i];
            if(localSum>globalSum)
                globalSum=localSum;
            if(localSum<0)
                localSum=0;
        }
        return globalSum;
    }
}

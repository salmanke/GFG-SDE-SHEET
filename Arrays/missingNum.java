public class Main {

    public static int missingNum(int[] a,int n){
        int v1=a[0],v2=1;
        for(int i=2;i<=n+1;i++)
            v2=v2^i;
        for(int i=1;i<n;i++)
            v1=v1^a[i];
        return v1^v2;
    }
}

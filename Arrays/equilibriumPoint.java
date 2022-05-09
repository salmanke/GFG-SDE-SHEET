public class Main {

    public static int equilibriumPoint(int a[],int n){
        int left_sum[]=new int[n];
        int right_sum[]=new int[n];

        left_sum[0]=a[0];

        for(int i=1;i<n;i++)
            left_sum[i]=left_sum[i-1]+a[i];

        right_sum[n-1]=a[n-1];

        for(int i=n-2;i>=0;i--)
            right_sum[i]=right_sum[i+1]+a[i];

        for(int i=0;i<n;i++){
            if(left_sum[i]==right_sum[i])
                return i;
        }

    }
}

public class Main {

    public static int kthElement(int[] a,int[] b,int m,int n,int k){
        int p=0,i=0,j=0,target=0;
        while(i<m&&j<n&&p<k){
            if(a[i]<b[j]){
                i++;
                p++;
                if(p+1==k){
                    target=a[i];
                    break;}
            }else{
                j++;
                p++;
                if(p+1==k){
                    target=b[j];
                    break;}
            }
        }
        while(i<m){
            i++;
            p++;
            if(p+1==k){
                target=a[i];
                break;}
        }
        while(j<n){
            j++;
            p++;
            if(p+1==k){
                target=b[j];
                break;}
        }
        return target;
    }
}

public class Main {

    public static void zigZag(int[] a,int n){
        boolean flag=true;
        for(int i=0;i<n-1;i++){
            if(a[i]>a[i+1]&&flag){
                int temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
                flag=!flag;
            }
            else if(a[i]<a[i+1]&&!flag){
                int temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
                flag=!flag;
            }
            else{
                flag=!flag;
            }
        }
    }
}

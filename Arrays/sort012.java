public class Main {

    //considering arrays contains only positive elements
    //not considering the order of leader elements

    public static void sort012(int[] a,int n){
        int i=0,j=0,k=n-1;
        while(j<=k){
            switch (a[j]) {
                case 0:
                    swap(a[i],a[j])
                    i++;
                    j++;
                    break;
                case 1:
                    j++;
                    break;
                case 2:
                    swap(a[k],a[j]);
                    k--;
                    break;
            
                default:
                    break;
            }
        }
    }
}

public class Main {

    //considering arrays contains only positive elements
    //not considering the order of leader elements

    public static void leadersInArray(int a[],int n){
        int l_max=0,g_max=0;
        for(int i=n-1;i>=0;i--){
            l_max=a[i];
            if(l_max>g_max){
                System.out.print(l_max+" ");
                g_max=l_max;
            }
        }
    }
}

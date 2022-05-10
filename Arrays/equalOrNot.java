public class Main {

    public static boolean equalOrNot(int[] a,int[] b){
        int m=a.length,n=b.length,cnt=0;
        if(m!=n)
            return false;
        Map<Integer,Integer> m=new HashMap<Integer,Integer>();
        for(int i=0;i<m;i++){
            if(m.get(a[i])==null)
                m.put(a[i],1)
            else
                m.put(a[i],m.get(a[i])++);
        }
        for(int i=0;i<n;i++){
            if(!m.containsKey(b[i]))
                return false;
            if(m.get(b[i])==0)
                return false;
            m.put(b[i],m.get(b[i])--);
        }
        return true;
        
    }
}

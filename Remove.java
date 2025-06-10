import java.util.*;
class Remove {
    static HashSet<Integer>removeDup( int a[],int n)
    {
        LinkedHashSet<Integer>h=new LinkedHashSet<>();
       for(int i=0;i<n;i++)
        {
            if(!h.contains(a[i]))
                h.add(a[i]);
        }
       

        return h;
       
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        HashSet<Integer>result = removeDup(a, n);

        for (int x : result)
        {
            System.out.print(x + " ");
        }
    }
}
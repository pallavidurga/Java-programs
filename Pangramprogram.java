import java.util.*;
class Main {
        static boolean isPangram(String s)
        {
            String s1=s.toLowerCase();
            boolean[] vis=new boolean[26];
            for(int i=0;i<s.length();i++)
            {
                char c=s.charAt(i);
                if(c>='a' && c<='z')
                {
                    vis[c-'a']=true;
                }
            }
            for(int i=0;i<26;i++)
            {
                if(!vis[i])
                    return false;
            }
            return true;
        }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	System.out.println("Enter String");
        String s=sc.nextLine();
        if(isPangram(s))
            System.out.println("Pangram");
        else
            System.out.println("Not Pangram");
        }
            
}
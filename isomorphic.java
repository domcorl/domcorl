
import java.util.HashMap;
import java.util.Scanner;

public class isomorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t= sc.nextLine();
        System.out.println(isIsomorphic(s, t));
        sc.close();
    }
    public static boolean isIsomorphic(String s, String t) {
        int len1=s.length();        
        int len2=t.length();

        HashMap<Character,String> hs=new HashMap<>();
        HashMap<Character,String> ht=new HashMap<>();
        String str1="";
        String str2="";
        for(int i=0;i<len1||i<len2;i++)
        {
            if(i<len1)
            {
                hs.put(s.charAt(i),str1+i);
            }
            if(i<len2)
                ht.put(t.charAt(i),str2+i);
        }
        System.out.println("S values = "+hs.values());
        System.out.println("T values = "+ht.values());
        int i=0;
        for(i=0;i<hs.size();i++)
        {
            if(!hs.get(s.charAt(i)).equals(ht.get(t.charAt(i))))
            {
                return false;
            }
        }
        
        return true;
    }
}

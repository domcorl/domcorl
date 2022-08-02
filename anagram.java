import java.util.*;

public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t= sc.nextLine();
        System.out.println(isAnagram(s, t));
        sc.close();
    }
    public static boolean isAnagram(String s, String t) {

        int len1=s.length();        
        int len2=t.length();
        
        if(len1!=len2)return false;

        HashMap<Character,Integer> hs=new HashMap<>();
        HashMap<Character,Integer> ht=new HashMap<>();

        for(int i=0;i<len1;i++)
        {
            hs.put(s.charAt(i),hs.getOrDefault(s.charAt(i),0)+1);
            ht.put(t.charAt(i),ht.getOrDefault(t.charAt(i),0)+1);
        }
        if(hs.equals(ht))
            return true;
        return false;
    }
}

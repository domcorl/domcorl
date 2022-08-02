import java.util.HashMap;
import java.util.Scanner;

public class ransomnote {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println(canConstruct(s, s2));
        sc.close();
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> hr= new HashMap<>();
        HashMap<Character,Integer> hm= new HashMap<>();
        for(int i=0;i<ransomNote.length()|| i<magazine.length();i++)
        {
            if(i<ransomNote.length())
                hr.put(ransomNote.charAt(i),hr.getOrDefault(ransomNote.charAt(i), 0)+1);
            if(i<magazine.length())
                hm.put(magazine.charAt(i),hm.getOrDefault(magazine.charAt(i), 0)+1);

        }
        System.out.println("before= "+hm);
        boolean flag=true;
        for(int i=0;i<ransomNote.length();i++)
        {
            if(hm.get(ransomNote.charAt(i))>0)
            {
                
                hm.replace(ransomNote.charAt(i), hm.get(ransomNote.charAt(i)), hm.get(ransomNote.charAt(i))-1);
                System.out.println("After = "+hm);
            }
            else{
                flag=false;
            }
        }
        return flag;
    }
}
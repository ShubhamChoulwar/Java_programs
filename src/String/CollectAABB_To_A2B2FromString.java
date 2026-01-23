package String;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectAABB_To_A2B2FromString{

    public static void main(String[] args){
        String str = "aabcdd";
        HashMap<Character,Integer> hm = new HashMap<>();
        StringBuilder strbuilder = new StringBuilder();
        char [] charArray = str.toCharArray();
        int count=0;
        for(char c : charArray){
            if(hm.containsKey(c)){
                hm.put(c,hm.getOrDefault(c,0)+1);
            }
            else{
                hm.put(c,1);
            }
        }

        System.out.println(strbuilder.toString());
       }
    }


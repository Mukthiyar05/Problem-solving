package problems;

import java.util.*;

public class eight_six {
    public static void main(String[] args) {
        String input = "she is good grid  and ground player plotter gd";
        String[] words = input.split(" ");
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<words.length;i++){
            if(words[i].length()>1) {
                String pair = words[i].charAt(0)+""+words[i].charAt(words[i].length()-1);
                map.put(pair,map.getOrDefault(pair,0)+1);
            }
        }
        int maxFreq = 0;
        for(String x:map.keySet()){
             maxFreq = Math.max(maxFreq,map.get(x));
        }
        System.out.println(maxFreq);
    }
}

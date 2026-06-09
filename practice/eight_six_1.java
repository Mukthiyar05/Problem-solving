package problems;

public class cts_eight_six {
    public static void main(String[] args) {
        String input1 = "ABC";
        String input2 = "XYZ";
        int[] fre1 = new int[26];
        int[] fre2 = new int[26];
       for(int i=0;i<input1.length();i++){
            fre1[input1.charAt(i)-'A']++;
        }
        for(int i=0;i<input2.length();i++){
            fre2[input2.charAt(i)-'A']++;
        }
        int cost=0;
        for(int i=0;i<fre2.length;i++){
            if(fre2[i]>fre1[i]){
               cost=cost+fre2[i]-fre1[i];
            }
        }
        System.out.println(cost);
    }
}

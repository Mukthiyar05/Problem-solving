package problems;

public class nine_six {
    public static void main(String[] args) {
        String input = "11292";
        int count = 0;
        for(int i=0;i<input.length();i++){
            int num1 = (input.charAt(i)-'0');
            if(num1>=1){
                count++;
            }
        }

        for(int i=0;i<input.length()-1;i++){
            int num = Integer.valueOf(input.substring(i,i+2));
            if(num<=26){
                count++;
            }
        }
        int result = count;
        System.out.println(result);
    }
}

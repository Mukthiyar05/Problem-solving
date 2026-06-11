package problems;

public class no_of_sundays {
    public static void main(String[] args) {
        int input1 = 14;
        String input2="mon";
        int num = 0;
        String[] days = {"mon","tue","wed","thu","fri","sat","sun"};
        for(int i=0;i<days.length;i++) {
            if (input2.equals(days[i])) {
                num = i + 1;
                break;
            }
        }

        int count=0;
            for(int i=0;i<input1;i++){
                int number = (num+i)%7;   //currentDay = (0 + 0) % 7 = 0
                if(days[number].equals(input2)){ //days[0] = "mon"
                    count++;
            }
        }
        System.out.println(count);
    }
}

package problems;

public class cts_2 {
    public int happinessIndex(String input1){
        if(input1.isEmpty() || input1==null){
            return 0;
        }
        boolean containsSeven = false;
        int score = 0;
        for(int i=0;i<input1.length();i++){
            int product = 1;
            int position=i+1;
            int digit = Character.getNumericValue(input1.charAt(i));
            if(digit==7){
                containsSeven=true;
            }
            product = digit*position;
            if(product%2==0){
                score=score+product;
            }else{
                score=score-product;
            }
        }
        String lucky = Integer.toString(Math.abs(score));
        if(containsSeven){
            score=score*2;
        }
        return score;

    }

    public static void main(String[] args) {
        cts_2 ct = new cts_2();
        System.out.println(ct.happinessIndex("175"));
    }
}

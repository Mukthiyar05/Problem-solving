package problems;
import java.util.Scanner;
public class nine_six_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int N = sc.nextInt();
        System.out.println("L: ");
        int L = sc.nextInt();
        System.out.println("R: ");
        int R = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[N];
        for(int i =0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int dopamine = 0;
        int minDop = Integer.MAX_VALUE;
        int maxDop =Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>=L && arr[i]<=R){
                dopamine++;
                maxDop=Math.max(dopamine,maxDop);
            }else{
                dopamine--;
                minDop = Math.min(dopamine,minDop);
            }

        }
        System.out.println(maxDop+" "+minDop);
    }
}

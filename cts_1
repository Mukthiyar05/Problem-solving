package problems;
import java.util.*;
import java.io.*;
public class cts_1 {
    public static void main(String[] args) {
        String input1 = "234";
        char[] arr = input1.toCharArray();
        if (input1 == null || input1.isEmpty()) {
            return;
        }
        int totalWeight = 0;
        for (int i = 0; i < input1.length(); i++) {
            int digit = arr[i]- '0';
            int position = i + 1;
            if (position% 2 != 0) {
                totalWeight = totalWeight + digit * (digit + position);
            } else {
                totalWeight = totalWeight + digit + (position * position);
            }
        }
            System.out.println(totalWeight);

    }
}

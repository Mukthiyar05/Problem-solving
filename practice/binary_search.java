package problems;

public class binary_search {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int tar = 40;
        int start = 0;
        int end = arr.length-1;

        while(start<=end) {
            int mid = start+(end-start)/2;
            if (tar<arr[mid]){
                end = mid-1;
            }else if(tar>arr[mid]){A
                start=mid+1;
            }else{
                System.out.println(mid);
                break;
            }
        }

    }
}

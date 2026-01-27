class Solution {
    public int pivotIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int LeftSum = 0;
            for(int j=i-1;j>=0;j--){
               
                LeftSum = LeftSum+nums[j];
            }
            int RightSum = 0;
            for(int k=i+1;k<nums.length;k++){
                RightSum = RightSum+nums[k];
            }
            if(RightSum==LeftSum){
                return i;
            }
        }
        return -1;
    }
}

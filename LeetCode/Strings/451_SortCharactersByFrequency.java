class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[128];
        char[] arr = s.toCharArray();

        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }

        int max = 0;
        for(int i=0;i<freq.length;i++){
            max = Math.max(max,freq[i]);
        }
            StringBuilder sb = new StringBuilder(); 
        for(int i=max;i>0;i--){ 
            for(int j=0;j<freq.length;j++){
                if(freq[j]==i){
                    for(int k=0;k<i;k++){
                    char ch = (char)(j);
                sb.append((char)j);
                    }
                }
            }
        }
        return sb.toString();
    }
}

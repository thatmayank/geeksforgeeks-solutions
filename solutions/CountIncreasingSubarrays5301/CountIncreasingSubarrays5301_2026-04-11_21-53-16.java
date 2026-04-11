class Solution {
    public int countIncreasing(int[] arr) {
        // two pointers + sliding window
        int n = arr.length;
        int i = 0;
        int j = 1;
        int count = 0;
        
        while(j < n) {
            if(arr[j] > arr[j-1]) j++;
            else {
                int len = j-i;
                count += (len*(len-1))/2;
                i = j;
                j++;
            }
        }
        
        if(i < j) {
            int len = j-i;
            count += (len*(len-1))/2;
        }
        return count;
    }
}
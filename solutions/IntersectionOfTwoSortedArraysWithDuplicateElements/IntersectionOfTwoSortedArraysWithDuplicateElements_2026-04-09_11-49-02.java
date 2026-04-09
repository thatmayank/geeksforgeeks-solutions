class Solution {
    ArrayList<Integer> intersection(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int i = 0, j = 0;
        ArrayList<Integer> intersection = new ArrayList<>();
        
        while(i < n && j < m) {
            while(i < n-1 && a[i] == a[i+1]) i++;
            while(j < m-1 && b[j] == b[j+1]) j++;
            
            if(a[i] == b[j]) {
                intersection.add(a[i]);
                i++;
                j++;
            } 
            else {
                if(a[i] < b[j]) i++;
                else if(b[j] < a[i]) j++;
            }
        }
        return intersection;
    }
}
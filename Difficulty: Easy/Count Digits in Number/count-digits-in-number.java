class Solution {
    public static int countDigits(int n) {
        // Code here
        if(n==1)
        return 1;
        int count=0;
        while(n>0){
            n/=10;
            count++;
        }
        return count;
    }
}

public class Squareroot {
    class Solution {
        public int mySqrt(int x) {
            //any number under 1 cant really be calculated
            if(x <= 1) return x;
            int start = 1;
            int end = x/2;
            
            while(start < end) {
                int mid = (start + (end-start)/2) + 1;
                
                int div = x/mid;
                if(div == mid) return mid;
                if(div > mid) start = mid;
                else end = mid-1;
            }
            
            return start;
        }
    }
        
}

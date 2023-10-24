public class Sqrt {
    class Solution {
        public int mySqrt(int x) {
            //store variable for solution 
            int sqrt=0;
            int i=1;
            //while input is more than 0
            while(x>0){
                //subtract 1 from input until it reaches 0
                x-=i;
                //if input is less than 0 stop subtracting
                if(x<0) break;
                //add 2 to input to reach sqrt
                i+=2;
                //add solution to square root variable we stored above
                sqrt++;
            }
            return sqrt;
        }
    }
}

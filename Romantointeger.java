class Solution {
    public int romanToInt(String s) {
    //return 0 if invalid
    if(s == null){
        return 0;
    }
    
    //length of string and integers for current value and next stored
    int length = s.length();
    int sum = 0;
    int next = 0;
    
    //for loop that starts from largest to smallest since thats how romans are written
    for(int i = length - 1; i >= 0; i--){
        int cur = romanTable(s.charAt(i));
        
        //if letter at i is last, add current value to sum
        if(i == length - 1){
            sum = sum + cur;
        }else{
           //if current is less than next, subtract next from sum
           if(current < next){
               sum = sum - next;
           }else{
               sum = sum + next;
           }
        }
        
        next = current;
    }
    
    return sum;
}

//this will be the method we will implement above
//letter equals number table(roman numerals)
//break after every letter
public int romanTable(char c){
    int num = 0;
    switch(c){
        case 'I':
            num = 1;
            break;
        case 'V':
            num = 5;
            break;
         case 'X':
            num = 10;
            break;
         case 'L':
             num = 50;
             break;
         case 'C':
             num = 100;
             break;
         case 'D':
             num = 500;
             break;
         case 'M':
             num = 1000;
             break;
         default:
             num = 0;
             break;
    }
    return num;
}    
    }
}
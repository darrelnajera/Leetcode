class Solution {
    public int[] twoSum(int[] nums, int target) {
        //implement hash map of integers
        HashMap<Integer, Integer> map = new HashMap();
        //iterate through length of array
        for(int i=0; i<nums.length; i++) {

           //the expectedkey = the number that equals target minus number at i 
           int expectedKey = target - nums[i];
           //if the espected key is on hash map, get the indices of that expected key
           if(map.containsKey(expectedKey)) {
               return new int[]{map.get(expectedKey), i};
           }
           //insert keys into map
           map.put(nums[i], i);
        }
        //if no solution is found print out exception error     
        throw new IllegalArgumentException("No Solution");
    }
}
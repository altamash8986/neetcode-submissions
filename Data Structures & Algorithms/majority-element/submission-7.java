class Solution {
    public int majorityElement(int[] nums) {
     HashMap<Integer,Integer> map = new HashMap<>();

     int result = 0;
     int freq = 0;

     for(int num:nums){
        map.put(num,map.getOrDefault(num,0)+1);


        if(map.get(num)> freq){
            result = num;
            freq = map.get(num);
        }
     }   
     return result;
    }
}
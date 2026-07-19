class Solution {
    public int majorityElement(int[] nums) {
     HashMap<Integer,Integer> map = new HashMap<>();
    
    int res = 0;
    int count = 0;

    for(int num:nums){
        map.put(num,map.getOrDefault(num,0)+1);

        if(map.get(num)> count){
            res = num;
            count = map.get(num);
        }
    }
    return res;
    }
}
class Solution {
    public void sortColors(int[] nums) {
        int zero = 0;
        int  one = 0;
        int two = 0;

        for(int i=0;i<nums.length;i++){

            if(nums[i] ==0){
                nums[two] =2;
                two++;

                nums[one] =1;
                one++;

                nums[zero] =0;
                zero++;
            }

            else if(nums[i]==1){
                nums[two] = 2;
                two++;

                nums[one]=1;
                one++;
            }
            else{
                nums[two]=2;
                two++;
            }
        }

    }
}
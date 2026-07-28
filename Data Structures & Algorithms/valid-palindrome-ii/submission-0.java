class Solution {
    public boolean validPalindrome(String s) {
       
         int left = 0;

        int right = s.length()-1;

        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return ispalindrome(s,left+1,right) || ispalindrome(s,left,right -1);
            }
            left++;
            right--;
        }    
return true;
    }

    private boolean ispalindrome(String s, int left, int right ){

        while(left<right){

            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }

            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            char l = Character.toLowerCase(s.charAt(left));
            char r = Character.toLowerCase(s.charAt(right));

            if(l!=r){
                return false;
            }
        
        left++;
        right--;

        }
        return true;
    }
}
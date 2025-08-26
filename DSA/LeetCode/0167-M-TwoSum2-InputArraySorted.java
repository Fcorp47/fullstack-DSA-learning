class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        //optimized approach using two pointer
        //time complexity O(n)
        //space complexity O(1)
        //since the array is sorted we can use two pointer approach
        int value = 0;
        int pointer1=0;
        int pointer2=numbers.length-1;
        for(int i=0; i<numbers.length; i++){
            if(numbers[pointer1] + numbers[pointer2] == target)
                return new int[] {pointer1+1, pointer2+1};
            if(numbers[pointer1] + numbers[pointer2] > target){
                pointer2--;
            }else
                pointer1++;
        }

        //brute force approach
        //time complexity O(n^2)
        int value =0;
        for(int i=0; i<numbers.length; i++){
            value = target - numbers[i];
            for(int j=i; j<numbers.length; j++){
                //will check if the sub is equal to value
                if(value == numbers[j]){
                    return new int[] {i+1,j+1};
                }
            }
        }
        return new int[]{};
    }
}
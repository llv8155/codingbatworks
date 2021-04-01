/*

Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.


bigDiff([10, 3, 5, 6]) → 7
bigDiff([7, 2, 10, 9]) → 8
bigDiff([2, 10, 7, 2]) → 8
*/

public int bigDiff(int[] nums) {
  int largeNum = Integer.MIN_VALUE;
  int smallNum = Integer.MAX_VALUE;
  
  for (int i = 0; i < nums.length; i++)
  {
    largeNum = Math.max(largeNum, nums[i]);
    smallNum = Math.min(smallNum, nums[i]);
  }
  
  return largeNum - smallNum;
}

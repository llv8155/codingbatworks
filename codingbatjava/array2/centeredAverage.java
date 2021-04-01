/*

Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value. Use int division to produce the final average. You may assume that the array is length 3 or more.


centeredAverage([1, 2, 3, 4, 100]) → 3
centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
*/

public int centeredAverage(int[] nums) {
  int largeNum = Integer.MIN_VALUE;
  int smallNum = Integer.MAX_VALUE;
  int arraySum = 0;
  
  for (int i = 0; i < nums.length; i++)
  {
    largeNum = Math.max(largeNum, nums[i]);
    smallNum = Math.min(smallNum, nums[i]);
    arraySum += nums[i];
  }
  
  // except ignoring the largest and smallest values in the array
  arraySum -= (largeNum + smallNum);
  
  // "centered" average of an array of ints, which we'll say is the mean average of the values
  return arraySum / (nums.length-2);
  
  
}

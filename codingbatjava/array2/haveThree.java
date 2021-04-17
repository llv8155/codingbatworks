/*
Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.


haveThree([3, 1, 3, 1, 3]) → true
haveThree([3, 1, 3, 3]) → false
haveThree([3, 4, 3, 3, 4]) → false
*/

public boolean haveThree(int[] nums) {
  if (nums.length == 0) {
    return false;
  }
  
  boolean threeTimes = false;
  int three = 0;
  
  for (int i = 0; i < nums.length-1; i++) {
    if (nums[i] == 3) {
      three++;
      if (nums[i] == nums[i+1]) {
        return false;
      }
    }
  }
  
  if (nums[nums.length-1] == 3) {
    three++;
  }
  
  if (three == 3) {
    return true;
  }
  return false;
}

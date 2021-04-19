/*
Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.


tripleUp([1, 4, 5, 6, 2]) → true
tripleUp([1, 2, 3]) → true
tripleUp([1, 2, 4]) → false
*/

public boolean tripleUp(int[] nums) {
  for (int i = 1; i < nums.length-1; i++) {
    if (nums[i] == nums[i-1]+1 && nums[i]+1 == nums[i+1]) {
      return true;
    }
  }
  return false;
}

/*

We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array, at least one of the pair is that value. Return true if the given value is everywhere in the array.


isEverywhere([1, 2, 1, 3], 1) → true
isEverywhere([1, 2, 1, 3], 2) → false
isEverywhere([1, 2, 1, 3, 4], 1) → false
*/

public boolean isEverywhere(int[] nums, int val) {
  // flag1 checks first every other pair
  boolean flag1 = true;
  // flag2 checks second every other pair
  boolean flag2 = true;
 
    for (int i = 0; i < nums.length; i += 2) {
      // index 0 and index 2 then so on
      if (nums[i] != val) {
        flag1 = false;
      }
    }
 
    for (int i = 0; i < nums.length - 1; i += 2) {
       // index 1 and index 3 then so on
       if (nums[i + 1] != val) {
         flag2 = false;
       }
    }
    
    // returns true if only one of the flags are true
    return flag1 || flag2;
}

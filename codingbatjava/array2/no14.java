/*

Given an array of ints, return true if it contains no 1's or it contains no 4's.


no14([1, 2, 3]) → true
no14([1, 2, 3, 4]) → false
no14([2, 3, 4]) → true
*/

public boolean no14(int[] nums) {
  int one = 0;
  int four = 0;
  
  for (int i = 0; i < nums.length; i++)
  {
    if (nums[i] == 1)
    // Check for 1
    {
      one++;
    }
    if (nums[i] == 4)
    // Check for 4
    {
      four++;
    }
  }
  
  if (one == 0 || four == 0)
  // True if no 1 or 4; false otherwise
  {
    return true;
  }
  else 
  {
    return false;
  }
  
}

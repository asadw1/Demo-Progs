  /*
  
  Given an array of ints, return true 
  if 6 appears as either the first or last element in the array. 
  The array will be length 1 or more. 
  
  */
  
public class firstLast {
  public boolean firstLast6(int[] nums)
  {
    if((nums[0] == 6) || (nums[nums.length-1] == 6))
      return true;
    else
      return false;
  }
  
  // Tests the firstLast6 function with sample data
  public static void main(String[]args)
  {
    int test[] = {2,7,10,6,3,1,4,0,8};
    firstLast testObj = new firstLast();
    testObj.firstLast6(test);
  }
}


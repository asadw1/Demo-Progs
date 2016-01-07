/*
Given 2 arrays of ints, a and b, return true if they have the same first element 
or they have the same last element. Both arrays will be length 1 or more. 
*/

public class CommonEnd
{
  public boolean commonEnd(int[] a, int[] b) 
  {
    if((a[0] == b[0]) || (a[a.length-1] == b[b.length-1]))
      return true;
    else
      return false;  
  }
  
  public static void main(String[]args)
  {
    // Test data; both arrays meet "true" condition of commonEnd function
    int testA[] = {6,2,8}; 
    int testB[] = {6,0,3,8};
    
    CommonEnd testObj = new CommonEnd();
    testObj.commonEnd(testA,testB);
  }
}

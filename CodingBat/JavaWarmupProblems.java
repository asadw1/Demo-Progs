// Compiling my solutions for the CodingBat JavaWarmup1 problems here

// sleepIn
// The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. 
// We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in. 

public boolean sleepIn(boolean weekday, boolean vacation) {

  if((!weekday)||(vacation))
  {
    return true;
  }
  
  else
  {
   return false;
  }
}

// monkeyTrouble
// We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. 
// We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

if((aSmile && bSmile) || (!aSmile && !bSmile))
{
  return true;
}
else
  return false;
  
}

// sumDouble H
// Given two int values, return their sum. Unless the two values are the same, then return double their sum. 

public int sumDouble(int a, int b) {
  
  int sum = a + b;
  
  if(a != b)
  {
   return sum;
  }
  else
    return 2*sum;
}

// diff21 H 	 
// Given an int n, return the absolute difference between n and 21, except 
// return double the absolute difference if n is over 21.

public int diff21(int n) {
  // Math.abs(); is syntax for abs val.
  
  int absDifference = Math.abs(n-21);
  
  if(n > 21)
  {
    return 2*absDifference;
  } 
  else 
  {
    return absDifference;
  }
  
}

// parrotTrouble H 	 
// We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. 
// We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble. 

public boolean parrotTrouble(boolean talking, int hour) {
  
  if(talking && (hour < 7 || hour > 20))
   return true;
  else
  {
    return false;
  } 
}

// makes10 H
// Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

public boolean makes10(int a, int b) {
  int sum = a + b;
  return ((a == 10 || b == 10) || ( sum == 10));
}

// nearHundred H
// Given an int n, return true if it is within 10 of 100 or 200. 
// Note: Math.abs(num) computes the absolute value of a number.  

public boolean nearHundred(int n) 
{

  if(Math.abs(100 - n) <= 10)
    return true;
  if (Math.abs(200 - n) <= 10)
    return true;    
  else
    return false;
}


// posNeg H 	 
// Given 2 int values, return true if one is negative and one is positive. 
// Except if the parameter "negative" is true, then return true only if both are negative. 

public boolean posNeg(int a, int b, boolean negative)
{
  if(negative)
  {
    return (a<0 && b<0);
  }else
   return ((a < 0 && b > 0) || (a > 0 && b < 0));
}

// notString H
// Given a string, return a new string where "not " has been added to the front. 
// However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.

public String notString(String str) {
  
  String n = "not";
  
  if(str.length() >= 3 && str.substring(0, 3).equals("not"))
  {
    return str;
  }
  else
    return n+ " " + str;
} 

// missingChar H 	 
// Given a non-empty string and an int n, return a new string where the char at index n has been removed. 
// The value of n will be a valid index of a char in the original string (i.e. n will be in the range 
// 0..str.length()-1 inclusive). 

public String missingChar(String str, int n) 
{
  String begin = str.substring(0,n);
  String end = str.substring(n+1 , str.length());
  
  return begin + end;
  
}

/*  More to come!   */




// frontBack H 	 
// Given a string, return a new string where the first and last chars have been exchanged. 

// front3 H
//
// backAround H 	 
//
// or35 H 	 
//
// front22 H
//
// startHi H 	 
//
// icyHot H 	 
//
// in1020 H
//
// hasTeen H 	 
//
// loneTeen H 	 
//
// delDel H
//
// mixStart H 	 
//
// startOz H 	 
//
// intMax H
//
// close10 H 	 
//
// in3050 H 	 
//
// max1020 H
//
// stringE H 	 
//
// lastDigit H 	 
//
// endUp H
//
// everyNth H
//

/*
 * Asad Waheed
 * Lab 6
 * 04/06/14
 */

import java.util.Scanner;

public class ArrayIO
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Welcome. Please enter the number of values you would like in the array: \t");
        int num = input.nextInt();
        double array[] = new double[num];
        double usedValue = array[0];

        for(int counter = 0; counter < num; counter++)
        {
            System.out.print("Enter array value " + (counter +1) + ": \t");
            array[counter] = input.nextInt();
        }

        System.out.println();

        //method calls
        getMaxArray(array);
        getMinArray(array);
        computeAverage(array);
        sortArray(array);

    }

    //method to get max value of array
    public static double getMaxArray(double [] a)
    {
        double biggest = a[0];
        for(int i = 0; i < a.length; i++)
           {
               if (a[i] > biggest)
               {
                   biggest = a[i];
               }
           }
           System.out.println("Max Value: " + biggest);
           System.out.println();
        return biggest;
    }

    //method to get min value of array
    public static double getMinArray(double [] b)
    {
        double min = b[0];
        for(int i = 0; i < b.length; i++)
           {
               if(b[i] < min )
               {
                   min = b[i];
               }
           }
           System.out.println("Min Value: " + min);
           System.out.println();
        return min;
    }

    //method to get average of array
    public static void computeAverage(double x[])
    {
        double total = 0;
        for(int i = 0; i < x.length; i++)
           {
               total +=x[i];
           }
           double avg = total/x.length;
           System.out.println("Average: " + avg);
           System.out.println();
    }

    //method to sort array from max to min, using bubble sort
    public static void sortArray ( double [] y )
    {
        for ( int i = 0 ; i < y.length-1 ; i++ )
        {
            for ( int j = i+1 ; j < y.length ; j++ )
            {
                if ( y[j] > y[i] )
                {
                    double temp;
                    temp = y[i];
                    y[i] = y[j];
                    y[j] = temp;
                }
            }
        }
        System.out.println("Sorted array in descending order: ");
        for ( double array : y )
            System.out.print ( " " + array );
    }
}

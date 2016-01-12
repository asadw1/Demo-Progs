/*
 Asad Waheed
 Descending Bubble Sort Implementation
 Courtesy of JavaCodeGeeks! 
 Notes: This only requires a small change of the logic in bubbleSort() 
 to produce a descending-order array
*/


public class DescendingBubblesortExample 
{
	private static int []a; 
	
	public static void main(String[] args)
	{
		// Testing our methods...

		// get a randomly generated array
		a = getArray();
		
		// print array before sort
		printArray();
		System.out.println();
		// sort the array
		sort();
		System.out.println();

		// display the array
		printArray();
	}

	// internal calls to bubbleSort()
	public static void sort()
	{
		int left = 0;
		int right = a.length-1;

		bubbleSort(left, right);
	}

	private static void bubbleSort(int left, int right)
	{
		// outer loop runs right to left
		for( int i = right; i > 1; i--)
		{
			// inner loop runs left to right
			for( int j = left; j < i; j++)
			{	
				// SEE BELOW. We have changed from > to <, thus reordering from greatest to least
				// if left < than right, swap
				if(a[j] < a[j+1])
				{
					swap(j, j+1);
				}
			}
		}
	}

	// Swapping method using temp variable
	public static void swap(int left, int right)
	{
		int temp = a[left];
		a[left] = a[right];
		a[right] = temp;
	}

	public static void printArray()
	{
		for(int i : a)
		{
			System.out.print(i + " ");
		}
	}

	public static int[] getArray()
	{
		// Fixed size; for dynamic use Scanner class & I/O
		int size = 10;
		int []array = new int [size];
		int item = 0;
		for(int i = 0; i < size; i++)
		{
			// Casting result of item to an int
			item = (int)(Math.random() * 100);

			array[i] = item;
		}
		return array;
	}
}

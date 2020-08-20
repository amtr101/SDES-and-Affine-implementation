import java.util.*;

public class swapB
{
        public static void main(String [] args)
        {


		char[] key = {'1', '0', '0', '1', '0', '1', '1', '0'};

                char[] half1 = returnLeft(key); 

		char[] half2 = returnRight(key);
		
		

               printArry(half1); 
	       printArry(half2); 
        }


/********************************
 * Method:merge 
 * merges two arrays 
 * *****************************/

public static char[] merge(char[] arrA, char[] arrB)
{
	int a = arrA.length; 
	int b = arrB.length; 

	char[] outArr = new char[a+b]; 

	System.arraycopy(arrA, 0, outArr, 0, a);
        System.arraycopy(arrB, 0, outArr, a, b);

	return outArr; 

}


/********************************
 * Method:returnRight
 * returns the right half 
 * of an array
 * *****************************/

public static char[] returnRight(char[] orig)
{
        int n = orig.length;
        char[] right = Arrays.copyOfRange(orig, (n + 1)/2, n);

	return right;
}


/********************************
 * Method:returnLeft
 * returns the left half 
 * of an array
 * *****************************/

public static char[] returnLeft(char[] orig)
{
	int n = orig.length;
	char[] left =  Arrays.copyOfRange(orig, 0, (n + 1)/2);

	return left;

}





public static void printArry(char[] arr)
{
        for(int i = 0; i< arr.length; i++)
        {
                System.out.print(arr[i]);

        }


}



}


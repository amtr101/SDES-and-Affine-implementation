import java.util.*; 


public class shift
{
	public static void main(String [] args)
	{

		String inKey = "10011101";
		
		char[] key = inKey.toCharArray(); 

		int n = key.length; 	

		char[] half1 = Arrays.copyOfRange(key, 0, (n + 1)/2);

		char[] half2 = Arrays.copyOfRange(key, (n + 1)/2, n);

	 
		leftRotate(half2, 1, 4);  
		printArry(half2); 
		

	}


	

/********************************
 * Method:leftShift wrapper method
 * for lefShiftby
 * *****************************/

 public static void leftShift(char arr[], int d, int n) 
    { 
        for (int i = 0; i < d; i++) 
            leftShiftby(arr, n); 
    } 

 /************************
  * Method:leftShiftOne
  * performs a shift by one 
  *************************/ 
  
 public static  void leftShiftOne(char arr[], int n) 
    { 
        int i;
       	char temp; 	
        temp = arr[0]; 
        for (i = 0; i < n - 1; i++) 
            arr[i] = arr[i + 1]; 
        arr[i] = temp; 
    } 




public static void printArry(char[] arr)
{
	for(int i = 0; i< arr.length; i++)
	{
		System.out.print(arr[i]); 

	} 


} 

} 

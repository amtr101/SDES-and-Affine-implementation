import java.util.*; 

public class permutation
{
	public static void main(String [] args)
	{
	
		char[] arr = {'0','1', '1', '0'};  
		
		char[] key = {'1' , '0' , '1' , '0' , '0' , '1' , '0', '0'}; 
	
		char[]  ex = EP(arr);

		char[] or = xor(ex, key); 	

		printArry(or); 	
		
	}


/********************************
 * Method:xor
 * implements XOR(exclusive or) on 
 * two char arrays 
 * *****************************/ 
	
public static char[] xor(char[] inArr, char[] inKey)
{
	char[] xor = new char[8]; //create new array 

	for(int i = 0; i < 8; i++)
	{
		if((inArr[i]^inKey[i]) == 1) //perform^ on each char
		{
			xor[i] = '1'; 
		}else 
		{
			xor[i] = '0';	
	
		} 
	} 

       return xor; 	
}  	

/********************************
 * Method:EP
 * implements Expansion Permutation
 * *****************************/
        
public static char[] EP(char[] in4bit)
{

 	char[] expand = new char[8]; //size of new array

	int[] EP = {4, 1, 2, 3, 2, 3, 4, 1}; //array representing EP
	int temp; 

	for(int i = 0; i < EP.length; i++)
	{
		temp = EP[i]; 
		expand[i] = in4bit[temp-1]; //fill expand[] with specifed index

	}
	
	return expand; 

} 



/********************************
 * Method:IP
 * implements Inital Permutation
 * *****************************/
        
public static char[] IP(char[] inByte)
{

        int[] IP = {2, 6, 3, 1, 4, 8, 5, 7}; //array representation of IP

	char[] keyB = new char[inByte.length]; //new array to hold final permutation

        int temp;

	for(int i = 0; i < IP.length; i ++)
        {
                temp = IP[i];
                keyB[i] = inByte[temp-1];

        }

	return keyB; 
         
}


/********************************
 * Method:p4
 * implements P4 (permutation 4)
 * *****************************/
        
public static void p4(char[] inByte)
{
	int[] P4 = {2, 4, 3, 1}; 

	char[] newByte = new char[4]; 

	int temp; 
	for(int i = 0; i < P4.length; i++)
	{
		temp = P4[i]; 
		newByte[i] = inByte[temp-1]; 
	} 

//	printArry(newByte); 
} 

	
/********************************
 * Method:p8
 * implements P8 (permutation 8)
 * *****************************/


public static void p8(char[] inByte)
{

	int[] P8 = {6, 3, 7, 4, 8, 5, 10, 9}; 

	char[] keyB = new char[8];	

	int temp;  


	for(int i = 0; i < P8.length; i ++)
	{
		temp = P8[i]; 
		keyB[i] = inByte[temp-1]; 
			   
	} 

//	 printArry(keyB); 
} 


/********************************
 * Method:p10
 * implements P10 (permutation 10)
 * *****************************/

public static void p10(char[] keyA)
{
	int[] P10 = {3,5,2,7,4,10,1,9,8,6}; 

	char[] keyB = new char[10]; 	

	int temp;  


	for(int i = 0; i < P10.length; i ++)
	{
		temp = P10[i]; 
		 keyB[i] = keyA[temp-1]; 
	} 

} 


public static void printArry(char[] arr)
{
        for(int i = 0; i< arr.length; i++)
        {
                System.out.print(arr[i]);

        }
}




}

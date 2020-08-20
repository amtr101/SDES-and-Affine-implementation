import java.util.*; 

public class sBox
{
	public static void main(String[] args)
	{

	
	char[] arr = {'1','0', '0', '1', '1', '0', '0', '0'};

	

		                                             
	String  coord = sBox0(returnLeft(arr)) + sBox1(returnRight(arr)); 
	System.out.println(coord); 



	} 


/********************************
 * Method:sBox0
 * 2d array implementation of 
 * S-Box 0 
 * *****************************/
public static String sBox0(char[] left)
{
 	 int[][] s0 = {  {1, 0, 3, 2},
                         {3, 2, 1, 0},
                         {0, 2, 1, 3},
                         {3, 1, 3, 2}, };


	String R1, C1; 

	R1 =  charToBinStr(left[0]) + charToBinStr(left[3]);
        C1 =  charToBinStr(left[1]) + charToBinStr(left[2]);
	
	int idxA = strToInt(R1); 
	int idxB = strToInt(C1); 

	int c = s0[idxA][idxB]; 

	String str = intToStr(c); 


	
	return str; 


} 


public static String sBox1(char[] right)
{
           int[][] s1 = {  {0, 1, 2, 3},
                           {2, 0, 1, 3},
                           {3, 0, 1, 0},
                           {2, 1, 0, 3}, };


        String R2, C2;

        R2 =  charToBinStr(right[0]) + charToBinStr(right[3]);
        C2 =  charToBinStr(right[1]) + charToBinStr(right[2]);

        int idxA = strToInt(R2);
        int idxB = strToInt(C2);

        int c = s1[idxA][idxB];

        String str = intToStr(c);

       

        return str;


}


public static String charToBinStr(char c)
{
	String BinStr = Character.toString(c); 

	return BinStr;  

} 

public static int strToInt(String str)
{
	int a = Integer.valueOf(str, 2);

	return a; 
} 

public static char[] strToCharArr(String inString) 
{
	char[] binChar = inString.toCharArray(); 
	
	return binChar; 
} 

public static String intToStr(int a)
{
	String str = Integer.toString(a, 2); 

	return str; 
}

/********************************
 * Method:sBox0
 * 2d array implementation of
 * S-Box 1
 * *****************************/

} 

import java.util.*; 
import java.io.*; 

public class fileIO
{
	public static void main(String [] args)	throws IOException
	{

		InputStream inStream = new FileInputStream("testfile-SDES.txt");
                Reader readStrm = new InputStreamReader(inStream);

                int data = readStrm.read();
		

		OutputStream output = new FileOutputStream("test.txt");
	

		

              	while(data != -1)
                {
                        char a =  (char)data;


			String bob = Integer.toString(a, 2);

			bob =  "01101101";

			int c = Integer.valueOf(bob, 2);
			
			char d = (char)c; 
			output.write(d); 



			data = readStrm.read();
			

                }

		 
                
		 output.close();
		readStrm.close();




	}




} 

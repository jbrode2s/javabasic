import java.io.*;

class CheckedExceptions {  
	public static void main(String args[])
	{
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("B:/myfile.txt"); 
		} catch(FileNotFoundException fnfe) {
			System.out.println("Leider keine Datei gefunden!");
		}
		int k; 
		
		try {
			while(( k = fis.read() ) != -1) 
			{ 
				System.out.print((char)k); 
			} 
			fis.close(); 	
		} catch(NullPointerException ex, IOException ioe) {
			System.out.println(ex);
			System.out.println(ioe);
		}
	}
}
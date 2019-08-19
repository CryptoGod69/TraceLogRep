package mixmag;

import java.io.*;

public class App {
	public static void main (String args[]) throws Exception
	{
	 /*readfile r = new readfile();
	 r.openFile();
	 r.readFile();
	 r.closeFile();
     */
		DbConnect connect = new DbConnect();
		
		readfile r = new readfile();
		try {
			connect.getData();
			r.PickMe();
			
		   }
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}


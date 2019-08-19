package mixmag;
import java.io.*;

import javax.swing.JFileChooser;

public class readfile {
	JFileChooser fileChooser = new JFileChooser();
	StringBuilder sb = new StringBuilder();

	private int lineNbr=0;
	 private int thNbr;
	 int[] countArray = new int[10];

	public int getlineNbr() {
		return lineNbr;
	}
	public void setlineNbr(int number) {
		lineNbr=number;
	}
	public int getthNbr() {
		return thNbr;		
	}
	public void setthNbr(int thNbry) {
		thNbr=thNbry;
	}
	public void readLines(File f) throws IOException {
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String line;
	while((line = br.readLine()) != null) {
		/*System.out.println(line);*/
		lineNbr++;
		int intIndexDate = line.indexOf("|");
		int intIndexApp = line.indexOf("-");
		int intIndex = line.indexOf("WebContainer : ");
		int intIndexDef=line.indexOf("default:");
		int intIndexHalfUser= line.indexOf("]");
		int intIndexQuery=line.indexOf("Query:");
        int  intIndexFinQuery=line.indexOf(")");

		/*System.out.println(intIndex);*/
		if(intIndex == -1 ) 
		{ 
			 // System.out.println("NO Thread fails in line "+lineNbr);
		
		}else {			
			int checkdate=intIndexDate;
			int checkpoint=intIndex;
			String threadNbr = line.substring(checkpoint+15,checkpoint+16);
		    String DateConv = line.substring(0, checkdate-1);
			String AppConv = line.substring(intIndexDate+1,intIndexApp);
			String UserConv = line.substring(intIndexHalfUser+2,intIndexDef-1);
		    System.out.println(DateConv+"  Exception found in line "+ lineNbr +" in APP = "+AppConv+" with the thread   " + threadNbr +" Username = " + UserConv );
			thNbr=Integer.parseInt(threadNbr);
			countArray[thNbr]=countArray[thNbr]+1;
			/* implementation de recherche nbr thread*/			
			/*if(intIndexQuery == -1 ) {
			    System.out.println(DateConv+"  Exception found in line "+ lineNbr +" in APP = "+AppConv+" with the thread   " + threadNbr +" Username = " + UserConv );

			}else {
				String QueryConv=line.substring(intIndexQuery);
			    System.out.println(DateConv+"  Exception found in line "+ lineNbr +" in APP = "+AppConv+" with the thread   " + threadNbr +" Username = " + UserConv+" Query = "+QueryConv );
		}
		*/
	}
	}
	br.close();
	fr.close();
	}
	
	public static int maximumMeth (int x, int y) {
		int top;
		if( x > y) {
			top=x;
		}else
		    top=y;
	return top;
	}
	public void PickMe() throws Exception{
		if(fileChooser.showOpenDialog(null)== JFileChooser.APPROVE_OPTION) {
			java.io.File file = fileChooser.getSelectedFile();
			readfile x = new readfile();
			x.readLines(file);
			int toop=maximumMeth(54,99);
            sb.append("it works ! Max thread is = "+toop);
          int k=0;
            for(k=1;k < x.countArray.length;k++) {	
            	System.out.printf("IN Thread Number  : "+k+" \n");

            	System.out.printf(x.countArray[k]+" Problems : ");
            }
            }else {
			sb.append("no File Selected");
		}
		
		
}
}

package mixmag;

import java.sql.*;
public class DbConnect {

private Connection con;
private Statement st;
private ResultSet rs;

public DbConnect() {
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Jaoek behi");
  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/megara","root","");
  st  = con.createStatement();
	}catch(Exception e){
		System.out.println("Errorx : "+ e);
		
	}
	
	
}

public void getData() {

	try {
		
		String Query= "SELECT * FROM filelines";
		rs = st.executeQuery(Query);
		System.out.println("Records from database : ");
		while(rs.next()) {
			int id=rs.getInt("lineID");
			String filename= rs.getString("fileName");
			int threadnbr= rs.getInt("threadNbr");
			int expnbr= rs.getInt("expNbr");
			String date= rs.getString("Date");
			int linenbr= rs.getInt("lineNbr");
			String query= rs.getString("Query");
			int returnsize= rs.getInt("returnSize");
			
			System.out.println(filename+"\n"+id+"\n"+threadnbr+"\n"+expnbr+"\n"+date+"\n"+linenbr+"\n"+query+"\n"+returnsize+"\n"+"\n");



		}
	}catch(Exception e) {
		System.out.printf("ErrorGD" + e);
	}
	
	
}
}
package jdbc;
import java.sql.*;

public class SelectData1 { 
	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		
		//At a time you can solve single query by this method
		
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/SQLDBwithJava","root","Focus#203");
	Statement st=con.createStatement();
	int n=st.executeUpdate("Insert into SQLDBwithJava values(105,'Radhika',20,4500)");
	//int n=st.executeUpdate("delete from SQLDBwithJava where id=103");
	//int n=st.executeUpdate("update SQLDBwithJava set name='Rd Arya' where id=105");
	System.out.println(n+"No of records are inserted int the SQLDBwithJava)");
	con.close();
	}
}




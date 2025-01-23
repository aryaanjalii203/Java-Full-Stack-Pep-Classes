package jdbc;

import java.sql.*;
import java.util.Scanner;

public class SelectData2 {
	

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/SQLDBwithJava","root","Focus#203");
		Statement st=con.createStatement();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your query");
		String query=sc.nextLine();
		if(st.execute(query)) {
		ResultSet rs=st.getResultSet();
		while (rs.next()) {
			System.out.println(rs.getInt(1)+rs.getString(2)+rs.getInt(3)+rs.getInt(4));
		}
		}else {
			int n=st.getUpdateCount();
			System.out.println(n+" No of records have been added now.... ");
		}sc.close();

	}

}

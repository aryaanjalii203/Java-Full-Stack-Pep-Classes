package jdbc;

import java.sql.*;
import java.util.Scanner;

public class PreparedSatement {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/SQLDBwithJava","root","Focus#203");
		//PreparedSatement psmt=con.prepareStatement("delete from SQLDBwithJava where id=?");
		
		PreparedStatement psmt=con.prepareStatement("update SQLDBwithJava set name=? where id =?");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the user's name");
		String newname=sc.next();
		System.out.println("Enter the user that you want to update...");
		int userid=sc.nextInt();
		psmt.setString(1,newname);
		psmt.setInt(2,userid);
		int n=psmt.executeUpdate();
		System.out.println(n+"record is updated from SQLDBwithJava");

	}
}

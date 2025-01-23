package jdbc;

import java.sql.*;

public class SelectData {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/SQLDBwithJava","root","Focus#203");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from SQLDBwithJava");
		while (rs.next()) {
			System.out.println(rs.getInt(1)+rs.getString(2)+rs.getInt(3)+rs.getInt(4));
		}

	}

}

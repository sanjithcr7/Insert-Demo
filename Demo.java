import java.sql.*;

public class Demo {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "tiger");
			Statement stmt = con.createStatement();
			stmt.execute("create table test1(sno int,name varchar2(10),marks int)");
			System.out.print("Table created Successfully");

		} catch (Exception e) {
			System.err.println(e);
		}

	}

}

import java.sql.*;

public class Prepare1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "tiger");
			PreparedStatement ps = con.prepareStatement("insert into test1 values(?,?,?)");
			ps.setInt(1, Integer.parseInt(args[0]));
			ps.setString(2, args[1]);
			ps.setInt(3, Integer.parseInt(args[2]));
			ps.executeUpdate();
			System.out.print("One record Inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

import java.sql.*;

public class CallInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "tiger");
		CallableStatement cs=con.prepareCall("{call insertpro(?,?,?)}");
		cs.setInt(1, Integer.parseInt(args[0]));
		cs.setString(2, args[1]);
		cs.setInt(3,Integer.parseInt(args[2]));
		cs.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

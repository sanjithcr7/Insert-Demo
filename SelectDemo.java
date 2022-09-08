import java.sql.*;

public class SelectDemo {

	public static void main(String[] args) {

		
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "tiger");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select * from test1 where marks<=40");
				ResultSetMetaData rm=rs.getMetaData();
				int n=rm.getColumnCount();
				for(int i=1;i<=n;i++) {
					System.out.print(rm.getColumnName(i)+"\t");
				}
				System.out.println();
				while(rs.next()) {
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
				}
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		
	
	}

}

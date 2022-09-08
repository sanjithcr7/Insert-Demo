import java.sql.*;


public class SelectPrepare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system" ,"tiger" );
			PreparedStatement ps=con.prepareStatement("select * from test1 where sno=?");
			ps.setInt(1,Integer.parseInt(args[0]));
			ResultSet rs=ps.executeQuery();
			ResultSetMetaData rm=rs.getMetaData();
			int n=rm.getColumnCount();
			for(int i=1;i<=n;i++) {
				System.out.print(rm.getColumnName(i)+"\t");
			}
			System.out.println();
			
			while(rs.next()) {
				System.out.println(rs.getInt("sno")+"\t"+rs.getString("name")+"\t"+rs.getInt("marks"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}

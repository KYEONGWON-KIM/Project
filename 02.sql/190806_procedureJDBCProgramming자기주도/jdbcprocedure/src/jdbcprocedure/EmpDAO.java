package jdbcprocedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class EmpDAO {
	public static void EmpDAO(int empno) throws SQLException{

		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String id = "SCOTT";
		String pw = "TIGER";
	
		Connection con = null;
		CallableStatement cstmt = null;
	
		try	{
			con = DriverManager.getConnection(url, id, pw);
	
			cstmt = con.prepareCall("{call info_empinfo( ? , ? , ?) }");
			cstmt.setInt(1, empno);
			cstmt.registerOutParameter(2, Types.VARCHAR);
			cstmt.registerOutParameter(3, Types.DATE);
			cstmt.execute();
	
			System.out.println(cstmt.getString(2));
			System.out.println(cstmt.getString(3));
		}finally{
			if (cstmt != null) {
				cstmt.close();
			}
			if (con != null) {
				con.close();
			}
		}
	
	}
	public static void main(String[] args) {
 		  try {
 			 EmpDAO(7369);
		  } catch (SQLException e) {
			  e.printStackTrace();
		  } 
	 }
}

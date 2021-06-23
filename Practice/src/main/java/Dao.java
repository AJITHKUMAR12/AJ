import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {
	
	
	String sql = "Selsct * from data wher name=? and pass=?";
	String url = "jdbc:mysql://localhost:3306/data";
	String username = "root";
	String password = "root";
	
	
	public boolean check(String name,String pass) {
		try {
			Class.forName("com.mysql:jdbc:driver");
			Connection con = DriverManager.getConnection("url,username,password");
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(0, name);
			st.setString(1, pass);
			
			
			ResultSet rs = st.executeQuery();
			if(rs.next()) {
				return true;
			}
			
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	
		}
		
	}
			


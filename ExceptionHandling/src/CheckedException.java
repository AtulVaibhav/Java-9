import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckedException {
   
	public void m1(){
		//Class.forName("com.mysql.cj.jdbc.Driver");
		
		try {
			DriverManager.getConnection("");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new CheckedException().m1();

	}

}

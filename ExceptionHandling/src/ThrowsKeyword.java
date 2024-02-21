import java.sql.SQLException;

public class ThrowsKeyword {
    public static void m1() throws SQLException{
    	throw new SQLException();
    }
    public static void m2() throws SQLException{
    	m1();
    }
	public static void main(String[] args)throws SQLException {
           m2();
		
	}

}

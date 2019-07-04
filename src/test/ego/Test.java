package ego;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.ego.system.db.DBUtils;

public class Test {
	public static void main(String args[]) {
		try {
			Connection connection=DBUtils.getConnection();
			Statement statement= connection.createStatement();
			statement.execute("insert into test value(2222,1)");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

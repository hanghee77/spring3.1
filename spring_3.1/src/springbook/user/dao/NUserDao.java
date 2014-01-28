package springbook.user.dao;

import java.sql.Connection;
import java.sql.SQLException;

public class NUserDao extends AbstractUserDao {

	@Override
	public Connection getConnection() throws ClassNotFoundException,
			SQLException {
		// N 사 DB Connection 생성코드 
		return null;
	}

}

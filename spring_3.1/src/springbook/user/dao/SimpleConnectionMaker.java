package springbook.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//더 이상 상속을 이용한 확장 방식을 사용할 필요가 없으니 추상 클래스로 만들 필요가 없다.
public class SimpleConnectionMaker {
	public Connection makeNewConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1/springdb?characterEncoding=utf8", "root", "wemakeprice");
		return c;
	}
}

package com.heima;

import java.sql.SQLException;

public class Serivce {

	public int finduername(String username, String password) throws SQLException {
		Dao dao = new Dao();
		int count = dao.findusername(username, password);
		return count;
	}

}

package com.heima;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

public class Dao {

	public int findusername(String username, String password) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
		String sql = " select count(*) from tbl_user where username = ? and password = ? ";
		Object[] params = { username, password };
		Object obj = queryRunner.query(sql, new ScalarHandler(), params);
		int count = Integer.valueOf(obj.toString());
		return count;
	}

}

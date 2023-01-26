package com.project.testcase;

public class TestDbConnection {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {


		DBManager.setMysqlDbConnection();
		System.out.println(DBManager.getMysqlQuery("select tutorial_author from selenium where tutorial_id = 2"));

	}

}

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MoIYadah
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Configuration {
	private static Connection mysqlconfig;

	public static Connection configDB() throws SQLException {
		try {
			String url = "jdbc:mysql://localhost:3306/bugzilla?autoReconnect=true&useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai";
			String user = "root";
			String pass = "root";
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			mysqlconfig = DriverManager.getConnection(url, user, pass);
		} catch (Exception e) {
			System.err.println("Koneksi Gagal\nError:" + e.getMessage());
		}
		return mysqlconfig;
	}
}

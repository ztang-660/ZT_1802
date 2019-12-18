package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Gengxin {

	public static void main(String[] args) throws Exception{
		//注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//通过驱动获得连接对象
		Connection lianjie=DriverManager.getConnection("aaaa:mysql://127.0.0.1:3306/jdbc","root","123456");
		//通过连接对象获得语句对象
		Statement yuju=lianjie.createStatement();
		//定义更新sql语句
		String  sql="UPDATE 18rj2 SET `左眼裸眼视力` ='"+zuo_shili+"' WHERE ``学号 = "+xuehao+"";
		//通过语句对象执行sql语句
		yuju.execute(sql);

	}

}

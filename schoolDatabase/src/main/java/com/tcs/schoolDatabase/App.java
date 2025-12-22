package com.tcs.schoolDatabase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.tcs.schoolDatabase.beans.Student;
import com.tcs.schoolDatabase.config.AppConfig;
import com.tcs.schoolDatabase.utility.MyRowMapper;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws SQLException {
		// JDBC Template
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		JdbcTemplate obj = (JdbcTemplate) context.getBean("template");

//    	String insertQuery = "insert into student(name, age) values('little akash', 2)";
//    	obj.execute(insertQuery);

//    	String updateQuery = "update student set age = 1 where id = 3";
//    	obj.execute(updateQuery);

//    	String deleteQuery = "delete from student where id =1";
//    	obj.execute(deleteQuery);

//    	String selectQuery = "select * from student";
//    	MyRowMapper friend = new MyRowMapper();
//    	List<Student> data = obj.query(selectQuery, friend);
// 
//    	for (Student x : data) {
//    		System.out.println(x);
//    	}

		String selectQuery = "select * from student";
		List<Student> data = obj.query(selectQuery, new RowMapper<Student>() {

			public Student mapRow(ResultSet row, int rowNum) throws SQLException {
				Student obj = new Student();
				obj.setId(row.getInt("id"));
				obj.setName(row.getString("name"));
				obj.setAge(row.getInt("age"));
				return obj;
			}
		});

		for (Student x : data) {
			System.out.println(x);
		}

		// TRADITIONAL JDBC METHOD
//    	
//    	// Create Query
//    	String query = "insert into student(name, age) values('ruchitha', 23)";
//    	
//    	// Establish Connection
//    	DataSource connection = (DataSource) context.getBean("databaseHelper");
//    	Connection obj = connection.getConnection();
//    	
//    	// Fire Query
//    	PreparedStatement statement = obj.prepareStatement(query);
//    	int rowsAffected = statement.executeUpdate();
//    	
//    	System.out.println(rowsAffected + " rows affected");
	}
}

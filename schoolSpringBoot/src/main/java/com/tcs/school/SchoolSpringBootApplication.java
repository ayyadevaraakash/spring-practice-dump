package com.tcs.school;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.tcs.school.bean.Employee;

@SpringBootApplication
public class SchoolSpringBootApplication implements CommandLineRunner {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	// CONSTRUCTOR INJECTION
//	@Autowired
//	public SchoolSpringBootApplication(JdbcTemplate jdbcTemplate) {
//		this.jdbcTemplate = jdbcTemplate;
//	}
	
	// SETTER INJECTION
//	@Autowired
//	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//		this.jdbcTemplate = jdbcTemplate;
//	}

	public static void main(String[] args) {
		SpringApplication.run(SchoolSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		String insertQuery = "insert into employee values (4, 'Vijaylakshmi')";
//		jdbcTemplate.execute(insertQuery);
		
		String selectQuery = "select * from employee";
		List<Employee> list = jdbcTemplate.query(selectQuery, new RowMapper<Employee>() {
			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee e = new Employee();
				e.setId(rs.getInt("id"));
				e.setName(rs.getString("name"));
				return e;
			}
		});
		
		System.out.println(list);
	}
	
}

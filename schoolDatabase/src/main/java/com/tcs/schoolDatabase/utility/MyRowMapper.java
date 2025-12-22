package com.tcs.schoolDatabase.utility;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tcs.schoolDatabase.beans.Student;

public class MyRowMapper implements RowMapper<Student>  {

	public Student mapRow(ResultSet row, int rowNum) throws SQLException {
		Student obj = new Student();
		obj.setId(row.getInt("id"));
		obj.setName(row.getString("name"));
		obj.setAge(row.getInt("age"));
		return obj;
	}
}

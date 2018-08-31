package org.itstep;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDAO {

	public void saveStudent(Student student) {
		
		Connection connection = null;
		PreparedStatement statement = null;
		
		try {
			connection = ConnectionDB.getConnection();
			statement = connection.prepareStatement("INSERT INTO student(id, f_name, s_name, age, curs) VALUES(?, ?, ?, ?, ?)");
			statement.setInt(1, student.getId());
			statement.setString(2, student.getFirstName());
			statement.setString(3, student.getSecondName());
			statement.setInt(4, student.getAge());
			statement.setString(5, student.getCurs());
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
package co.grandcircus.coffeeshoplab.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.grandcircus.coffeeshoplab.entity.User;

@Repository
public class UsersDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void createUser(User user) {
		String sql = "INSERT INTO Users (firstName, lastName, emailAddress, phoneNumber, password) VALUES (?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql, user.getFirstName(), user.getLastName(), user.getEmailAddress(), user.getPhoneNumber(),
				user.getPassword());

	}

}

package co.grandcircus.coffeeshoplab;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ItemsDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Item> findAll() {
		String sql = "SELECT * FROM Items";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Item.class));

	}

}

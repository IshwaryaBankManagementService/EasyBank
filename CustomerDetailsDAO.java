package com.maven.easybank.api.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.maven.easybank.rowmapper.CustomerRowMapper;

@Repository
public class CustomerDetailsDAO implements GetDetailsDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<CustomerDetails> getDetails(int user_id, Character[] password) {

		String stringPwd = password.toString();
		String sql = "select * from customer where user_id = '" + user_id + "'" + " and pwd = '" + stringPwd + "'";
		List<CustomerDetails> custDet = jdbcTemplate.query(sql, new CustomerRowMapper());
		return custDet;
	}
}

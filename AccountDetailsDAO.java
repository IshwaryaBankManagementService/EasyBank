package com.maven.easybank.api.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.maven.easybank.rowmapper.AccountRowMapper;

@Repository
public class AccountDetailsDAO implements GetDetailsDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<AccountDetails> getDetails(int user_id, Character[] password) {

		String sql = "select * from acct_det where user_id = '" + user_id + "'";
		List<AccountDetails> acctDet = jdbcTemplate.query(sql, new AccountRowMapper());
		return acctDet;
	}

}

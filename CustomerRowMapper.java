package com.maven.easybank.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.maven.easybank.api.DAO.CustomerDetails;

public class CustomerRowMapper implements RowMapper<CustomerDetails> {

	@Override
	public CustomerDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		CustomerDetails custDet = new CustomerDetails();
		custDet.setFirst_name(rs.getString("first_name"));
		custDet.setLast_name(rs.getString("last_name"));
		return custDet;
	}

}

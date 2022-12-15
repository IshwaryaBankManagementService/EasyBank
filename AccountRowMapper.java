package com.maven.easybank.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.maven.easybank.api.DAO.AccountDetails;

public class AccountRowMapper implements RowMapper<AccountDetails>{

	@Override
	public AccountDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		AccountDetails acctDet = new AccountDetails();
		acctDet.setAcct_num(rs.getString("acct_num"));
		acctDet.setAcct_type(rs.getString("acct_type"));
		acctDet.setAmt(rs.getDouble("amt"));
		return acctDet;
	}

}

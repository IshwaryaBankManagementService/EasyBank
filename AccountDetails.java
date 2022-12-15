package com.maven.easybank.api.DAO;

public class AccountDetails {

	String acct_num;
	String acct_type;
	double amt;

	public String getAcct_num() {
		return acct_num;
	}

	public void setAcct_num(String acct_num) {
		this.acct_num = acct_num;
	}

	public String getAcct_type() {
		return acct_type;
	}

	public void setAcct_type(String acct_type) {
		this.acct_type = acct_type;
	}

	public double getAmt() {
		return amt;
	}

	public void setAmt(double amt) {
		this.amt = amt;
	}

}

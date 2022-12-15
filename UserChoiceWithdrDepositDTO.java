package com.maven.easybank.api.DTO;

public class UserChoiceWithdrDepositDTO {

	private String userOpt, accttype, acctNum;
	private double acctbalance, amount;

	public String getAcctNum() {
		return acctNum;
	}

	public void setAcctNum(String acctNum) {
		this.acctNum = acctNum;
	}

	public double getAcctbalance() {
		return acctbalance;
	}

	public void setAcctbalance(double acctbalance) {
		this.acctbalance = acctbalance;
	}

	public String getUserOpt() {
		return userOpt;
	}

	public void setUserOpt(String userOpt) {
		this.userOpt = userOpt;
	}

	public String getAccttype() {
		return accttype;
	}

	public void setAccttype(String accttype) {
		this.accttype = accttype;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}

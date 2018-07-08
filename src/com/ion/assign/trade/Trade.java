package com.ion.assign.trade;

import resource.AccountType;
import resource.Exchange;

public class Trade {
	private AccountType client;
	private int qty;
	private float fees;
	private Exchange exchange;
	
	public Trade(AccountType client, int quantity, Exchange exchange) {
		this.client = client;
		qty = quantity;
		this.exchange = exchange;
	}

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public AccountType getClient() {
		return client;
	}

	public Exchange getExchange() {
		return exchange;
	}

	public void setExchange(Exchange exchange) {
		this.exchange = exchange;
	}

	public void setClient(AccountType client) {
		this.client = client;
	}
}

package com.ion.assign.Calculators;

import com.ion.assign.trade.Trade;



public class CMECalculator implements TradeFeeCalculator{

	private ExchangeRules rules;
	
	public CMECalculator(ExchangeRules rules) {
		this.rules = rules;
	}
	
	@Override
	public float calculate(Trade trade) {
		return rules.get(trade.getClient()).calculate(trade);
	}

}
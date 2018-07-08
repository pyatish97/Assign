package com.ion.assign.Calculators;
import com.ion.*;
import com.ion.assign.trade.Trade;


public class BSECalculator {
private ExchangeRules rules;
	
	public BSECalculator(ExchangeRules rules) {
		this.rules = rules;
	}
	
	public float calculate(Trade trade) {
		return rules.get(trade.getClient()).calculate(trade);
	}

}

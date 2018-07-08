package com.ion.assign.RuleBag;

import java.util.HashMap;

import com.ion.assign.Calculators.TradeFeeCalculator;


import resource.Exchange;

public class RuleBag {
	
	HashMap<Exchange, TradeFeeCalculator> rules = new HashMap<Exchange, TradeFeeCalculator>();
	
	public void register (Exchange exchange, 
			TradeFeeCalculator calc) {
		rules.put(exchange, calc);
	}
	
	public TradeFeeCalculator get(Exchange exchange) {
		return rules.get(exchange);
	}
	
}

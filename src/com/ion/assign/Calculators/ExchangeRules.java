package com.ion.assign.Calculators;


import java.util.HashMap;

import resource.AccountType;

public class ExchangeRules {
	
	HashMap<AccountType, Calculator> rules = new HashMap<AccountType, Calculator>();
	
	public void register(AccountType accountType, BSECalculator bseCalculator) {
		rules.put(accountType, (Calculator) bseCalculator);
	}
	
	public Calculator get(Object object) {
		return rules.get(object);
	}
	
}

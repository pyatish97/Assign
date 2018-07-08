package main;

import resource.AccountType;

import com.ion.assign.Calculators.BSECalculator;
import com.ion.assign.Calculators.ExchangeRules;
import com.ion.assign.RuleBag.RuleBag;


public class AssignMain {
	
	public static void main(String[] args) {
		
		ExchangeRules BSERules = new ExchangeRules();
		BSERules.register(AccountType.ELITE, new BSECalculator(BSERules));
		BSERules.register(AccountType.PRIME, new BSECalculator());
		BSERules.register(AccountType.REGULAR, new BSECalculator(BSERules));
		
		ExchangeRules CMERules = new ExchangeRules();
		CMERules.register(AccountType.ELITE, new EliteCMECalculator());
		CMERules.register(AccountType.PRIME, new OtherCMECalculator());
	
		
		ExchangeRules LMERules = new ExchangeRules();
		LMERules.register(AccountType.ELITE, new LMECalculator());
		LMERules.register(AccountType.PRIME, new LMECalculator());
		LMERules.register(AccountType.REGULAR, new LMECalculator());
		
		RuleBag rules = new RuleBag();
		rules.register(Exchange.BSE, new BSEFeeCalculator(BSERules));
		rules.register(Exchange.CME, new CMEFeeCalculator(CMERules));
		rules.register(Exchange.LME, new LMEFeeCalculator(LMERules));
		
		Trade trade = new Trade(AccountType.PRIME, 3, Exchange.LME);
		
		float fees = rules.get(trade.getExchange()).calculate(trade);
		System.out.println(fees);
		
	}
	
}

package com.adeccotraining.JenkinsSample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.adeccotraining.JenkinsSample.BankAccount;

public class TestBankAccount {
	
	@Test
	
	public void testDebit(){
		
		BankAccount ac = new BankAccount(10.0);
		assertEquals("if i debit 15 in a BankAccount of 10 all 10 are debit",ac.debit(15),10.0,0);
		
	}

}

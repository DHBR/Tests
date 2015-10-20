package io.github.virtualiceshard.tests.lucktests;

//version 1.0
//developed by VirtualIceShard


//@author VirtualIceShard
//@version 1.0

public class Main {

	public static void main(String args[]) {
	
		String[] testSucMes = {"@","#","$","%","*"};
		
		
		String[] testFailMes = {"fail","fail","fail","fail","fail"};
	
		int[] testChances = {30,50,70,90,100};
		
		
		LuckTester test = new LuckTester(5,testSucMes,testFailMes,testChances);
		
		test.startTest();
	}
}

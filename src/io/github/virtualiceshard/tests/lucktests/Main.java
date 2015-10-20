package io.github.virtualiceshard.tests.lucktests;

public class Main {

	public static void main(String args[]) {
	
		String[] testSucMes = {"@","#","$","%","*"};
		
		
		String[] testFailMes = {"fail","fail","fail","fail","fail"};
	
		int[] testChances = {30,50,70,90,100};
		
		
		LuckTester test = new LuckTester(5,testSucMes,testFailMes,testChances);
		
		test.startTest();
	}
}

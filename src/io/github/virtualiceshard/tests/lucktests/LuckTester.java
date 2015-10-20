package io.github.virtualiceshard.tests.lucktests;


//version 1.0
//developed by VirtualIceShard


//@author VirtualIceShard
//@version 1.0

public class LuckTester {

	private boolean[] testSucList;
	private String[] testSucMessages;
	private String[] testFailMessages;
	private int[] testSuccessRates;
	private int randomNum;
	private boolean restartTest;
	private String[] testMessages;
	int numOfTests;
	

	
	
	LuckTester(int testQnt,String[] testSucMess,String[] testFailMess,int[]testSucRates) {
		testSucList = new boolean[testQnt];
		testSucMessages = testSucMess;
		testFailMessages = testFailMess;
		testSuccessRates = testSucRates;
		testMessages = new String[testQnt];
		numOfTests = testQnt;
	
	}
	public String getTestMessage(int index) {
		return testMessages[index];
	}
	
	public boolean getTestSuccess(int index) {
		return testSucList[index];
	}
	
	public String getTestSucMessage(int index) {
		return testSucMessages[index];
	}
	
	public String getTestFailMessage(int index) {
		return testFailMessages[index];
	}
	
	public int getTestSuccessRate(int index) {
		return testSuccessRates[index];
	}
	public void setRandomNum() {
		double temp = Math.random() * 100;
		randomNum = (int) temp;
	}
	public int getRandomNum() {
		return randomNum;
	}
	public void successTest(int successRate, int randomNumber,int numberIndex) {
		if(getRandomNum() <= successRate) {
			setMessage(numberIndex,getTestSucMessage(numberIndex));
			
		} else {
			setMessage(numberIndex,getTestFailMessage(numberIndex));
			
		}
		
		
	
	}
	public void setMessage(int index,String newMessage) {
		testMessages[index] = newMessage;
	}
	
	public int getNumOfTests() {
		return numOfTests;
	}
	public void startTest() {
		try {
		System.out.println("Luck Test 1.0");
		System.out.println("Developed by VirtualIceShard");
		System.out.println("Number of tests: " + getNumOfTests());
		int j = 1;
		for(int i=0;i < getNumOfTests() && j < getNumOfTests();i++) {
			
			System.out.println("Test " +  j + "        chance of sucess: " + getTestSuccessRate(j) + "  messages: " + "SUCCESS: " + getTestSucMessage(j) + "   FAIL: " + getTestFailMessage(j));
			j++;
		}
		
		setRandomNum();
		System.out.println("Random number: " + getRandomNum());
		int k = 1;
		for(int i=0;i < getNumOfTests() && k < getNumOfTests();i++) {
	
			successTest(getTestSuccessRate(k),getRandomNum(),k);
			
			k++;
	}
		int l = 1;
		System.out.println("Results:");
		for(int i=0;i < getNumOfTests() && l < getNumOfTests();i++) {
			
			System.out.println("Test " + l + " result: " + getTestMessage(l));
			l++;
		}
		} catch(Exception e) {
			System.out.println("Finished");
			e.printStackTrace();
		}
}
}

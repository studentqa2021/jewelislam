package com.testRun;

public class SwapVariablepractice {
	public void getSwap(int a,int b){
		System.out.println("A Value before swap="+a);
		System.out.println("B Value before swap="+b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("A Value after swap="+a);
		System.out.println("B Value after swap="+b);
	}
	
	public static void main(String[] args) {
		 SwapVariablepractice obj = new  SwapVariablepractice();
		 obj.getSwap(6, 12);
		
		
	}

}


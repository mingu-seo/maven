package aop;

import chap05.Calculator;
import chap05.ExeCalculator;
import chap05.ImplCalculator2;

public class MainCalculator {

	public static void main(String[] args) {
		Calculator cal = new ExeCalculator(new ImplCalculator2());
		
		long r = cal.factorial(10);
		
		System.out.println(r);
		System.out.println(cal.getClass().getName());
	}

}

package com.revature.eval.java.core;

import com.revature.eval.java.core.EvaluationService;
import com.revature.eval.java.core.EvaluationService.SpeedConverter;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EvaluationService evaluation = new EvaluationService();
		
		System.out.println(SpeedConverter.printConversion(1.5));

	}

}

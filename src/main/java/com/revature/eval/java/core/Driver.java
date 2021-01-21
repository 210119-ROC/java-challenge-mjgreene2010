package com.revature.eval.java.core;

import com.revature.eval.java.core.EvaluationService.TeenNumberChecker;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EvaluationService evaluation = new EvaluationService();
		
		System.out.println(TeenNumberChecker.hasTeen(11, 22, 30));

	}

}

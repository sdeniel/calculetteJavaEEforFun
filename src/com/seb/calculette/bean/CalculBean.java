package com.seb.calculette.bean;

public class CalculBean {

	private String signe;
	
	public CalculBean() {
		super();
	}
		
	public int calculEquation(int variable1, int variable2, String typeCalc){
		
		if (typeCalc.equals("add")) {
			signe = " + ";
			return (variable1 + variable2);
		}
		else if  (typeCalc.equals("sub")) {
			signe = " - ";
			return (variable1 - variable2);
		}
		else if  (typeCalc.equals("mult")) {
			signe = " * ";
			return (variable1 * variable2);
		}
		else  {
			signe = " / ";
			return (variable1 / variable2);
		}		
	}

	public String getSigne() {
		return signe;
	}
	
}

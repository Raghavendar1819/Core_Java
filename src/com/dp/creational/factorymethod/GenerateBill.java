package com.dp.creational.factorymethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;

public class GenerateBill {
    public static void main(String[] args) throws IOException {
	Logger logger=Logger.getLogger(GenerateBill.class.getName());
	GetPlanFactory planFactory = new GetPlanFactory();
	System.out.println("Enter the name of plan for which the bill will be generated:");
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	String planName = reader.readLine();
	System.out.println("Enter the number of units for bill will be calculated:");
	int units = Integer.parseInt(reader.readLine());
	Plan plan = planFactory.getPlan(planName);
	System.out.println("Bill amount for "+planName+" of  "+units+" units is: ");
	plan.getRate();
	plan.calculateBill(units);
	
    }

}

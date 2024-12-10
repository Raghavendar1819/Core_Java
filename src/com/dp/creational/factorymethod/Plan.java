package com.dp.creational.factorymethod;

public abstract class Plan {
    protected Double rate;
    abstract void getRate();
    public void calculateBill(int units) {
	System.out.println(units*rate);
    }
}

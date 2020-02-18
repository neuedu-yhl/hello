package com.neusoft.oop4;

public class Car {

	public void setSpeed(int speed) {
		if(speed <0 || speed >500) {
			this.speed = 0;
		}
	}
	
	public void setGasoline(String gasoLine) {
		if(!"汽油".equals(gasoLine)) {
			this.gasoline = "得加汽油.";
		}
	}
	
	public void setMoney(String money) {
		if(!"人民币".equals(money)) {
			this.money = "需要人民币";
		}
	}
	
	
	@Override
	public String toString() {
		return "Car [speed=" + speed + ", gasoline=" + gasoline + ", money=" + money + "]";
	}

	private int speed;
	
	private String gasoline;
	
	private String money;
	
}
package com.jassem.devices;

public class Phone extends Device{
	
	public Phone() {
		super();
	}
	
	public void makeCall() {
		int battery = getBattery();
		setBattery(battery-5);
	}
	
	public void playGame() {
		System.out.println(getBattery());
		if(getBattery()<=25) {
			System.out.println("Sorry, but you can't play this game cause of your battery percentage %");
		}else {
			setBattery(getBattery()-20);
		}
	}
	public void charge() {
		int battery = getBattery();
		setBattery(getBattery()+50);
	}
}

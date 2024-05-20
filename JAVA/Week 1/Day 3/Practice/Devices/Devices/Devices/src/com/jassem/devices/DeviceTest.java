package com.jassem.devices;

public class DeviceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub*
		Phone myPhone = new Phone();
		System.out.println("Your device charge is :" + myPhone.getBattery());
		myPhone.playGame();
		System.out.println("Your device charge :" + myPhone.getBattery());
		myPhone.makeCall();
		myPhone.makeCall();
		myPhone.makeCall();
		myPhone.makeCall();
		myPhone.makeCall();
		myPhone.makeCall();
		System.out.println("Your device charge is :" + myPhone.getBattery());
		myPhone.playGame();
		myPhone.playGame();
		myPhone.playGame();
		myPhone.playGame();
		System.out.println("The device charger : " + myPhone.getBattery());
		if(myPhone.getBattery()<=10) {
			System.out.println("Battery Critical");
		myPhone.charge();
		System.out.println("Your device is in charge");
		}
	}

}

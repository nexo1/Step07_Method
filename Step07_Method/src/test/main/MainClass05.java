package test.main;

import test.mypac.Car;
import test.mypac.MyUtil;

public class MainClass05 {
	public static void main(String[] args) {
		//useCar(Car car)�޼ҵ带 ȣ���� ������.
		MyUtil.useCar(new Car());
		
		//userCar(String msg, Car car)�޼ҵ带 ȣ���� ������.
		
		MyUtil.useCar("�ȳ�", new Car());
		
	}

}

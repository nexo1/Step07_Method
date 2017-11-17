package test.main;

import test.mypac.Car;
import test.mypac.MyUtil;

public class MainClass05 {
	public static void main(String[] args) {
		//useCar(Car car)메소드를 호출해 보세요.
		MyUtil.useCar(new Car());
		
		//userCar(String msg, Car car)메소드를 호출해 보세요.
		
		MyUtil.useCar("안녕", new Car());
		
	}

}

package test.mypac;
/*
 * [�޼ҵ� �����ϱ�]
 * 
 * 1. ����������?
 * 2. static or non static?
 * 3. return ������ type?
 * 4. �޼ҵ� ��?
 * 5. �޼ҵ忡 ���޹޴� ������ ������ ������ type?
 */

public class MyUtil {
	//�޼ҵ� �����ϱ�
	public static void showVersion() {
		System.out.println("showVersion() ȣ���!");
		
	}
	public void sendMessage() {
		System.out.println("sendMessage() ȣ���!");
	}
	
	public static int getNum() {
		System.out.println("gueNum() ȣ���!");
		return 10;
	}
	public static String getMessage() {
		System.out.println("gueNum() ȣ���!");
		return "Hello! MaMa!";
	}

	public String getName() {
		System.out.println("getName() ȣ���");
		return "�豸��";
	}
	/*
	 * ���� ������ : public
	 * static
	 * ���� ������ type: Car
	 * �޼ҵ��: getCar
	 * �޼ҵ� ����: ����
	 * 
	 */
	public static Car getCar() {
		//car ��ü�� �����ؼ� �������� ������ ���� ����
		Car car=new Car();
		//������ ����� �������� ������ �ش�.
		return car;
	}
	//���ڷ� String type�� �޴� �޼ҵ�
	public static void printMsg(String msg) {
		System.out.println("printMsg() ȣ���");
	}
	//���ڷ� Car type�� �޴� �޼ҵ�
	public static void useCar(Car car) {
		car.drive();
	}
	//���ڷ� String type�� Car type�� ���޹޴� �޼ҵ�
	public static void useCar(String msg, Car car) {
		car.drive();
	}
}

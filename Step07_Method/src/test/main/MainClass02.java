package test.main;

import test.mypac.MyUtil;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("���� �޼ҵ尡 ���۵Ǿ����ϴ�.");
		//MyUtil Ŭ������ getNum()�޼ҵ带 ȣ���� ������.

		int a=MyUtil.getNum();
		
		//MyUtil Ŭ������ getMessage()�޼ҵ带 ȣ���ϰ�
		//���ϵǴ� ����  msg��� ���������� �����غ�����.
		
	String Msg=MyUtil.getMessage();
	
	//MyUtil Ŭ������ ���ǵ� getnname()�޼ҵ带 ȣ���ϰ�
	//���ϵǴ� ���� name�̶�� ���� ������ ������ ������.
	MyUtil u= new MyUtil();
	String name=u.getName();
	
	
	}

}

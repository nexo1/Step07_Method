package test.main;

import test.mypac.MyUtil;

public class MainClass01 {
	public static void main(String[] args) {
		//MyUtil Ŭ������ ������ showVersion() �޼ҵ带 ȣ���� ������.
		MyUtil.showVersion();
		
		//MyUtil Ŭ������ ������ sendMessage()�� �޼ҵ带 ȣ���غ�����.
		//static ���� �Ŵ� ��ü�� ���� ����Ѵ�.
		//2���� �����ǹ�
		 MyUtil u=new MyUtil();
		   u.sendMessage();
		
		 new MyUtil().sendMessage();
		  
		 MyUtil u2=new MyUtil();
		 u.sendMessage();
		 //new MyUtil().sendMessage();
		 
		
	}
	
}

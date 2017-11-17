package test.main;

import test.mypac.MyUtil;

public class MainClass01 {
	public static void main(String[] args) {
		//MyUtil 클래스에 정의한 showVersion() 메소드를 호출해 보세요.
		MyUtil.showVersion();
		
		//MyUtil 클래스에 정의한 sendMessage()에 메소드를 호출해보세요.
		//static 없는 거는 객체를 만들어서 써야한다.
		//2개다 같은의미
		 MyUtil u=new MyUtil();
		   u.sendMessage();
		
		 new MyUtil().sendMessage();
		  
		 MyUtil u2=new MyUtil();
		 u.sendMessage();
		 //new MyUtil().sendMessage();
		 
		
	}
	
}

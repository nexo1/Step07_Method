package test.main;

import test.mypac.MyUtil;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작되었습니다.");
		//MyUtil 클래스이 getNum()메소드를 호출해 보세요.

		int a=MyUtil.getNum();
		
		//MyUtil 클래스의 getMessage()메소드를 호출하고
		//리턴되는 값을  msg라는 지역변수에 저장해보세요.
		
	String Msg=MyUtil.getMessage();
	
	//MyUtil 클래스에 정의된 getnname()메소드를 호출하고
	//리턴되는 값을 name이라는 지역 변수에 저장해 보세요.
	MyUtil u= new MyUtil();
	String name=u.getName();
	
	
	}

}

package ch06.sec13.exam02.package1;		//A클래스와 패키지가 동일

public class B {
	//필드 선언
	A a1 = new A(true);		//O 
	A a2 = new A(1);		//O
	//A a3 = new A("문자열");	//X (private 생성자 접근 불가)
	
}

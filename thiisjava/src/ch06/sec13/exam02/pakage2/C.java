package ch06.sec13.exam02.pakage2;

import ch06.sec13.exam02.package1.*;

public class C {
	//필드 선언
	A a1 = new A(true);		//O
	//A a2 = new A(1);			//X (default 생성자 접근 불가)
	//A a3 = new A("문자열");	//X (private 생성자 접근 불가)
}

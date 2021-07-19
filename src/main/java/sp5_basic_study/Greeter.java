package sp5_basic_study;

public class Greeter {
	
	private String msg; //문자열
	
	public void setFormat(String msg) {//  setFormat 메서드는  매개변수로 입력받은 값을 그대로 format에  입력한다.
		this.msg = msg;  //파라미터값으로  "%s, 안녕하세요!"
	}
	
	public String greet(String s) {		//greet메서드에 guest 매개변수를 통해서 문자열이 들어오면, foramt,guest 형태로 반환한다. "",""
		return String.format(msg, s);	//파라미터값으로 "스프링"
		//결과출력 : "%s,안녕하세요!","스프링"  ---> 스프링,안녕하세요!!
	}

	
}
// Greeter greeter = new Greeter();


//format ="";
// format = ", 안녕하세요!";
//String msg = ", 스프링" 
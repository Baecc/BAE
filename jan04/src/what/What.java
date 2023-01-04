package what;
//ctrl + shift + L 이클립스 전체 단축기
public class What {
	public static void main(String[] args) {
		//static 안 붙은 메소드는 객체 생성 후 실행해야합니다.
		//static 붙은 메소드는 객체 없이 클래스명.메소드 실행
		Human h1 = Human.getInsetance();
		Human h2 = Human.getInsetance();
		System.out.println(h1 == h2);
	}
}

class Human{
	private static Human human = new Human();
	
	private Human() {}
	public static Human getInsetance() {
		return human;
	}
}

package chap08_ingeritance.section01.extend;

public class Car {
	
	private boolean runningStatus;
	
	public Car() {
		System.out.println("Car 클래스의 기본 생성자 호출됨...");
	}
		
	public void run() {
		
		runningStatus = true;
		System.out.println("자동차가 달립니다.");
	}
	
	public void soundHorn() {
		
		if(isRunning()) {	// 자식클래스에서 부모필드에 가지고 있는 것을 받을 수 없기 때문
			System.out.println("빵! 빵!");
		}else {
			System.out.println("주행중이 아닌 상태에서는 정적을 울릴 수 없습니다.");
		}
	}
	
	protected boolean isRunning() {
		return runningStatus;
	}
	
	public void stop() {
		runningStatus = false;
		System.out.println("자동차가 멈춥니다.");
	}

}

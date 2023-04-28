package test;

public class AirConditioner extends Product{
	
	private String name;
	private String brand;
	private double electricity;
	private int price;


	public AirConditioner(String name, String brand, double electricity, int price) {
		super();
		this.name = name;
		this.brand = brand;
		this.electricity = electricity;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "에어컨 [제품명 : " + name + ", 브랜드 : " + brand + ", 전기소비량 : " + electricity + "k.W, 가격 : " + price
				+ "원]";
	}
	
	public AirConditioner() {
		
		super();
	}
	
	public void set() {
		System.out.println("에어컨이 동작합니다.");
	}
	
	public void movement() {
		if(isRunning()) {
			System.out.println("예약모드로 전환됐습니다.");
		}else {
			System.out.println("위잉~");
		}
	}
	
	public void time() {
		System.out.println("30분뒤에 자동으로 꺼집니다.");
	}
	

}

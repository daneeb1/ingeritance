package test;

public class MicroWave extends Product{
	
	private String name;
	private String brand;
	private int electricity;
	private int price;


	public MicroWave(String name, String brand, int electricity, int price) {
		super();
		this.name = name;
		this.brand = brand;
		this.electricity = electricity;
		this.price = price;
	}


	@Override
	public String toString() {
		return "전자레인지 [제품명 : " + name + ", 브랜드 : " + brand + ", 전기소비량 : " + electricity + "W, 가격 : " + price
				+ "원]";
	}
	

	public MicroWave() {
		
		super();
	}
	
	public void set() {
		System.out.println("전자레인지가 동작합니다.");
	}
	
	
	public void movement() {
		if(isRunning()) {
			System.out.println("오븐모드로 전환됐습니다.");
		}else {
			System.out.println("위잉 ~~");
		}
	}
	
	public void time() {
		System.out.println("조리시간은 10분입니다.");
	}
	
	

}

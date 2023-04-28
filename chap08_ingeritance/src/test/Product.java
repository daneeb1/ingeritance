package test;

public class Product {
	
	private String name;
	private String brand;
	private int electricity;
	private int price;
	
	
	
	public Product(String name, String brand, int eectricity, int price, int electricity) {
		super();
		this.name = name;
		this.brand = brand;
		this.electricity = electricity;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getEectricity() {
		return electricity;
	}
	public void setEectricity(int eectricity) {
		this.electricity = eectricity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "ProductDTO [name=" + name + ", brand=" + brand + ", electricity=" + electricity + ", price=" + price
				+ "]";
	}


	private boolean runningStatus;
	
	public Product() {
		System.out.println("제품을 선택완료하였습니다.");
	}
	
	public void on() {
		runningStatus = true;
		System.out.println("제품이 켜졌습니다.");
	}
	
	
	protected boolean isRunning() {
		return runningStatus;
	}
	
	public void stop() {
		runningStatus = false;
		System.out.println("제품이 멈췄습니다.");
	}

}

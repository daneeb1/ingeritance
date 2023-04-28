package test;

import java.util.Scanner;

public class Application01 {

   public static void main(String[] args) {
	   
	/* 1. 주제 한가지를 선정한다.
	전자제품 판매점

	2. 상속을 이용하여 세분화 한다.
	제품 -> 전자레인지 /  제품 -> 에어컨

	3. 공통기능을 도출하고 상속을 받아 개별 기능을 확장한다.
	전자레인지.전기(800w)/ 에어컨.전기(2.2kw)소비

	4. 오버로딩을 이용하여 기능을 다양하게 만든다.
    전자레인지.조리시간(String or int) = "오븐모드"
	에어컨.예약시간(String or int) = "예약모드"

	5. main에서 사용자가 기능을 조작할 수 있도록 만든다.

	is a 관계 기술
	생성자 get /set / toString */
      
      Scanner sc = new Scanner(System.in);   
      
      menu:
      while(true) {
         System.out.println(" === 제품을 선택해주세요. === ");
         System.out.println("1. 전자레인지");
         System.out.println("2. 에어컨");
         System.out.println("3. 프로그램 종료");
         int no = sc.nextInt(); // 입력을 받음
         
        switch(no) {
        	case 1 : MicroWave(); break;
        	case 2 : AirConditioner(); break;
        	case 3 : System.out.println("프로그램을 종료합니다."); break menu;
        	default : System.out.println("잘못된 번호를 입력하였습니다."); break;
        	}
 
         
      }  
   sc.close();

   }

   private static void MicroWave() {
	MicroWave Mic = new MicroWave("MWO-E8A01", "SK매직", 800, 67620);	
	System.out.println(Mic.toString()+"\n");
	Mic.on();
	Mic.set();
	Mic.movement();
	Mic.time();
	Mic.stop();
   }

   private static void AirConditioner() {
	AirConditioner Air = new AirConditioner("AF17B6474GZS", "삼성전자", 2.2, 284380);
	System.out.println(Air.toString()+"\n");

	Air.on();
	Air.set();
	Air.movement();
	Air.time();
	Air.stop();
	}

	
}


package javaStudy4;

/**/
abstract class Car{
	abstract void run();
}
class Ambulance extends Car{
	void run() {System.out.println("�ں��� ��������~ �߻ǻ߻�~~");}
}
class Cultivate extends Car{
	void run() {System.out.println("���� ��������~  ���ȴ���~~");}
}
class SportsCar extends Car{
	void run() {System.out.println("������ī ��������~ ��~~");}
}

public class Oop_polymorphism004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//��ü����
		Car c1 = new Ambulance();
		Car c2 = new Cultivate();
		Car c3 = new SportsCar();
		
		//run()�޼��� ȣ��
		c1.run();
		c2.run();
		c3.run();
		
	}//main

}//class

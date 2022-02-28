package javaStudy4;

/**/
abstract class Car{
	abstract void run();
}
class Ambulance extends Car{
	void run() {System.out.println("¾Úºí·±½º Áö³ª°¡¿ä~ »ß»Ç»ß»Ç~~");}
}
class Cultivate extends Car{
	void run() {System.out.println("°æ¿î±â Áö³ª°¡¿ä~  ´úÄÈ´úÄÈ~~");}
}
class SportsCar extends Car{
	void run() {System.out.println("½ºÆ÷Ã÷Ä« Áö³ª°¡¿ä~ ¾Å~~");}
}

public class Oop_polymorphism004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//°´Ã¼»ý¼º
		Car c1 = new Ambulance();
		Car c2 = new Cultivate();
		Car c3 = new SportsCar();
		
		//run()¸Þ¼­µå È£Ãâ
		c1.run();
		c2.run();
		c3.run();
		
	}//main

}//class

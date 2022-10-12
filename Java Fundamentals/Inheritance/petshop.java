package Herança;

public class petshop {

	public static void main(String[] args) {
		
		Dog Billy = new Dog();

		
		Billy.color = "Blue";
		System.out.println(Billy.color);
		Billy.eat("Billy");
		Billy.bark();
	}
}

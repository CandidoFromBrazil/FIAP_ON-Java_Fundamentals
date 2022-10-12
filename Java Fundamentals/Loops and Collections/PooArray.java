package LoopsArraisStringCollections;

public class PooArray {
	public static void main(String[] args) {
		//definindo um array do tipo objeto
		Car[] carros = new Car[2];
		//definindo os objetos
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.setModel("Gol");
		carros[0] = car1;
		
		car2.setModel("Punto");
		carros[1] = car2;
		
		//Da para usar os métodos da classe do vetor
		String model = carros[1].getModel();
		System.out.println(model);
		
	}
}

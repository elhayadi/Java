package test;
import animal.Animal;
import animal.Chat;
public class Test {

	
	public Test() {
	
	}

	public static void main(String []args) {
		
		Animal animal = new Animal();
		System.out.println(animal.getNbrAnimal());
		Chat animal1 = new Chat();
		System.out.println(animal1.getPoid());
	}
}

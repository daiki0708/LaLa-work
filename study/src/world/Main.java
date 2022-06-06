package world;

public class Main {

	public static void main(String[] args) {
		//Animal animal = new Animal("犬");
		
		Dog dog = new Dog();
		dog.setName("犬");
		dog.eat();
		dog.go();	
	
		Hawk hawk = new Hawk();
		hawk.setName( "タカ");
		hawk.go();
		hawk.eat();

	}

}

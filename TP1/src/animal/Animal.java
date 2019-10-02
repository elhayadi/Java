package animal;

public class Animal {
 private static int nbrAnimal=0;
 private int id;
 private String name;
 private int age;
 private double speed;
 protected double poid;
 
 
	 public Animal() {
			this.nbrAnimal++;
			this.setPoid();
		}
	 

	public Animal(int age, double poid) {
		this.age = age;
		this.poid = poid;
	}


	public static int getNbrAnimal() {
		return nbrAnimal;
	}

	public static void setNbrAnimal(int nbrAnimal) {
		Animal.nbrAnimal = nbrAnimal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getPoid() {
		return poid;
	}

	public void setPoid(){
		this.poid =(double) Math.round(Math.random()* 100); 
	}
	public String Parler() {
		return("je suis un animal");
	}


	@Override
	public String toString() {
		return "Animal [id=" + id + ", name=" + name + ", age=" + age + ", speed=" + speed + ", poid=" + poid + "]";
	}
	


 
}

package animal;

public class Chien extends Animal {
	  public Chien() {
		  super();
		}
	  public Chien(int age , String name) {
		  super(age , name);
		}  
	   public String Parler() {
	   	   return("je suis un Chien haou");
	      }
	    

	   	public void setPoid() {
	   		while(poid >60) {
	   			super.setPoid();
	   		}
	   	}

}

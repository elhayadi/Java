package animal;

public class Chien extends Animal {
	  public Chien() {
	   	   super.setPoid();
	   	setPoid();
		}
	   
	   public String Parler() {
	   	   return("je suis un Chien");
	      }
	    

	   	public void setPoid() {
	   		while(poid >60) {
	   			super.setPoid();
	   		}
	   	}

}

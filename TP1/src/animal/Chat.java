package animal;

public class Chat extends Animal{
	  public Chat() {
	   	   super.setPoid();
	   	setPoid();
		}
	   
	   public String Parler() {
	   	   return("je suis un Cha muaoi");
	      }
	    

	   	public void setPoid() {
	   		while(poid >30) {
	   			super.setPoid();
	   		}
	   	}
	

}

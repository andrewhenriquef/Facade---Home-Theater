package subsistemas;

public class Sintonizador extends Amplificador{


	public void on(){
		System.out.println(" On ");	
	}
	
	public void off(){
		System.out.println(" Off ");	
	}
	
	public void setAM(){
		System.out.println(" AM ");	
	}
	
	public void setFM(){
		System.out.println(" FM ");	
	}
	
	public void setFrequencia(double frequency){
		
		System.out.println("Frequencia: " + frequency);
	}
}

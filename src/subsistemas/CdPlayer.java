package subsistemas;

public class CdPlayer extends Amplificador{

	public void on(){
		System.out.println("CD Ligado");
		
	}
	public void off(){
		System.out.println("CD desligado");
		
	}
	public void ejetar(){
		System.out.println("CD Ejetado");
		
	}
	
	public void play(String titulo){
		System.out.println("Executando CD: " + titulo);
		
	}
	
	public void pause(){
		System.out.println("CD pausado");
		
	}
	
	public void stop(){
		System.out.println("CD Parado");
		
	}
}

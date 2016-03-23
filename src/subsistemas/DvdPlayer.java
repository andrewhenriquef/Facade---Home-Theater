package subsistemas;

public class DvdPlayer extends Amplificador{

	public void on(){
		System.out.println("Dvd On");
	}
	
	public void off(){
		System.out.println("Dvd Off");
	}
	
	public void ejetar(){
		System.out.println("Ejetando DVD");
	}
	
	public void play(String nomeFilme){
		System.out.println("Executar filme: " + nomeFilme);
		
	}
	public void pause(){
		System.out.println("Filme Pausado");
		
	}
	public void stop(){
		System.out.println("Filme parado");
	}
	
}

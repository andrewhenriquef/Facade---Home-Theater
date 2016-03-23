package subsistemas;

public class Amplificador {

	private String description;
	

	
	public void on(){
		System.out.println( "Amplificador On ");	
	}
	
	public void off(){
		System.out.println("Amplificador Off ");
	}
	
	public void setCD(){
		System.out.println("Modo CD");
	}
	
	public void setDVD(){
		System.out.println("Modo DVD");
	}
	
	public void setSomStereo(){
		System.out.println("Som Stereo ativado");
		
	}
	public void setSomSurround(){
		System.out.println("Som Surround ativado");
	}
	public void setSintonizador(){
		System.out.println("Sintonia ativado");
	}
	
	public void setVolume(int value){
		
		System.out.println("Volume em: " + value);
	}
}

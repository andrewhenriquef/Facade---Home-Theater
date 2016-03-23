package subsistemas;

public class Projetor extends DvdPlayer{

	public void on(){
		System.out.println("Projetor ligado");
	}
	public void off(){
		System.out.println("Desligando projetor");		
	}
	public void setInput(){
		System.out.println("VGA");
	}
	public void modoWideScreen(){
		System.out.println("Em modo WideScreen");
	}



}


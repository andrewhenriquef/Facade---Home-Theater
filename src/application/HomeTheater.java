package application;
import facade.HomeTheaterFacade;
import subsistemas.Amplificador;
import subsistemas.CdPlayer;
import subsistemas.DvdPlayer;
import subsistemas.LuzAmbiente;
import subsistemas.Pipoqueira;
import subsistemas.Projetor;
import subsistemas.Sintonizador;
import subsistemas.Tela;

public class HomeTheater {

	public static void main(String[] args) {
		
		Amplificador amplificador = new Amplificador();

		CdPlayer cd = new CdPlayer();

		DvdPlayer dvd = new DvdPlayer();

		LuzAmbiente luz = new LuzAmbiente();

		Pipoqueira pipoca = new Pipoqueira();

		Projetor proj = new Projetor();

		Sintonizador sint = new Sintonizador();

		Tela tela = new Tela();
		
		HomeTheaterFacade app = new HomeTheaterFacade(amplificador,
			cd,
			dvd,
			luz,
			pipoca,
			proj,
			sint,
			tela);
	
		app.watchMovie("Vingadores");
		app.endMovie();
		
		System.out.println("----------------------");
		
		app.listenCD("Hypnotize");
		app.endCd();
		
		System.out.println("----------------------");
		
		app.listenToRadio(94.5);
		app.endRadio();
		
		
	}
	
}

package facade;

import subsistemas.*;

public class HomeTheaterFacade {
	
	Amplificador amplificador;
	CdPlayer cd;
	DvdPlayer dvd;
	LuzAmbiente luz;
	Pipoqueira pipoca;
	Projetor proj;
	Sintonizador sint;
	Tela tela;
 
	public HomeTheaterFacade(Amplificador amplificador,
			CdPlayer cd,
			DvdPlayer dvd,
			LuzAmbiente luz,
			Pipoqueira pipoca,
			Projetor proj,
			Sintonizador sint,
			Tela tela){
		
		this.amplificador = amplificador;
		this.cd = cd;
		this.dvd = dvd;
		this.luz = luz;
		this.pipoca = pipoca;
		this.proj = proj;
		this.sint = sint;
		this.tela = tela;
	
	}
 
	
	public void watchMovie(String movie) {

		System.out.println("Preparando filme");
		amplificador.setSomStereo();
		amplificador.setSomSurround();
		amplificador.setVolume(5);
		proj.on();
		proj.modoWideScreen();
		dvd.on();
		dvd.play(movie);
		
	}
 
	public void endMovie() {
		System.out.println("Desligando filme");
		pipoca.off();
		luz.on();
		tela.subir();
		proj.off();
		amplificador.off();
		dvd.stop();
		dvd.ejetar();
		dvd.off();
	}
	
	public void listenCD(String cdTitle) {
		System.out.println("Get ready for an audiopile experence...");
		luz.on();
		amplificador.on();
		amplificador.setVolume(5);
		cd.on();
		cd.play(cdTitle);
	}

	public void endCd() {
		System.out.println("Desligando CD...");
		amplificador.off();
		cd.ejetar();
		cd.off();
	}

	public void listenToRadio(double frequency) {
		System.out.println("Ligando sintonizador...");
		sint.on();
		sint.setFM();
		sint.setFrequencia(frequency);
		amplificador.on();
		amplificador.setVolume(5);
		amplificador.setSintonizador();
	}

	public void endRadio() {
		System.out.println("Desligando sintonizador...");
		sint.off();
		amplificador.off();
	}
	

}

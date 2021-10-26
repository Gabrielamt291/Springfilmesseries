package br.com.aprendizes.projeto.projeto;

import br.com.aprendizes.projeto.projeto.pojo.Filmes;
import br.com.aprendizes.projeto.projeto.pojo.Pessoa;
import br.com.aprendizes.projeto.projeto.pojo.Series;
import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetoApplication {

	public static void main(String[] args) {

		//Lista de filmes//

		Filmes velozes_furiosos = new Filmes();
		velozes_furiosos.setId(1);
		velozes_furiosos.setTitulo("Velozes e Furiosos");
		velozes_furiosos.setDiretor("Justin Lin");
		velozes_furiosos.setDuracao("2H,10");
		velozes_furiosos.setData_lancamento("22/03/2012");
		velozes_furiosos.setElenco("Vin Diesel, Paul Walker, Dwayne Johnson, Jordana Brewster, Tyrese Gibson, Elsa Pataky, Sung Kang, Gal Gadot, Michelle Rodriguez, Ludacris");
		velozes_furiosos.setStreaming("Netflix e Amazon Prime");

		Filmes alive = new Filmes();
		alive.setId(2);
		alive.setTitulo("Alive");
 		alive.setDiretor("Il Cho");
		alive.setDuracao("1H 39");
		alive.setData_lancamento("24/07/2020");
		alive.setElenco("Ah-In Yoo, Shin-Hye Park, Hyun-Wook Lee, Jin So‑yeon");
		alive.setStreaming("Netflix");

		Filmes duna = new Filmes();
		duna.setId(3);
		duna.setTitulo("Duna");
		duna.setDiretor("Denis Villeneuve");
		duna.setDuracao("2H 35");
		duna.setData_lancamento("21/10/2021");
		duna.setElenco("Timothee Chalamet, Zendaya, Rebecca Ferguson, Jason Momoa ");
		duna.setStreaming("Warner Bros. Pictures");


		Gson gson = new Gson();

		//Lista de series//

		Series good_girls = new Series();
		good_girls.setTitulo("Good Girls");
		good_girls.setDiretor("Jenna Bans");
		good_girls.setElenco("Christina Hendricks, Mae Whitman, Manny Montana, Retta, Matthew Lillard");
		good_girls.setPrimeiro_episodio("26/02/2018");
		good_girls.setUltimo_episodio("22/07/2021");
		good_girls.setStreaming("Netflix");

		Series teen_wolf = new Series();
		teen_wolf.setTitulo("Teen Wolf");
		teen_wolf.setDiretor("Jeff Davis");
		teen_wolf.setElenco("Tyler Posey, Dylan O´brien, Holland Roden, Tyler Hoechlin, Crystal Reed, Dylan Sprayberry ");
		teen_wolf.setPrimeiro_episodio("05/06/2011");
		teen_wolf.setUltimo_episodio("24/09/2017");
		teen_wolf.setStreaming("MTV");

		Series the_wonder_years = new Series();
		the_wonder_years.setTitulo("The Wonder Years");
		the_wonder_years.setDiretor(" Saladin K. Patterson");
		the_wonder_years.setElenco("Dule Hill, Laura Kariuki, Milan Ray, Elisha Williams, Saycon Sengbloh, Amari O´Neil");
		the_wonder_years.setPrimeiro_episodio("22/09/2021");
		the_wonder_years.setUltimo_episodio("20/10/2021");
		the_wonder_years.setStreaming("American Broadcasting Company");

		//Lista pessoas//

		Pessoa gabi = new Pessoa();
		gabi.setNomePessoa("Gabriela");
		gabi.setIdade(17);
		gabi.setCinefolo(true);
		gabi.setGamer(false);
		gabi.getListaFilmes().add(velozes_furiosos);
		gabi.getListaSeries().add(good_girls);
		String jsonGabi = gson.toJson(gabi);
		System.out.println(jsonGabi);

		Pessoa mikael = new Pessoa();
		mikael.setNomePessoa("Mikael");
		mikael.setIdade(17);
		mikael.setCinefolo(true);
		mikael.setGamer(false);
		mikael.getListaFilmes().add(alive);
		mikael.getListaSeries().add(teen_wolf);
		String jsonMikael = gson.toJson(mikael);
		System.out.println(jsonMikael);

		Pessoa stive = new Pessoa();
		stive.setNomePessoa("Stiverson");
		stive.setIdade(34);
		stive.setCinefolo(true);
		stive.setGamer(false);
		stive.getListaFilmes().add(duna);
		stive.getListaSeries().add(the_wonder_years);
		String jsonStive = gson.toJson(stive);
		System.out.println(jsonStive);




		/*SpringApplication.run(ProjetoApplication.class, args);*/
	}

}

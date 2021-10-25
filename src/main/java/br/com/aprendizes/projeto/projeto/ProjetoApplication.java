package br.com.aprendizes.projeto.projeto;

import br.com.aprendizes.projeto.projeto.pojo.Filmes;
import br.com.aprendizes.projeto.projeto.pojo.Pessoa;
import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetoApplication {

	public static void main(String[] args) {

		//Lista de filmes//

		Filmes jogosvorazes = new Filmes();
		jogosvorazes.setId(1);
		jogosvorazes.setTitulo("Jogos Vorazes");
		jogosvorazes.setDiretor("Gary Ross");
		jogosvorazes.setDuracao("2H,22");
		jogosvorazes.setData_lancamento("22/03/2012");
		jogosvorazes.setElenco("");
		jogosvorazes.setStreaming("Netflix e Amazon Prime");

		Filmes alive = new Filmes();
		alive.setId(2);
		alive.setTitulo("Alive");
 		alive.setDiretor("Il Cho");
		alive.setDuracao("1H 39");
		alive.setData_lancamento("24/07/2020");
		alive.setElenco("Ah-In Yoo, Shin-Hye Park, Hyun-Wook Lee, Jin So‑yeon");
		alive.setStreaming("Netflix");

		Gson gson = new Gson();
		//Lista de series//

		//Adicionar series aqui//


		//Lista pessoas//

		Pessoa gabi = new Pessoa();
		gabi.setNomePessoa("Gabriela");
		gabi.setIdade(17);
		gabi.setCinefolo(true);
		gabi.setGamer(false);
		gabi.getListaFilmes().add(jogosvorazes);
		//Get lista de series//
		String jsonGabi = gson.toJson(gabi);
		System.out.println(jsonGabi);

		Pessoa mikael = new Pessoa();
		mikael.setNomePessoa("Mikael");
		mikael.setIdade(17);
		mikael.setCinefolo(true);
		mikael.setGamer(false);
		mikael.getListaFilmes().add(alive);
		String jsonMikael = gson.toJson(mikael);
		System.out.println(jsonMikael);





		/*SpringApplication.run(ProjetoApplication.class, args);*/
	}

}

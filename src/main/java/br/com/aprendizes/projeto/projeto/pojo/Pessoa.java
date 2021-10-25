package br.com.aprendizes.projeto.projeto.pojo;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nomePessoa;
    private int idade;
    private boolean cinefolo;
    private boolean gamer;

    private List<Filmes> listaFilmes = new ArrayList<>();
    private List<Series> listaSeries = new ArrayList<>();

    public List<Filmes> getListaFilmes() {
        return listaFilmes;
    }

    public void setListaFilmes(List<Filmes> listaFilmes) {
        this.listaFilmes = listaFilmes;
    }

    public List<Series> getListaSeries() {
        return listaSeries;
    }

    public void setListaSeries(List<Series> listaSeries) {
        this.listaSeries = listaSeries;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isCinefolo() {
        return cinefolo;
    }

    public void setCinefolo(boolean cinefolo) {
        this.cinefolo = cinefolo;
    }

    public boolean isGamer() {
        return gamer;
    }

    public void setGamer(boolean gamer) {
        this.gamer = gamer;
    }
}

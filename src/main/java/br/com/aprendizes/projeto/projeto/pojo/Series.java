package br.com.aprendizes.projeto.projeto.pojo;

public class Series {
    private String titulo;
    private String diretor;
    private String elenco;
    private String primeiro_episodio;
    private String ultimo_episodio;
    private String streaming;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getElenco() {
        return elenco;
    }

    public void setElenco(String elenco) {
        this.elenco = elenco;
    }

    public String getPrimeiro_episodio() {
        return primeiro_episodio;
    }

    public void setPrimeiro_episodio(String primeiro_episodio) {
        this.primeiro_episodio = primeiro_episodio;
    }

    public String getUltimo_episodio() {
        return ultimo_episodio;
    }

    public void setUltimo_episodio(String ultimo_episodio) {
        this.ultimo_episodio = ultimo_episodio;
    }

    public String getStreaming(String netflix) {
        return streaming;
    }

    public void setStreaming(String streaming) {
        this.streaming = streaming;
    }
}

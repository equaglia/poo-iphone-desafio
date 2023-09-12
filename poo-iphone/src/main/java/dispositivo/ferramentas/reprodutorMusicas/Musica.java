package main.java.dispositivo.ferramentas.reprodutorMusicas;

public class Musica {
    private String nome;
    private String artista;
    private String capa; // TODO usar classe Imagem mais apropriada
    private Long duracao;

    public Musica(String nome, String artista, String capa, Long duracao) {
        this.nome = nome;
        this.artista = artista;
        this.capa = capa;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public String getArtista() {
        return artista;
    }

    public String getCapa() {
        return capa;
    }

    public Long getDuracao() {
        return duracao;
    }

    

}

package main.java.dispositivo.ferramentas.reprodutorMusicas;

import java.util.List;

import main.java.dispositivo.ferramentas.Ferramenta;
import main.java.dispositivo.ferramentas.Ferramental;

public class ReprodutorMusical extends Ferramenta implements Ferramental {

    private String playBt; // TODO usar classe button apropriada
    private String pauseBt;
    private ListaMusicas musicas; // TODO criar e usar classe ListMusica que implementa interface ListaItem para a correta apresentação da lista
    private Musica musicaSelecionada;

    public Musica getMusicaSelecionada() {
        return musicaSelecionada;
    }

    public ReprodutorMusical() {
        this.playBt = "Play";
        this.pauseBt = "Pause";
        this.musicas = new ListaMusicas();
        musicaSelecionada = new Musica("Aquarela", "Toquinho", "Aquarela", 255L);
        // musicas.add(musicaSelecionada);
        System.out.println("iPod pronto. Aproveite suas músicas");
    }

    @Override
    public void acessar() {
        System.out.println("\nATIVANDO Reprodutor Musical");
    }
    
    public void tocar() {
        System.out.println("Tocando " + musicaSelecionada.getNome());
    }

    public void pausar() {
        System.out.println("Pausando " + musicaSelecionada.getNome());
    }

    public void selecionar(String musica) { // TODO usar classe Musica ao invés de String
        // this.musicaSelecionada = musica;
        System.out.println("Selecionando " + musicaSelecionada.getNome());
    }
}

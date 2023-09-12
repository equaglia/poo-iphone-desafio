package main.java.dispositivo.ferramentas;

import main.java.dispositivo.ferramentas.aparelhoTelefonico.AparelhoTelefonico;
import main.java.dispositivo.ferramentas.navegadorInternet.NavegadorInternet;
import main.java.dispositivo.ferramentas.reprodutorMusicas.ReprodutorMusical;

public class Dispositivo {
    private ReprodutorMusical reprodutorMusical;
    private NavegadorInternet navegadorInternet;
    private AparelhoTelefonico aparelhoTelefonico;

    public ReprodutorMusical getReprodutorMusical() {
        return reprodutorMusical;
    }

    public NavegadorInternet getNavegadorInternet() {
        return navegadorInternet;
    }

    public AparelhoTelefonico getAparelhoTelefonico() {
        return aparelhoTelefonico;
    }

    public Dispositivo(String nome) {
        System.out.println(" Parabéns! Você acaba de adquirir um " + nome+"\n");

        this.reprodutorMusical = new ReprodutorMusical();
        this.aparelhoTelefonico = new AparelhoTelefonico();
        this.navegadorInternet = new NavegadorInternet();
    }
}

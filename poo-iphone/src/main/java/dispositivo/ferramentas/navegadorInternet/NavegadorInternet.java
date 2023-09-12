package main.java.dispositivo.ferramentas.navegadorInternet;

import java.util.List;

import main.java.dispositivo.ferramentas.Ferramenta;
import main.java.dispositivo.ferramentas.Ferramental;

public class NavegadorInternet extends Ferramenta implements Ferramental {

    private List<Aba> abas;

    public NavegadorInternet() {   
        this.abas = List.of();
        System.out.println("Navegador pronto. Internet ilimitada");
        // adicionarNovaAba();
    }

    @Override
    public void acessar() {
        System.out.println("\nATIVANDO Navegador Internet");
    }
    
    public void exibirPagina(String aba) { // TODO usar classe Aba ao invés de String
        System.out.println("Exibindo " + aba);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina(String aba) { // TODO usar classe Aba ao invés de String
        System.out.println("Atualizando " + aba);
    }
}

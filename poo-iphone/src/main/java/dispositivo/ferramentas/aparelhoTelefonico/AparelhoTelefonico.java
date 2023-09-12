package main.java.dispositivo.ferramentas.aparelhoTelefonico;

import java.util.List;

import main.java.dispositivo.ferramentas.Ferramenta;
import main.java.dispositivo.ferramentas.Ferramental;

public class AparelhoTelefonico extends Ferramenta implements Ferramental{

    private Telefone meuTelefone;
    private ListaTelefonica telefones; 

    public AparelhoTelefonico() {
        this.telefones = new ListaTelefonica();
        this.meuTelefone = new Telefone();
        // telefones.add(new Telefone());
        System.out.println("Telefone pronto. Lembre de ligar para sua mãe");
    }

    public void ligar(String telefone) { // TODO usar classe Telefone ao invés de String
        System.out.println("Ligando para telefone " + telefone);
    }

    public void atender() {
        System.out.println("Atendendo ligação");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    public Telefone getMeuTelefone() {
        return meuTelefone;
    }

    public void setMeuTelefone(Telefone meuTelefone) {
        this.meuTelefone = meuTelefone;
    }


    public List<Telefone> getTelefones() {
        return telefones;
    }

    @Override
    public void acessar() {
        System.out.println("\nATIVANDO Aparelho Telefonico");
    }
    
}

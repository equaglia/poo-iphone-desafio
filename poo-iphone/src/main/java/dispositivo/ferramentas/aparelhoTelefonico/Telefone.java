package main.java.dispositivo.ferramentas.aparelhoTelefonico;

public class Telefone {
    private String numero;

    public Telefone() {
        this.numero = "9999999999";    
    }

    public Telefone(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}

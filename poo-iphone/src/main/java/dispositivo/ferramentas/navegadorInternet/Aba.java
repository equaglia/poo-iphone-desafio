package main.java.dispositivo.ferramentas.navegadorInternet;

public class Aba {
    private String url;

    public Aba(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    String exibir() {
        return url;
    }
}

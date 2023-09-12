import main.java.dispositivo.ferramentas.Dispositivo;
import main.java.dispositivo.ferramentas.aparelhoTelefonico.AparelhoTelefonico;
import main.java.dispositivo.ferramentas.aparelhoTelefonico.Telefone;
import main.java.dispositivo.ferramentas.navegadorInternet.NavegadorInternet;
import main.java.dispositivo.ferramentas.reprodutorMusicas.ReprodutorMusical;

public class App {
    public static void main(String[] args) throws Exception {
        Dispositivo iPhone = new Dispositivo("iPhone");

        AparelhoTelefonico fone = iPhone.getAparelhoTelefonico();
        ReprodutorMusical iPod = iPhone.getReprodutorMusical();
        NavegadorInternet navegador = iPhone.getNavegadorInternet();

        // Testando a classe AparelhoTelefonico
        fone.acessar();
        fone.ligar("(11) 11111-1111");
        fone.iniciarCorreioVoz();
        fone.atender();

        // Testando a classe ReprodutorMusical
        iPod.acessar();
        iPod.selecionar(iPod.getMusicaSelecionada().getNome());
        iPod.tocar();
        iPod.pausar();

        // Testando a classe NavegadorInternet
        navegador.acessar();
        navegador.exibirPagina("https://www.google.com");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina("https://www.youtube.com");

    }
}

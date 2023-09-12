package main.java.dispositivo.ferramentas.reprodutorMusicas;

import java.util.List;

import main.java.dispositivo.ferramentas.ListaItem;

public class ListaMusicas implements ListaItem {

    private List<Musica> musicas;

    @Override
    public void apresentarLista() {
        System.out.println("Lista de músicas");
    }

    @Override
    public Object acessar(int id) {
        return musicas.get(id);}
    
}

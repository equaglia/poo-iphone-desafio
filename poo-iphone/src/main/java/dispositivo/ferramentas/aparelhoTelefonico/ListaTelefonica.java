package main.java.dispositivo.ferramentas.aparelhoTelefonico;

import java.util.List;

import main.java.dispositivo.ferramentas.ListaItem;

public class ListaTelefonica implements ListaItem {

    List<Telefone> telefones = List.of();

    @Override
    public void apresentarLista() {
        System.out.println("Lista Telefonica");
    }

    @Override
    public Object acessar(int id) {
        return telefones.get(id);
    }
    
}

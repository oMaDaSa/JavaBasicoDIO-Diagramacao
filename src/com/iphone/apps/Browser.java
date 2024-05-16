package com.iphone.apps;

import com.iphone.internet.Connection;

public class Browser extends App implements Connection {

    public void conectar() {
        System.out.println("Conectando à internet");
    }

    public void abrir(){
        conectar();
        super.abrir();
    }

    public void exibirPagina(String pagina){
        System.out.println("Exibindo " + pagina);
    }

    public void adicionarAba(){
        System.out.println("Nova aba criada");
    }
    public void atualizarPagina(){
        System.out.println("Pagina atualizada");
    }
}

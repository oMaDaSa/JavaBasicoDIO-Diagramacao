package com.iphone.apps;

import com.iphone.internet.Connection;

public class Music extends App implements Connection {
    public void conectar() {
        System.out.println("Conectando à internet");
    }

    public void abrir(){
        conectar();
        super.abrir();
    }

    public void pausar(){
        System.out.println("Musica pausada");
    }

    public void tocar(){
        System.out.println("Tocando musica");
    }

    public void escolherMusica(String musica){
        System.out.println("Tocando " + musica);
    }
}

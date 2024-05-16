package com.iphone;

import com.iphone.apps.Browser;
import com.iphone.apps.Music;
import com.iphone.apps.Phone;

public class Iphone {
    public static void main(String[] args) {
        Browser chrome = new Browser();
        Music spotify = new Music();
        Phone telefone = new Phone();

        spotify.abrir();
        spotify.escolherMusica("Never Gonna Give You Up");
        spotify.pausar();
        spotify.fechar();

        chrome.abrir();
        chrome.adicionarAba();
        chrome.exibirPagina("youtube.com");
        chrome.atualizarPagina();
        chrome.fechar();

        telefone.abrir();
        telefone.ligar("999991111");
        telefone.iniciarCorreioVoz();
        telefone.fechar();
    }
}


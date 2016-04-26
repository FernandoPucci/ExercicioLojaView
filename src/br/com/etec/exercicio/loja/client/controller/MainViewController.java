/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.etec.exercicio.loja.client.controller;

import br.com.etec.exercicio.loja.client.constantes.ConstantesBotoes;
import br.com.etec.exercicio.loja.client.threads.MainThreads;
import br.com.etec.exercicio.loja.client.view.MainView;
import javax.swing.AbstractButton;

/**
 *
 * @author fernando-pucci
 */
public class MainViewController extends MainThreads{

    protected final MainView mainView;

    public MainViewController(MainView mainView) {

        this.mainView = mainView;

    }

    
    public void acaoPressedController(AbstractButton botao) {

        if (botao.isEnabled()) {
            acao(botao.getName());
        }
    }

    public void acao(String botao) {

        //nothing to do yet
    }

    public void acaoRelease(AbstractButton botao) {

        if (botao.isEnabled()) {
            acaoRelease(botao.getName());
        }
    }

    public void acaoRelease(String botao) {

        //nothing to do yet
    }

    public void acaoClickController(AbstractButton botao) {

        if (botao.isEnabled()) {
            acaoController(botao.getName());
        }
    }

    //trata ações dos botoes clicados
    protected void acaoController(String botao) {

        //TEST:
        System.out.println(botao);

        switch (botao) {

            case ConstantesBotoes.BUTTON_SAIR_GERAL:
                getThreadSairPrograma().start();
                break;
            case ConstantesBotoes.BUTTON_SHOW_CADASTRAR_CLIENTE:
                getThreadShowClienteView().start();
                break;
            case ConstantesBotoes.BUTTON_SHOW_CADASTRAR_PRODUTO:
                getThreadNotImplementYetMessage().start();
                break;
            case ConstantesBotoes.BUTTON_SHOW_CADASTRAR_FORNECEDOR:
                getThreadNotImplementYetMessage().start();
                break;

        }

    }

    

}

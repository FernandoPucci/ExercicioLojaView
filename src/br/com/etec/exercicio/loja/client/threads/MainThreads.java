/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.etec.exercicio.loja.client.threads;

import br.com.etec.exercicio.loja.client.constantes.ConstantesNomenclaturas;
import br.com.etec.exercicio.loja.client.view.clientes.CadastrarClienteView;
import javax.swing.JOptionPane;

/**
 *
 * @author fernando-pucci
 */
public class MainThreads {

    //threads apartadas
    protected Thread getThreadSairPrograma() {

        return new Thread() {
            public void run() {
                sairPrograma();
            }

        };
    }

    protected Thread getThreadNotImplementYetMessage() {

        return new Thread() {
            public void run() {
                exibirMensagemNaoImplementada();
            }

        };
    }

    protected Thread getThreadShowClienteView() {

        return new Thread() {
            public void run() {
                exibirClienteView();
            }

        };
    }

    //metodos apartados
    private void sairPrograma() {
        int opt = -1;

        opt = JOptionPane.showConfirmDialog(null, "Deseja Sair do Programa? ", ConstantesNomenclaturas.NOME_PROGRAMA_TITLE_MESSAGE, JOptionPane.YES_NO_OPTION);

        if (opt == 0) {
            System.exit(0);
        }

    }

    private void exibirMensagemNaoImplementada() {

        JOptionPane.showMessageDialog(null, "Desculpe, funcionalidade ainda não implementada.", ConstantesNomenclaturas.NOME_PROGRAMA_TITLE_MESSAGE, JOptionPane.INFORMATION_MESSAGE);

    }

    private void exibirClienteView() {
        CadastrarClienteView tf = new CadastrarClienteView();
        tf.setVisible(true);
    }

}

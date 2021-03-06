/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.etec.exercicio.loja.client.action;

import br.com.etec.exercicio.loja.client.controller.ClienteViewController;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.AbstractButton;

/**
 *
 * @author fernando-pucci
 */
public class CadastrarClienteAction implements MouseListener {

    private final ClienteViewController clienteViewController;

    public CadastrarClienteAction(ClienteViewController clienteViewController) {
        
        this.clienteViewController = clienteViewController;

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            Object source = e.getSource();
            if (source instanceof AbstractButton) {

                clienteViewController.acaoClickController((AbstractButton) source);

            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            Object source = e.getSource();
            if (source instanceof AbstractButton) {
                clienteViewController.acaoPressedController((AbstractButton) source);
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            Object source = e.getSource();

            if (source instanceof AbstractButton) {
                clienteViewController.acaoRelease((AbstractButton) source);
            }
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}

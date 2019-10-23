/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaAeroporto;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Regis_Maximo
 */
public class Reserva {

    private final boolean poltrona[] = new boolean[10]; // array de poltronas com dez assentos
    int classe; //variável para escolher a classe primeira ou segunda

    public Reserva() {
        // ínicia o array com todas as poltronas livres
        for (int cont = 0; cont < poltrona.length; cont++) {
            poltrona[cont] = true;
        }
    }

    public void fazerReserva() {
        // mensagem na tela para o usuário informar a classe
        classe = Integer.parseInt(JOptionPane.showInputDialog("Deseja qual Classe\n"
                + "1 para primeira Classe\n2 para segunda Classe"));

        int banco; // variável para escolher poltrona 

        if (classe == 1) {

            banco = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma poltrona de 0 a 4"));
            
            //caso o usuário insira valor diferente da poltrona fica em loop pra ele digite um valor válido
            while (banco > 5) {
                JOptionPane.showMessageDialog(null, "poltrona deve ser de 0 a 4");
                banco = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma poltrona de 0 a 4"));
            }
            if (poltrona[banco] == false) { // caso poltrona esteja reservada informa ao usuário
                JOptionPane.showMessageDialog(null, "Essa poltrona já está ocupada");
         
            } else {
                poltrona[banco] = false; // Senão reserva a poltrona para o mesmo
                System.out.println(" Ok, reservado com sucesso poltrona: " + banco + " - primeira classe");
                System.out.println("========================================================");
            }

        } else {

            banco = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma poltrona de 5 a 9"));
            
             //caso o usuário insira valor diferente da poltrona fica em loop pra ele digite um valor válido
            while ((banco > 9) || (banco < 5)) {
                JOptionPane.showMessageDialog(null, "poltrona deve ser entre 5 a 9");
                banco = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma poltrona de 5 a 9"));
            }

            if (poltrona[banco] == false) { // caso poltrona esteja reservada informa ao usuário
                JOptionPane.showMessageDialog(null, "Essa poltrona já está ocupada");

            } else {
                poltrona[banco] = false; // Senão reserva a poltrona para o mesmo
                System.out.println(" Ok, reservado com sucesso poltrona: " + banco + " - segunda classe");
                System.out.println("========================================================");
            }
        }

    }

}

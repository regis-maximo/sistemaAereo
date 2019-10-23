/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaAeroporto;

import javax.swing.JOptionPane;

/**
 *
 * @author Regis_Maximo
 */
public class TestReservas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String cliente; // variável para receber o nome do cliente

        cliente = JOptionPane.showInputDialog("nome do cliente");
        Cliente cli = new Cliente(cliente); // instância um objeto Cliente

        Reserva res = new Reserva(); // instância um objeto de Reserva

        System.out.println("Cliente: " + cli.getNome()); // imprime o nome do cliente
        res.fazerReserva(); // chama o método fazerReserva

        // pergunta para o usuário se deseja fazer outra reserva
        String resp = JOptionPane.showInputDialog("deseja fazer outra reserva s/n ?");
        while (resp.equals("s")) { // enquanto usuário digitar s loop continua

            if (resp.equals("s")) {
                // mensagem pedindo um novo nome de cliente
                cliente = JOptionPane.showInputDialog("nome do cliente");
                cli.setNome(cliente);
                System.out.println("Cliente: " + cli.getNome());
                res.fazerReserva();
            }
            resp = JOptionPane.showInputDialog("deseja fazer outra reserva s/n ?");
        }
        
        // Mensagem agradecendo o usuário por usar o sistema
        JOptionPane.showMessageDialog(null, "Obrigado Volte sempre!");
    }
}

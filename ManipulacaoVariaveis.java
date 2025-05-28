/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.manipulacaovariaveis;

import javax.swing.JOptionPane;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class ManipulacaoVariaveis {

    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog("Digite um número:");
        JOptionPane.showMessageDialog(null, "O número digitado foi" + numero);
    }
}

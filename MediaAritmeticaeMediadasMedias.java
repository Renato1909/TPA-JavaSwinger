/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mediaaritmeticaemediadasmedias;
import javax.swing.JOptionPane;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class MediaAritmeticaeMediadasMedias {

    public static void main(String[] args) {
        // Calcula a média dos números 8, 9 e 7
double media1 = (8 + 9 + 7) / 3.0;

// Calcula a média dos números 4, 5 e 6
double media2 = (4 + 5 + 6) / 3.0;

// Calcula a média das duas médias
double mediaDasMedias = (media1 + media2) / 2;

// Exibe o resultado final
JOptionPane.showMessageDialog(null, "Média das médias: " + mediaDasMedias);
    }
}

package br.uniesp.poo.exercicio01;

import javax.swing.*;

public class UseGas {
    public static void main(String[] args) {
        Gas gas = new Gas();

        int gasL = Integer.parseInt(JOptionPane.showInputDialog("Quantos litros abasteceu"));
        gas.setGas(gasL);
        JOptionPane.showMessageDialog(null,"Voce gastou R$ " + (gas.getGas()*2.5) + " com gasolina e R$ " + (gas.getSoda()*3) + " com refrigetante");
    }
}

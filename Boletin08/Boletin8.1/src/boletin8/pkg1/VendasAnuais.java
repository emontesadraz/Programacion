package boletin8.pkg1;

import javax.swing.JOptionPane;

public class VendasAnuais {

    public void verArtigos() {
        int vendas = Integer.parseInt(JOptionPane.showInputDialog(" teclea numero de vendas "));
        if (vendas <= 100) {
            System.out.println(" Baixo ");
        } else if (vendas <= 500) {
            System.out.println(" medio ");

        } else if (vendas <= 1000) {
            System.out.println(" alto ");
        } else {
            System.out.println(" primeira necesidade ");
        }
    }
}

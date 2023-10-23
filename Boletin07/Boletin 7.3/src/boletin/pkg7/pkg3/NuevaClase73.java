package boletin.pkg7.pkg3;

import java.util.Scanner;

public class NuevaClase73 {
 Scanner sc = new Scanner(System.in);
    public void amosarPositivo(){
       System.out.println("Introduce numero");
       int num = sc.nextInt();
        if (num > 0) {
            System.out.println("+");
        } else if (num == 0) {
            System.out.println("0");
        } else {
            System.out.println("-");
        }

    }
}

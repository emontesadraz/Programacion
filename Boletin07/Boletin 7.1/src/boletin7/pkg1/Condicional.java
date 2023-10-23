package boletin7.pkg1;

import java.util.Scanner;

public class Condicional {

    Scanner sc = new Scanner(System.in);

    public void verPositivo(){
        System.out.println("Introduce un numero");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println(num + " é positivo");
        }
    }
}

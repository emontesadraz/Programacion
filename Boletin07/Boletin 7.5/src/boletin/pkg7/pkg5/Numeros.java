
package boletin.pkg7.pkg5;

import java.util.Scanner;


public class Numeros {
    Scanner sc = new Scanner (System.in);
    public void verNumeros(){
        System.out.println("Introducir numero");
        int num1 = sc.nextInt();
        System.out.println("Introducir numero");
        int num2 = sc.nextInt();
        System.out.println("Introducir numero");
        int num3 = sc.nextInt();
        if (num1>num2 && num1>num3){
            System.out.println(num1+ " é o maior de todos");
        }else if(num2>num1 && num2>num3){
            System.out.println(num2+ " é o maior de todos");
        }else{
            System.out.println(num3 +" é o maior de todos");
        }
    } 
}

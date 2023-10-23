/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin.pkg7.pkg4;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class nomes {
    Scanner sc = new Scanner(System.in);
    public void verPeso (){
        System.out.println("Introduce el nombre");
        String nome1 = sc.nextLine();
        System.out.println("Introduce el peso");
        int peso1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce el nombre");
        String nome2 = sc.nextLine();
        System.out.println("Introduce el peso");
        int peso2 = sc.nextInt();
        if(peso1>peso2){
            System.out.println(nome1+ " pesa máis cunha diferencia de "+ (peso1 - peso2));
        }else if(peso1==peso2){
            System.out.println(nome1+ " pesa o mesmo que "+ nome2);
        }else{
            System.out.println(nome2+" pesa máis cunha diferenza de "+ (peso2-peso1));
        }
    }
}

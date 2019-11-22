/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;


/**
 *
 * @author JO40044425
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
             
        System.out.println("Digite um numero");
        float num1 = input.nextFloat();
        
        System.out.println("Digite um numero");
        float num2 = input.nextFloat();
        
        System.out.println("Digite um operador");
        String oper = input.next();

        if(oper.equalsIgnoreCase("+")){
            System.out.println("Resultado = "+ (num1+num2));
        }
        else if(oper.equalsIgnoreCase("-")){
            System.out.println("Resultado = "+ (num1-num2));

        }else if(oper.equalsIgnoreCase("*")){
            System.out.println("Resultado = "+ (num1*num2));

        }else if(oper.equalsIgnoreCase("/")){
            System.out.println("Resultado = "+ (num1/num2));
           
        }else if(oper.equalsIgnoreCase("^")){
            System.out.println("Resultado = "+ Math.pow(num1,num2));

        }
    }
    
}

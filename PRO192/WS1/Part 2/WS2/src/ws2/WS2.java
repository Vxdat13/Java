/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class WS2 {
    public static void main(String[] args) {
        float num1;
        float num2;
        String oper;
        int results;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number 1: ");
        num1 = sc.nextFloat();
        System.out.println("Input the number 2:");
        num2 = sc.nextFloat();
        System.out.println("input the operator:");
        sc = new Scanner(System.in);
        oper = sc.nextLine();
        if(oper.equals("+"))    {
            System.out.println("results:" + num1 + oper+ num2 +"="+(num1 + num2));
        }else if (oper.equals("-")) {
            System.out.println("results:" + num1 + oper+ num2 +"="+(num1 - num2));
        }else if (oper.equals("*")) {
            System.out.println("results:" + num1 + oper+ num2 +"="+(num1 * num2));
        }else if (oper.equals("/")) {
            System.out.println("results:" + num1 + oper+ num2 +"="+(num1 / num2));
    
    
    
    }
    }
}

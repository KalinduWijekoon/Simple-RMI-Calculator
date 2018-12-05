/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmicalculator;

import java.rmi.Naming;
import java.util.Scanner;

/**
 *
 * @author Kali
 */
public class CalcClient {
    public static void main(String args[]){
        System.out.println("MENU");
        System.out.println("");
        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for substraction");
        System.out.println("Enter 3 for multiplication");
        System.out.println("Enter 4 for divition");
        System.out.println("");
        System.out.println("Enter your choice");
        
        Scanner sc = new Scanner(System.in);
        try{
            CalcInterface c = (CalcInterface)Naming.lookup("//localhost/Calc");
            int choice = sc.nextInt();
            int x,y;
            switch(choice){
                case 1:{
                    System.out.println("Enter the first value");
                    x=sc.nextInt();
                    System.out.println("Enter the second value");
                    y=sc.nextInt();
                    System.out.println("Answer is : "+c.add(x, y));
                    break;
                }
                case 2:{
                    System.out.println("Enter the first value");
                    x=sc.nextInt();
                    System.out.println("Enter the second value");
                    y=sc.nextInt();
                    System.out.println("Answer is : "+c.sub(x, y));
                    break;
                }
                case 3:{
                    System.out.println("Enter the first value");
                    x=sc.nextInt();
                    System.out.println("Enter the second value");
                    y=sc.nextInt();
                    System.out.println("Answer is : "+c.mul(x, y));
                    break;
                }
                case 4:{
                    System.out.println("Enter the first value");
                    x=sc.nextInt();
                    System.out.println("Enter the second value");
                    y=sc.nextInt();
                    System.out.println("Answer is : "+c.div(x, y));
                    break;
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

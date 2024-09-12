/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cash2;
import java.util.Scanner;

/**
 *
 * @author CL3-PC33
 */
public class Cash2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("[1] - Snacks");
        System.out.println("[2] - Drinks");
        
        System.out.println("Enter your choice:");
        int ch1 = input.nextInt();
        
            //1st if condition snacks
            
            if(ch1==1)
            {
            System.out.println("Snacks");
            System.out.println("[1] - Piatos");
            System.out.println("[2] - Nova");
            
           
            
                System.out.println("Enter your choice:");
                int ch2 = input.nextInt();
                
                    if(ch2==1)
                    {
                    System.out.println("you choose piatos 20 pesos");
                    int pia , nova;
                    pia = 20;
                    nova = 22;
                    
                    System.out.println("Gusto mo Drinks? [1] yes [2] no:");
                    int ch3 = input.nextInt();
                    
                    if(ch3==2)
                    {
                        int tot;
                                    tot = pia;
                                    System.out.println("Total is :"+tot);
                                    System.out.println("Enter your cash:");
                                    int chs = input.nextInt();
                                    
                                        while(chs<tot)
                                        {
                                        System.out.println("Invalid Amount");
                                        System.out.println("Enter your cash:");
                                        chs = input.nextInt();
                                        }
                                        
                                        int chng;
                                        chng = chs - tot;
                                        System.out.println("Change is :"+chng);
                    }
                    else 
            {
                System.out.println("Invalid In");
            }
                    
                            if(ch3==1)
                            {
                            System.out.println("Drinks");
                            System.out.println("[1] - Coke");
                            System.out.println("[2] - Water");
                            int coke , wat;
                            coke = 21;
                            wat = 27;
                            
                                System.out.println("Enter your choice:");
                                int ch4 = input.nextInt();
                                
                                    if(ch4==1)
                                    {
                                    System.out.println("you choose coke 21 pesos");
                                    
                                    int tot;
                                    tot = pia + coke;
                                    System.out.println("Total is :"+tot);
                                    System.out.println("Enter your cash:");
                                    int chs = input.nextInt();
                                    
                                        while(chs<tot)
                                        {
                                        System.out.println("Invalid Amount");
                                        System.out.println("Enter your cash:");
                                        chs = input.nextInt();
                                        }
                                        
                                        int chng;
                                        chng = chs - tot;
                                        System.out.println("Change is :"+chng);
                                   
                                        
                                    
                                    }
                                    
                                    
                                    //piatos + water
                                    
                                    if(ch4==2)
                                    {
                                    System.out.println("you choose water 27 pesos");
                                    
                                    int tot;
                                    tot = pia + wat;
                                    System.out.println("Total is :"+tot);
                                    System.out.println("Enter your cash:");
                                    int chs = input.nextInt();
                                    
                                        while(chs<tot)
                                        {
                                        System.out.println("Invalid Amount");
                                        System.out.println("Enter your cash:");
                                        chs = input.nextInt();
                                        }
                                        
                                        int chng;
                                        chng = chs - tot;
                                        System.out.println("Change is :"+chng);
                                   
                                        
                                    
                                    }
                                    
                                    
                            }
                            
                    
                    }
                    
                    
                    
                    
                    //nova + coke , nova + water snacks 2nd main
                    if(ch2==2)
                    {
                    System.out.println("you choose nova 22 pesos");
                    int pia , nova;
                    pia = 20;
                    nova = 22;
                    
                    System.out.println("Gusto mo Drinks? [1] yes [2] no:");
                    int ch3 = input.nextInt();
                    
                    if(ch3==2)
                    {
                        int tot;
                                    tot = nova;
                                    System.out.println("Total is :"+tot);
                                    System.out.println("Enter your cash:");
                                    int chs = input.nextInt();
                                    
                                        while(chs<tot)
                                        {
                                        System.out.println("Invalid Amount");
                                        System.out.println("Enter your cash:");
                                        chs = input.nextInt();
                                        }
                                        
                                        int chng;
                                        chng = chs - tot;
                                        System.out.println("Change is :"+chng);
                                        
                    }
                    {
                System.out.println("Invalid In");
            }
                            if(ch3==1)
                            {
                            System.out.println("Drinks");
                            System.out.println("[1] - Coke");
                            System.out.println("[2] - Water");
                            int coke , wat;
                            coke = 21;
                            wat = 27;
                            
                                System.out.println("Enter your choice:");
                                int ch4 = input.nextInt();
                                
                                    if(ch4==1)
                                    {
                                    System.out.println("you choose coke 21 pesos");
                                    
                                    int tot;
                                    tot = nova + coke;
                                    System.out.println("Total is :"+tot);
                                    System.out.println("Enter your cash:");
                                    int chs = input.nextInt();
                                    
                                        while(chs<tot)
                                        {
                                        System.out.println("Invalid Amount");
                                        System.out.println("Enter your cash:");
                                        chs = input.nextInt();
                                        }
                                        
                                        int chng;
                                        chng = chs - tot;
                                        System.out.println("Change is :"+chng);
                                   
                                        
                                    
                                    }
                                    
                                    //nova + water
                                    
                                    if(ch4==2)
                                    {
                                    System.out.println("you choose water 27 pesos");
                                    
                                    int tot;
                                    tot = nova + wat;
                                    System.out.println("Total is :"+tot);
                                    System.out.println("Enter your cash:");
                                    int chs = input.nextInt();
                                    
                                        while(chs<tot)
                                        {
                                        System.out.println("Invalid Amount");
                                        System.out.println("Enter your cash:");
                                        chs = input.nextInt();
                                        }
                                        
                                        int chng;
                                        chng = chs - tot;
                                        System.out.println("Change is :"+chng);
                                   
                                        
                                    
                                    }
                            }
                    
                    }
                    
                    
            }
            
            
            //drinks
            
            else if(ch1==2)
            {
            System.out.println("Drinks");
            System.out.println("[1] - Coke");
            System.out.println("[2] - Water");
            
           
            
                System.out.println("Enter your choice:");
                int ch2 = input.nextInt();
                
                    if(ch2==1)
                    {
                    System.out.println("you choose coke 21 pesos");
                    int coke , wat;
                    coke = 21;
                    wat = 27;
                    
                    System.out.println("Gusto mo Snacks? [1] yes [2] no:");
                    int ch3 = input.nextInt();
                    
                    if(ch3==2)
                    {
                        int tot;
                                    tot = coke;
                                    System.out.println("Total is :"+tot);
                                    System.out.println("Enter your cash:");
                                    int chs = input.nextInt();
                                    
                                        while(chs<tot)
                                        {
                                        System.out.println("Invalid Amount");
                                        System.out.println("Enter your cash:");
                                        chs = input.nextInt();
                                        }
                                        
                                        int chng;
                                        chng = chs - tot;
                                        System.out.println("Change is :"+chng);
                    }
                    else 
            {
                System.out.println("Invalid In");
            }
                    
                            if(ch3==1)
                            {
                            System.out.println("Snacks");
                            System.out.println("[1] - Piatos");
                            System.out.println("[2] - Nova");
                            int pia , nova;
                            pia = 20;
                            nova = 22;
                            
                                System.out.println("Enter your choice:");
                                int ch4 = input.nextInt();
                                
                                    if(ch4==1)
                                    {
                                    System.out.println("you choose piatos 20 pesos");
                                    
                                    int tot;
                                    tot = pia + coke;
                                    System.out.println("Total is :"+tot);
                                    System.out.println("Enter your cash:");
                                    int chs = input.nextInt();
                                    
                                        while(chs<tot)
                                        {
                                        System.out.println("Invalid Amount");
                                        System.out.println("Enter your cash:");
                                        chs = input.nextInt();
                                        }
                                        
                                        int chng;
                                        chng = chs - tot;
                                        System.out.println("Change is :"+chng);
                                   
                                        
                                    
                                    }
                                    
                                    //piatos + water
                                    
                                    if(ch4==2)
                                    {
                                    System.out.println("you choose nova 22 pesos");
                                    
                                    int tot;
                                    tot = coke + nova;
                                    System.out.println("Total is :"+tot);
                                    System.out.println("Enter your cash:");
                                    int chs = input.nextInt();
                                    
                                        while(chs<tot)
                                        {
                                        System.out.println("Invalid Amount");
                                        System.out.println("Enter your cash:");
                                        chs = input.nextInt();
                                        }
                                        
                                        int chng;
                                        chng = chs - tot;
                                        System.out.println("Change is :"+chng);
                                   
                                        
                                    
                                    }
                            }
                    
                    }
                    
                    
                    //nova + coke , nova + water snacks 2nd main
                    if(ch2==2)
                    {
                    System.out.println("you choose water 27 pesos");
                    int coke , wat;
                    coke = 21;
                    wat = 27;
                    
                    System.out.println("Gusto mo Snacks? [1] yes [2] no:");
                    int ch3 = input.nextInt();
                    
                    if(ch3==2)
                    {
                        int tot;
                                    tot = wat;
                                    System.out.println("Total is :"+tot);
                                    System.out.println("Enter your cash:");
                                    int chs = input.nextInt();
                                    
                                        while(chs<tot)
                                        {
                                        System.out.println("Invalid Amount");
                                        System.out.println("Enter your cash:");
                                        chs = input.nextInt();
                                        }
                                        
                                        int chng;
                                        chng = chs - tot;
                                        System.out.println("Change is :"+chng);
                    }
                    else 
            {
                System.out.println("Invalid In");
            }
                    
                            if(ch3==1)
                            {
                            System.out.println("Snacks");
                            System.out.println("[1] - Piatos");
                            System.out.println("[2] - Nova");
                            int pia , nova;
                            pia = 20;
                            nova = 22;
                            
                                System.out.println("Enter your choice:");
                                int ch4 = input.nextInt();
                                
                                    if(ch4==1)
                                    {
                                    System.out.println("you choose piatos 20 pesos");
                                    
                                    int tot;
                                    tot = wat + pia;
                                    System.out.println("Total is :"+tot);
                                    System.out.println("Enter your cash:");
                                    int chs = input.nextInt();
                                    
                                        while(chs<tot)
                                        {
                                        System.out.println("Invalid Amount");
                                        System.out.println("Enter your cash:");
                                        chs = input.nextInt();
                                        }
                                        
                                        int chng;
                                        chng = chs - tot;
                                        System.out.println("Change is :"+chng);
                                   
                                        
                                    
                                    }
                                    
                                    //piatos + water
                                    
                                    if(ch4==2)
                                    {
                                    System.out.println("you choose nova 22 pesos");
                                    
                                    int tot;
                                    tot = nova + wat;
                                    System.out.println("Total is :"+tot);
                                    System.out.println("Enter your cash:");
                                    int chs = input.nextInt();
                                    
                                        while(chs<tot)
                                        {
                                        System.out.println("Invalid Amount");
                                        System.out.println("Enter your cash:");
                                        chs = input.nextInt();
                                        }
                                        
                                        int chng;
                                        chng = chs - tot;
                                        System.out.println("Change is :"+chng);
                                   
                                        
                                    
                                    }
                            }
                    
                    }
                    
                    
            }
            else
            {
                System.out.println("Invalid In");
            }
    }
}
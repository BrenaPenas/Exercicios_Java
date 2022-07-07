
package Exercicios;

import java.util.Scanner;

public class ex_02 {
                
                public static void main(String[] args) {
                      
                int n1 = 0;
                int n2 = 1;
                int n3 = 0;
                int f;   
                
                Scanner entrada = new Scanner(System.in);
                    System.out.println("Digite um número: ");
                    f = entrada.nextInt();

                
                while(f > n3){
                    n3 = n1 + n2;
                    n1 = n2;
                    n2 = n3;
                }
                if(f == n3){
                    System.out.println("O número "+f+" está na sequência de Fibonacci");
                }else {
                    System.out.println("O número "+f+" não faz parte da sequência Fibonacci");
                }
             }
           
      
            
           
           
}    


    

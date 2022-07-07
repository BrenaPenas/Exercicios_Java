
package Exercicios;

import java.util.Scanner;

public class ex_05 {
    
    public static void main(String[] args){
            
        String text;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite uma palavra: ");
        text = entrada.next();

    for (int i = (text.length() - 1); i >= 0; i--) {
        System.out.print(text.charAt(i));
    
        }
    }
}

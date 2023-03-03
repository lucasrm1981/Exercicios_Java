package fatorial;

import java.util.Scanner;

/**
 *
 * @author lucas.monteiro
 */
public class Fatorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /* Preparação para entrada dos dados com o usuário */
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um inteiro para calculo do faotrial:\n");
        int numero = input.nextInt();
        long fatorial =1; /* Inicio da váriavel como fatorial */
      
       /* Cálculo do fatorial */
      for(int i=numero; i>0;i--){
            fatorial = fatorial*i; 
        } 
      /* IMpressão do fatorial*/
      System.out.print("O Fatorial de "+numero+" e: "+fatorial+"\n");
    }
    
}

/*
*67) Conversão de graus celsius para kelvin inserida pelo usuário
*/


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
          double k;
          byte c;
        
        System.out.println("Digite a temperatura em Celsius para Kelvin"); /* Texto de exibicao */
        Scanner entrada = new Scanner(System.in);
        c = entrada.nextByte(); /* Recebimento da entrada*/
        /* Fórmula para kelvin k = TemperaturaCelsius + 273.15 graus*/ 
        k = c+273.15; 
        
        System.out.println(c+" graus celsius para Kelvin e "+k);
    }
    
}

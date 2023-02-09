/* 
 * 65) Utilizando a classe "Scanner", do pacote "java.util", solicite o peso e a altura da pessoa.
 * Em seguida calcule seu Indice de Massa Corporal e exiba a classificação apropriada.
 * No resultado foi criado duas funções uma para o IMC e uma para as decisões
 */

import java.util.Scanner;

/**
 *
 * @author lucas.monteiro
 */
public class Imc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
  double peso = 0, altura = 0;
  System.out.print("Peso: ");
  peso = scan.nextDouble();
  System.out.print("Altura: ");
  altura = scan.nextDouble();

  double imc = calcular(peso, altura);
  String classificacao =  classificar(imc);

  System.out.printf("""
    IMC: %.2f
    Classificacao: %s
  """, imc, classificacao);
    }

     static double calcular(double p, double a) {/* Função que vai calcular o IMC */
        return p / (a * a);
  }

  static String classificar(double imc) {    /* Função que vai passar o texto de acordo com o IMC */

    if (imc < 18.5) return "Abaixo do Peso";
    else if (imc >= 18.5 && imc < 25) return "Peso Normal";
    else if (imc >= 25 && imc < 30) return "Sobrepeso";
    else return "Obeso";

  }
    
}
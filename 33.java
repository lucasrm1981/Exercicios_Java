/*******************************************************************************
* 33) Escreva um programa que calcule e exiba a média da nota dos alunos de uma
* turma em uma prova. O número de alunos é desconhecido. Os dados de um aluno
* são: número de matrícula e a sua nota na prova em questão.
*******************************************************************************/
package aluno;

import java.util.Scanner;

public class Aluno {

    //Variáveis do construtor
    String matricula_;
    double nota_;

// Construtor Aluno com passagem de valores para as variáveis
    public Aluno(String matricula, double nota) {
        matricula_ = matricula;
        nota_ = nota;
    }

  
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int QuantidadeAlunos;
        String matricula;
        double mediaAlunos = 0;

        System.out.print("Digite um a quantidade de alunos: ");
        QuantidadeAlunos = entrada.nextInt();
// Instanciação e contrução do objeto alunos com array
        Aluno[] alunos = new Aluno[QuantidadeAlunos];

        for (int x = 0; x < QuantidadeAlunos; x++) {
            System.out.print("\nDigite o número da matrícula do aluno: ");
            matricula = entrada.next();
            System.out.print("Digite a nota do aluno: ");
            double nota = entrada.nextDouble();
// Array dos alunos
            alunos[x] = new Aluno(matricula, nota);
// Passagem de valores para as classes
            alunos[x].matricula_ = matricula;
            alunos[x].nota_ = nota;
            // Soma das notas
            mediaAlunos += nota;
        }
        //Calculo da média das notas
        mediaAlunos = mediaAlunos / QuantidadeAlunos;
        System.out.println("\nA média da turma foi de " + mediaAlunos);
    }

}

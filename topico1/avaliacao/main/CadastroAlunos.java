package topico1.avaliacao.main;

import java.util.Scanner;

public class CadastroAlunos {
  public static void main(String[] args) {
    int numeroTotalAlunos = 25;
    int contadorAluno = 0;

    Scanner scanner = new Scanner(System.in);

    String[] alunos = new String[numeroTotalAlunos];

    while(contadorAluno < numeroTotalAlunos) {
      System.out.println( contadorAluno + " Nome: ");
      String nome = scanner.nextLine();

      if (nome != null && !nome.equals("")) {
        alunos[contadorAluno] = nome;
        contadorAluno++;
      } else {
        System.out.println("informe um nome: ");
      }
    }

    scanner.close();
  }
}
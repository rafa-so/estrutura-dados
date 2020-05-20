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


/*

Como o array em java ele tem tamanho fixo, seja informando diretamente 
no código (hardcoded) ou no terminal (atravez do input) não tem como acrescentar
mais 5 alunos. A não ser que em tempo de desenvolvimento eu copie tudo para um novo
array e descarte do anterior com menos alucações na memória. 

*/
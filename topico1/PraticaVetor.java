package topico1;

public class PraticaVetor {
  public static void main(String[] args) {
    int size = 100;

    int[] vet1 = new int[size];
    int[] vet2 = new int[size];

    int cumulativeVet1 = 0;
    int cumulativeVet2 = 0;

    for (int i = 0; i < size; i++) {
      vet1[i] = i;
      cumulativeVet1 += i;
    }

    for (int j = 99; j > 0; j--) {
      vet2[j] = j;
      cumulativeVet2 += j;
    }

    System.out.println("A media do vet_1 é: " + cumulativeVet1 / 100);
    System.out.println("A media do vet_2 é: " + cumulativeVet2 / 100);
  }
}
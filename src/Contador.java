import java.util.Locale;
import java.util.Scanner;

public class Contador {

  public static void main(String[] args) {
    Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Sigite o primeiro parâmetro: ");
    int parametroUm = terminal.nextInt();

    System.out.println("Sigite o segundo parâmetro: ");
    int parametroDois = terminal.nextInt();

    try {

      contar(parametroUm, parametroDois);

    } catch (ParametrosInvalidosException e) {
      System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
    }
  }

  static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

    int contagem = parametroDois - parametroUm;

    if (parametroDois > parametroUm) {
      for (int i = 1; i <= contagem; i++) {
        System.out.println("Imprimindo o número " + i);
      }
    } else {
      throw new ParametrosInvalidosException();
    }
  }

}

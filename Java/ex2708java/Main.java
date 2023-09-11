package Java.ex2708java;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int turistasNoParque = 0;
    int jipesNoParque = 0;

    while (true) {
      String voltasai = ler.next();
      if (voltasai.equals("ABEND")) {
        break;
      }

      int T = ler.nextInt();

      if (voltasai.equals("SALIDA")) {
        turistasNoParque += T;
        jipesNoParque++;
      } else if (voltasai.equals("VUELTA")) {
        turistasNoParque -= T;
        jipesNoParque--;
      }
    }

    System.out.println(turistasNoParque);
    System.out.println(jipesNoParque);
    ler.close();
  }
}

//DEIXAR EM POO
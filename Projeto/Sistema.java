package Projeto;
import java.util.Scanner;
import java.lang.Math;
public class Sistema {
    Scanner entrada = new Scanner(System.in);
    double a, b, c;
    double delta;
    String sair;
    
    void entradaDados() {
        System.out.print("\nDigite o coeficiente A: ");
        a = entrada.nextDouble();

        System.out.print("Digite o coeficiente B: ");
        b = entrada.nextDouble();

        System.out.print("Digite o coeficiente C: ");
        c = entrada.nextDouble();
    }
    
    void calcularDelta() {
        delta = (b * b) - (4 * a * c);
    }

    void resultadoRaizes() {
        if (delta > 0) {
            double x1 = ((-b + Math.sqrt(delta)) / (2 *a));
            double x2 = ((-b - Math.sqrt(delta)) / (2 *a));

            System.out.print("\nX1: " + x1 + " / " + "X2: " + x2);

        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.print("\nX: " + x);

        } else {
            System.out.print("\nNão existe raízes reais!");
        }
    }

    String saidaPrograma() {
        System.out.print("\nDeseja encerrar o programa? (sim / não): ");sair = entrada.next().toLowerCase();
        return sair;
    }
}

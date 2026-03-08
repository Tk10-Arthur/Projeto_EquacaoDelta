package Projeto;
import java.lang.Math;
import javax.swing.JOptionPane;

public class Sistema {

    // Declaração das variáveis
    double a, b, c;
    double delta;
    String sair;

    void entradaDados() {

        do {
            a = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente A: "));

            if(a == 0) {
            JOptionPane.showMessageDialog(null, "O coeficiente A não pode ser 0!");
            }

        } while (a==0);

        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente B: "));
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente C: "));
    }
    
    void calcularDelta() {
        delta = (b * b) - (4 * a * c);
    }

    void resultadoRaizes() {
        JOptionPane.showMessageDialog(null, "Delta: " + delta);
        if (delta > 0) {
            double x1 = ((-b + Math.sqrt(delta)) / (2 *a));
            double x2 = ((-b - Math.sqrt(delta)) / (2 *a));
            JOptionPane.showMessageDialog(null, "X1: " + x1 + " / " + "X2: " + x2);

        } else if (delta == 0) {
            double x = -b / (2 * a);
            JOptionPane.showMessageDialog(null, "X: " + x);

        } else {
            JOptionPane.showMessageDialog(null, "Não existe raízes reais!");
        }
    }

    String saidaPrograma() {
        sair = JOptionPane.showInputDialog("Deseja encerrar o programa? (sim / não): ");
        return sair.toLowerCase();
    }
}

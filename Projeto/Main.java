package Projeto;
import javax.swing.JOptionPane;

class Main {
    public static void main(String[] args) {
        Sistema conexoes = new Sistema();
        
        do {
           conexoes.entradaDados();
           conexoes.calcularDelta();
           conexoes.resultadoRaizes();
        
        } while (!conexoes.saidaPrograma().equalsIgnoreCase("sim"));

        JOptionPane.showMessageDialog(null, "Programa encerrado.");
    }
}
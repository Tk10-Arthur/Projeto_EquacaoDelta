package Projeto;
class Main {
    public static void main(String[] args) {
        Sistema conexoes = new Sistema();
        
        do {
           conexoes.entradaDados();
           conexoes.calcularDelta();
           conexoes.resultadoRaizes();
        
        } while (!conexoes.saidaPrograma().equals("sim"));
        
        System.out.print("Programa encerrado.");
        conexoes.entrada.close();
    }
}
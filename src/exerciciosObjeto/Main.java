package exerciciosObjeto;

public class Main {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(001);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        p1.depositar(300);
        p1.fecharConta();
        p1.estadoAtual();

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(002);
        p2.setDono("Creuza");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(1000);


        p2.estadoAtual();
    }
}

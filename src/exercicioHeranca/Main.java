package exercicioHeranca;

public class Main {
    public static void main(String[] args) {
        /*Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setSexo("Masculino");
        v1.setIdade(30);
        System.out.println(v1.toString());*/

        Aluno a1 = new Aluno();
        a1.setNome("Joao");
        a1.setMatricula(1111);
        a1.setCurso("TI");
        a1.setIdade(20);
        a1.setSexo("Masculino");
        a1.pagarMensalidade();
        System.out.println();

        Bolsista b1 = new Bolsista();
        b1.setNome("Bruno");
        b1.setMatricula(1112);
        b1.setBolsa(12.5f);
        b1.setSexo("Masculino");
        b1.pagarMensalidade();



    }
}

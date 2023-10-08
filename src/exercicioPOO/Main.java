package exercicioPOO;

public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa [3];
        Livro[] l = new Livro [3];

        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 32, "F");

        l[0] = new Livro("Dum way to Die", "Jonas Brothers", 500, p[0]);
        l[1] = new Livro("Dum way ", " Jonas Joners", 211, p[1]);
        l[2] = new Livro("Java avancado ", " Einstein Joners", 380, p[0]);

        System.out.println(l[0].detalhes());

    }
}

/*
 * Encapsular
 * ocultar partes independentes da implementa&ccedil;&atilde;o, permitindo construir
 * parter invisiveis ao mundo exterior
 * todo objeto encapsulado possui uma interface
 *  Interface:
 *Lista de servicos fornecidos por um componente.
 * É o contato com o mundo exterior, que define
 * o que pode ser feito com um objeto dessa classe.
 *
 */
package encapsulamento;

public class Main {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.maisVolume();
        c.ligarMudo();
        c.abrirMenu();


    }
}

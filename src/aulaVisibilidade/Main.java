package aulaVisibilidade;
/*
 * Para POO é importante aprender sobre UML (linguagem  de modelagem unificada)
 * Nela toda classe é um retangulo sendo dividido em 3 partes, nome da classe, atributos e metodos
 * alem disso, acrescentamos os modificadores de visibilidade
 *
 * Modificadores de visibilidade definicao:
 * Indicam o nivel de acesso aos componentes internos
 * de uma classe.
 * + publico -> a classe atual etodas as outras classes
 * - privado -> somente a classe atual
 * # protegido -> a classe atual e a todas as suas sub-classes
 * */

public class Main {

    public static void main(String[] args) {
       Caneta c1 = new Caneta();
       c1.modelo = "Cristal";
       //c1.ponta = 0.5;
       c1.cor = "Azul";
       c1.status();

    }


}

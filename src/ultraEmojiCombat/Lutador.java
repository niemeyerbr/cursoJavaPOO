package ultraEmojiCombat;

public class Lutador {
    // atributos
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, empates, derrotas;

    private double altura, peso;
    // metodos publicos
    public void apresentar(){
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("IIIIIIT´S TIIIIIME! Apresentamos o Lutador: " + this.getNome());
        System.out.println("Representando seu país:  " + this.getNacionalidade());
        System.out.println("Com seus: " + this.getIdade() + " anos e " + this.getAltura() + " m de altura" );
        System.out.println("Pesando " + this.getPeso() + " Kg de pura fibra muscular!");
        System.out.println("com " + this.getVitorias() + " vitorias " + this.getEmpates() + " empates e " + this.getDerrotas() + " derrotas.");
        System.out.println("-------------------------------------------------------------------------------------------------");

    }
    public void status(){
        System.out.println(this.getNome() + " é um " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vezes");
        System.out.println("Empatou " + this.getEmpates() + " vezes");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes");

    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);

    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);

    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);

    }


    // metodos especiais

    public Lutador(String nome, String nacionalidade, int idade, int vitorias, int empates, int derrotas, double altura, double peso) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas = derrotas;
        this.altura = altura;
        this.setPeso(peso);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if (this.peso < 52.2){
            this.categoria = "Inválido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Peso-Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Peso-Médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Peso-Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }
}

package exerciciosObjeto;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public void estadoAtual() {
        System.out.println("------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC"){
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }
    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("Conta nao pode ser fechada pois possui dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("conta com saldo negativo nao pode ser encerrada");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }
    public void depositar(double v){
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado com sucesso na conta de: " + this.getDono() + " Saldo atual: " + this.getSaldo());
        } else {
            System.out.println("Conta fechada, nao foi possivel depositar");
        }
    }
    public void sacar(double v){
        if (this.isStatus() == true){
            if (this.getSaldo() >= v) {
                this.setSaldo(getSaldo() - v);
                System.out.println("Saque realizado com sucesso, saldo atual " + this.getSaldo());
            } else {
                System.out.println("valor de saque maior que o saldo disponivel, saldo atual: " + this.getSaldo());
            }
        } else {
            System.out.println("Conta fechada, impossivel sacar");
        }
    }
    public void pagarMensal(){
         int v = 0;
         if (this.getTipo() == "CC"){
             v = 12;
         } else if (this.getTipo() == "CP") {
             v = 20;
         }
         else if (this.isStatus() == true) {
             this.setSaldo(getSaldo() - v);
             System.out.println("taxa mensal cobrada, saldo atual: " + this.getSaldo());
         } else {
             System.out.println("Saldo insuficiente para taxa mensal");
         }
    }

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}

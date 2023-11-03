/**
 * Java OO: entendendo a Orientação a Objetos
 * @author Heitor Silva Avila
 */
public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    public void deposita(double valor) {
        this.setSaldo(this.getSaldo() + valor);
    }
    public Conta () { 
        
    }
    public Conta (double saldo, int agencia, int numero, String nome, String cpf, String profissao) { 
        
        this.saldo = saldo;
        this.agencia = agencia;
        this.numero = numero;
        this.titular = new Cliente (nome, cpf, profissao);
        
    }
    public String retornaNomeTitular () { 
        return this.titular.getNomeTitular();
    }
    public boolean saca(double valor) {
        if (this.getSaldo() >= valor) {
            this.setSaldo(this.getSaldo() - valor);
            return true;
        } else {
            return false;
        }
    }
    public boolean transfere(double valor, Conta destino) {
        if (this.getSaldo() >= valor) {
            this.setSaldo(this.getSaldo() - valor);
            destino.deposita(valor);
            return true;
        }
        return false;
    }
    public double getSaldo() { 
        return this.saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public Cliente getTitular() {
        return titular;
    }
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    @Override public String toString() { 
        return ("Titular: " + retornaNomeTitular() + " Agência: " + getAgencia() + " Conta: " + getNumero() + " Saldo: R$" + getSaldo());
    }
}
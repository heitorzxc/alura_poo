/**
 * Java OO: entendendo a Orientação a Objetos
 * @author Heitor Silva Avila
 */
public class Cliente { 
    public String getNome() {
        return nome;
    }
    public Cliente () { 
        
    }
    public Cliente (String nome, String cpf, String profissao) { 
        this.nome = nome;
        this.cpf = cpf;
        this.profissao = profissao;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNomeTitular() {
        return this.nome;
    }    
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    private String nome;
    private String cpf;
    private String profissao;
}
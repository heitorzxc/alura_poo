/**
 * Java OO: entendendo a Orientação a Objetos
 * @author Heitor Silva Avila
 */
public class TestaContaSemCliente { 
    public static void main(String[] args) { 
        Conta conta = new Conta();
        // System.out.println(conta.getSaldo());  
        // contaDaMarcela.titular.nome = "Marcela";    
        // System.out.println(contaDaMarcela.titular.nome);
        // Referência nula! Gera exceção e interrompe retornando erro.
        Cliente referencia = new Cliente();
        referencia.setNome("Marcela");
        referencia.setCpf("AAA.BBBB.CCC-DD");
        referencia.setProfissao("Diretora Geral");
        conta.setTitular(referencia);
        System.out.println(conta.getTitular().getNome());
        System.out.println(conta.getTitular().getCpf());
        System.out.println(conta.getTitular().getProfissao());
    }
}
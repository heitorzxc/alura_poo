/**
 * Java OO: entendendo a Orientação a Objetos
 * @author Heitor Silva Avila
 */
public class TestaGetESet { 
  public static void main(String[] args) { 
    Conta conta = new Conta();

    conta.setNumero(1337);
    System.out.println(conta.getNumero());

    Cliente contaMariana = new Cliente(); 
    contaMariana.setNome("Mariana Silveira");

    conta.setTitular(contaMariana);

    System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("Administradora de Sistemas"); 
        //agora em duas linhas: 
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("Gerência de Banco de Dados");

        System.out.println(titularDaConta); 
        System.out.println(contaMariana);
        System.out.println(conta.getTitular());


  }
}
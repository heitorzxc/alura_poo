/**
 * Java OO: entendendo a Orientação a Objetos
 * @author Heitor Silva Avila
 */
public class TestaBanco { 
    public static void main(String[] args) { 
        Cliente heitor = new Cliente(); 
        heitor.setNome("Heitor Avila");
        heitor.setCpf("XXX.XXX.XXX-XX");
        heitor.setProfissao("Cientista da Computação");
        Conta contaDoHeitor = new Conta();
        contaDoHeitor.deposita(100);
        contaDoHeitor.setTitular(heitor);
        System.out.println("------------------------------");
        System.out.println("Imprimindo contaDoHeitor.titular.nome:");
        System.out.println(contaDoHeitor.getTitular().getNome());
        System.out.println("------------------------------");
        System.out.println("Imprimindo heitor.nome:");
        System.out.println(heitor.getNome());
        System.out.println("------------------------------");
        System.out.println("Imprimindo contaDoHeitor.titular (hash):");
        System.out.println(contaDoHeitor.getTitular());
        System.out.println("------------------------------");
        System.out.println("Imprimindo heitor (hash):");
        System.out.println(heitor);
        System.out.println("------------------------------");
        System.out.println("Perceba que é o mesmo hash!");
        System.out.println("Mesma referência, mesma posição de memória!");
        System.out.println("------------------------------");
    }
}
/**
 * Java OO: entendendo a Orientação a Objetos
 * @author Heitor Silva Avila
 */
public class TesteSacaNegativo { 
    public static void main(String[] args) { 
        Conta conta = new Conta();
        conta.setTitular(new Cliente());
        conta.deposita(100);
        System.out.println(conta.getSaldo());
        if (conta.saca(101)) { 
            System.out.println("Saque efetuado com sucesso, retornando true.");
        }
        else { 
            System.out.println("Saque não foi efetuado. Valor continua o mesmo, retornando false.");
        }
    }
}
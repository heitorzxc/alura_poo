/**
 * Java OO: entendendo a Orientação a Objetos
 * @author Heitor Silva Avila
 */
public class Construtores {
    public static void main(String[] args) {
        Conta contaDoHeitor = new Conta (2000, 1, 1, "Heitor Silva Avila", "xxx.xxx.xxx-xx", "Programador");
        Conta contaDoMarcone = new Conta (1000, 1, 2, "Marcone de Freitas Marques", "yyy.yyy.yyy-yy", "Programador");
        Conta contaDaLuciana = new Conta (500, 1, 3, "Luciana Foss", "zzz.zzz.zzz-zz", "Professora do Magisterio Superior");
        System.out.println(contaDoHeitor);
        System.out.println(contaDoMarcone);
        System.out.println(contaDaLuciana);      
    }
}

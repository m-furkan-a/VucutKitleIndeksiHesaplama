import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

	    double boy,kilo,vki;
	    System.out.print("Boyunuzu girin : ");
	    boy = input.nextDouble();
        System.out.print("Kilonuzu girin : ");
        kilo = input.nextDouble();
        vki=boy * boy ;
        vki =kilo / vki  ;
        System.out.print("Vücut Kitle İndeksiniz : " + vki);
    }
}

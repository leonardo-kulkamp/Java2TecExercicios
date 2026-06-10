import java.util.Scanner;
public class exercicio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String senhaPadrao = "1234";
        System.out.println("Digite a sua senha: ");

        String senhaDigitada = scanner.next();


        if (senhaDigitada.equals(senhaPadrao)){
            System.out.println("Acesso Liberado");

        } else{
            System.out.println("Acesso Recusado");

        }
    }
}
import java.util.Scanner;
public class exercicio06 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor total da compra: ");

        double valorTotal = scanner.nextDouble();
        double valorFinal;

        if (valorTotal > 200){
            valorFinal = valorTotal * 0.80; 
            System.out.println("Seu desconto de 20% foi aplicado!");

        } else if (valorTotal > 100){
            valorFinal = valorTotal * 0.90; 
            System.out.println("Seu desconto de 10% foi aplicado!");

        } else{
            valorFinal = valorTotal;
            System.out.println("Você não tem nenhum desconto aplicado.");
        }
        System.out.printf("Você vai pagar: R$ %.2f\n", valorFinal);
    }
}
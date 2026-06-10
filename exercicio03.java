import java.util.Scanner;
public class exercicio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a velocidade do carro: ");
        double velocidade = scanner.nextDouble();

        if (velocidade > 80){
            System.out.println("Você foi multado!");

        } else{
            System.out.println("Boa viagem!");

        }

    }

}
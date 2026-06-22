import java.util.Scanner;
public class exercicioSemaforo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite a cor do Semáforo!");
        String cor = scanner.nextLine();

        String corMaiuscula = cor.toUpperCase();

        if (corMaiuscula.equals("VERMELHO")) {
            System.out.println("Pare o carro");

        } else if (corMaiuscula.equals("AMARELO")){
            System.out.println("Atenção");
        }

        else{
            System.out.println("Siga!");
        }
        scanner.close();

    }
}

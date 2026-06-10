import java.util.Scanner;
public class exercicio04 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma cor (Verde, Amarelo ou Vermelho): ");
        String cor = scanner.next();

        if (cor.equalsIgnoreCase("Verde")){
            System.out.println("Siga");

        } else if (cor.equalsIgnoreCase("Amarelo")){
            System.out.println("Atenção");

        } else if (cor.equalsIgnoreCase("Vermelho")){
            System.out.println("Pare");

        } else{
            System.out.println("Cor inválida");

        }
    }
}
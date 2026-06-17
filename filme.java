public class filme {
    
    public static void main(String[] args) {
        System.out.println("Bem vindos ao TecFlix");
        System.out.println("Filme: Homem Aranha: Sem Volta Para Casa");

        int anoDeLancamento = 2021;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.2;

        //Média calculada pelas notas do Arthur, Alexandre e Julio

        double media = (9.1 + 10 + 8) / 3;
        System.out.println("A Media que o Segundo Tec deu: " + media);

        String sinopse;

        sinopse = """
                Filme Do Homem Aranha Sem Volta Para Casa
                Estrelado Por Tobey Maguire, Andrew Garfield e Tom Holland
                O Filme tem nota alta
                e foi lançado em
                """ + anoDeLancamento;

                System.out.println(sinopse);
    }
}

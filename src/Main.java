//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        boolean b = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Seja bem vindo!------");
        System.out.println("Digite os dados requisitados para obter os resultados dos seus indicadores");
        while (true) {
            System.out.println("Digite o mês");
            String mes = sc.nextLine();
            if (mes == "sair") {
                System.out.println("Programa encerrado!");
                break;
            }
            int otima = 0;
            int bom = 0;
            int neutra = 0;
            int ruins = 0;
            int pessimas = 0;
            int somaJaneiro = 0;
            int somaFevereiro = 0;
            int somaMarço = 0;
            int somaAbril = 0;
            int somaMaio = 0;
            int somaJunho = 0;
            int somaJulho = 0;


            {
                switch (mes) {
                    case "janeiro":
                        System.out.println("===JANEIRO===");
                        System.out.println("Quantidade de avaliações OTIMAS: ");
                        otima = sc.nextInt();
                        System.out.println("Quantidade de avaliações BOAS: ");
                        bom = sc.nextInt();
                        System.out.println("Quantidade de avaliações NEUTRAS: ");
                        neutra = sc.nextInt();
                        System.out.println("Quantidade de avaliações RUINS: ");
                        ruins = sc.nextInt();
                        System.out.println("Quantidade de avaliações PESSIMAS: ");
                        pessimas = sc.nextInt();
                        sc.nextLine();
                        somaJaneiro = otima + bom + neutra + ruins + pessimas;
                        System.out.println("O total de pesquisas respondidas nesse mes foi de: " + somaJaneiro);
                        break;

                    case "fevereiro":
                        System.out.println("===FEVEREIRO===");
                        System.out.println("Quantidade de avaliações OTIMAS: ");
                        otima = sc.nextInt();
                        System.out.println("Quantidade de avaliações BOAS: ");
                        bom = sc.nextInt();
                        System.out.println("Quantidade de avaliações NEUTRAS: ");
                        neutra = sc.nextInt();
                        System.out.println("Quantidade de avaliações RUINS: ");
                        ruins = sc.nextInt();
                        System.out.println("Quantidade de avaliações PESSIMAS: ");
                        pessimas = sc.nextInt();

                        somaFevereiro = otima + bom + neutra + ruins + pessimas;
                        System.out.println("O total de pesquisas respondidas nesse mes foi de: " + somaFevereiro);
                        break;
                    case "março":
                        System.out.println("===MARÇO===");
                        System.out.println("Quantidade de avaliações OTIMAS: ");
                        otima = sc.nextInt();
                        System.out.println("Quantidade de avaliações BOAS: ");
                        bom = sc.nextInt();
                        System.out.println("Quantidade de avaliações NEUTRAS: ");
                        neutra = sc.nextInt();
                        System.out.println("Quantidade de avaliações RUINS: ");
                        ruins = sc.nextInt();
                        System.out.println("Quantidade de avaliações PESSIMAS: ");
                        pessimas = sc.nextInt();

                        somaMarço = otima + bom + neutra + ruins + pessimas;
                        System.out.println("O total de pesquisas respondidas nesse mes foi de: " + somaMarço);
                        break;
                    case "abril":
                        System.out.println("===ABRIL===");
                        System.out.println("Quantidade de avaliações OTIMAS: ");
                        otima = sc.nextInt();
                        System.out.println("Quantidade de avaliações BOAS: ");
                        bom = sc.nextInt();
                        System.out.println("Quantidade de avaliações NEUTRAS: ");
                        neutra = sc.nextInt();
                        System.out.println("Quantidade de avaliações RUINS: ");
                        ruins = sc.nextInt();
                        System.out.println("Quantidade de avaliações PESSIMAS: ");
                        pessimas = sc.nextInt();

                        somaAbril = otima + bom + neutra + ruins + pessimas;
                        System.out.println("O total de pesquisas respondidas nesse mes foi de: " + somaAbril);
                        break;
                    case "maio":
                        System.out.println("===MAIO===");
                        System.out.println("Quantidade de avaliações OTIMAS: ");
                        otima = sc.nextInt();
                        System.out.println("Quantidade de avaliações BOAS: ");
                        bom = sc.nextInt();
                        System.out.println("Quantidade de avaliações NEUTRAS: ");
                        neutra = sc.nextInt();
                        System.out.println("Quantidade de avaliações RUINS: ");
                        ruins = sc.nextInt();
                        System.out.println("Quantidade de avaliações PESSIMAS: ");
                        pessimas = sc.nextInt();

                        somaMaio = otima + bom + neutra + ruins + pessimas;
                        System.out.println("O total de pesquisas respondidas nesse mes foi de: " + somaMaio);
                        break;
                    case "junho":
                        System.out.println("===JUNHO===");
                        System.out.println("Quantidade de avaliações OTIMAS: ");
                        otima = sc.nextInt();
                        System.out.println("Quantidade de avaliações BOAS: ");
                        bom = sc.nextInt();
                        System.out.println("Quantidade de avaliações NEUTRAS: ");
                        neutra = sc.nextInt();
                        System.out.println("Quantidade de avaliações RUINS: ");
                        ruins = sc.nextInt();
                        System.out.println("Quantidade de avaliações PESSIMAS: ");
                        pessimas = sc.nextInt();

                        somaJunho = otima + bom + neutra + ruins + pessimas;
                        System.out.println("O total de pesquisas respondidas nesse mes foi de: " + somaJunho);
                        break;
                    case "julho":
                        System.out.println("===JULHO===");
                        System.out.println("Quantidade de avaliações OTIMAS: ");
                        otima = sc.nextInt();
                        System.out.println("Quantidade de avaliações BOAS: ");
                        bom = sc.nextInt();
                        System.out.println("Quantidade de avaliações NEUTRAS: ");
                        neutra = sc.nextInt();
                        System.out.println("Quantidade de avaliações RUINS: ");
                        ruins = sc.nextInt();
                        System.out.println("Quantidade de avaliações PESSIMAS: ");
                        pessimas = sc.nextInt();

                        somaJulho = otima + bom + neutra + ruins + pessimas;
                        System.out.println("O total de pesquisas respondidas nesse mes foi de: " + somaJulho);
                        break;

                    default:
                        System.out.println("Opção inválida! Tente novamente");
                        break;
                }
            }
            boolean sair = false;
            while (!sair) {
                System.out.println("O que deseja fazer agora?");
                System.out.println("1 - Índices quantidade total de respostas (Anual)");
                System.out.println("2 - Índices de avaliações ótimas/boas (Anual)");
                System.out.println("3 - Índices de avaliações péssimas/ruins (Anual)");
                System.out.println("1 - Índices quantidade total de respostas (Mensal)");
                System.out.println("4 - Índices de avaliações ótimas/boas (Mensal)");
                System.out.println("1 - Índices de avaliações péssimas/ruins(Mensal)");
                System.out.println("-----------------------------------------------------------");

                int opcao = sc.nextInt();
                sc.nextLine();
            }
        }
    }
}
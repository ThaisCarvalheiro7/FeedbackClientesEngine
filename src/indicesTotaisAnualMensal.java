import java.text.DecimalFormat;
import java.util.Scanner;
public class indicesTotaisAnualMensal {
    public void indicadoresEquipe(){
        Scanner sc = new Scanner(System.in);
        String [] nomeMeses = {
                "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro"
        };
        String [] equipes = {
                "Suporte Gerencial", "Suporte Integração", "Suporte Plataforma", "Suporte SAP"
        };
        int[] totalMensal = new int [9];
        int[] otimasBoas = new int [9];
        int[] pessimasRuins = new int[9];
        int escolha = 0;

        for (int i = 0; i < nomeMeses.length; i++){
            System.out.println("==="+nomeMeses[i]+"===");
            System.out.println("Digite o valor de avaliações 'ÓTIMAS': ");
            int otima = sc.nextInt();

            System.out.println("Digite o valor de avaliações 'BOAS': ");
            int boa = sc.nextInt();

            System.out.println("Digite o valor de avaliações 'NEUTRAS': ");
            int neutra = sc.nextInt();

            System.out.println("Digite o valor de avaliações 'RUINS': ");
            int ruim = sc.nextInt();

            System.out.println("Digite o valor de avaliações 'PÉSSIMAS': ");
            int pessima = sc.nextInt();

            otimasBoas[i] = otima + boa;
            pessimasRuins[i] = pessima+ruim;
            totalMensal[i] = otima+boa+neutra+ruim+pessima;
            System.out.println("|==========================|");
            System.out.println("|Total do mês de " +nomeMeses[i]+ ": " +totalMensal[i]);
            System.out.println("|==========================|\n");


        }
        int totalAnual = 0;
        int totalOtimasBoas = 0;
        int totalPessimasRuins = 0;

        for(int i = 0; i < nomeMeses.length; i++){

            totalAnual += totalMensal[i];
            totalOtimasBoas += otimasBoas[i];
            totalPessimasRuins += pessimasRuins[i];
        }
        double mediaAnual = (double) totalAnual / nomeMeses.length;
        double mediaOtimasBoas = (double) totalOtimasBoas / nomeMeses.length;
        double mediaPessimasRuins = (double) totalPessimasRuins / nomeMeses.length;

        int mesAtual = nomeMeses.length - 1;
        int mesAnterior = mesAtual - 1;

        System.out.println("\n === RESULTADOS===\n");

        System.out.println("|---INDICADORES ANUAIS---|\n");
        double variacaoTotalAnual = ((totalMensal[mesAtual] - mediaAnual) / mediaAnual) * 100;
        System.out.println(String.format("A variação anual total foi de: %.2f%%", variacaoTotalAnual));

        double variacaoAnualOtimasBoas = ((otimasBoas[mesAtual] - mediaOtimasBoas)/mediaOtimasBoas)*100;
        System.out.println(String.format("A variação anual de avaliações ótimas e boas foi de: %.2f%%",variacaoAnualOtimasBoas));

        double variacaoAnualOPessimasRuins = ((pessimasRuins[mesAtual] - mediaPessimasRuins)/mediaPessimasRuins)*100;
        System.out.println(String.format("A variação anual de avaliações péssimas e ruins foi de: %.2f%%", variacaoAnualOPessimasRuins));

        System.out.println("|---INDICADORES MENSAIS---|\n");
        double variacaoMensalTotal = ((double) ( totalMensal[mesAtual] - totalMensal[mesAnterior]) / totalMensal[mesAnterior]) * 100;
        System.out.println(String.format("A variação mensal no total de avalicações foi de: %.2f%%",variacaoMensalTotal));

        double variacaoMensalOtimasBoas = ((double) ( otimasBoas[mesAtual] - otimasBoas[mesAnterior]) / otimasBoas[mesAnterior]) * 100;
        System.out.println(String.format("A variação mensal de avaliações ótimas e boas foi de: %.2f%%",variacaoMensalOtimasBoas));

        double variacaoMensalPessimasRuins = ((double) ( pessimasRuins[mesAtual] - pessimasRuins[mesAnterior]) / pessimasRuins[mesAnterior]) * 100;
        System.out.println(String.format("A variação mensal de avaliações péssimas e ruins foi de: %.2f%%",variacaoMensalOtimasBoas));
    }
}

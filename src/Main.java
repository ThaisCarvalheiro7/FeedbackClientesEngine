

import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] nomeMeses = {
                "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto"
        };
        String [] equipes = {
                "Suporte Gerencial", "Suporte Integração", "Suporte Plataforma", "Suporte SAP"
        };
        int[] totalMensal = new int [8];
        int[] otimasBoas = new int [8];
        int[] pessimasRuins = new int[8];


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
            System.out.println("|================================================================================|");
            System.out.println("|A quantidade total de avaliações no mês: "+nomeMeses[i]+"foi: "+totalMensal[i]+"|");
            System.out.println("|================================================================================|");

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

        System.out.println("INDICADORES ANUAIS\n");
        double variacaoTotalAnual = ((totalMensal[mesAtual] - mediaAnual) / mediaAnual) * 100;
        System.out.println("A variação anual foi de: "+variacaoTotalAnual+"%\n");

        double variacaoAnualOtimasBoas = ((otimasBoas[mesAtual] - mediaOtimasBoas)/mediaOtimasBoas)*100;
        System.out.println("A variação anual de avaliações ótimas e boas foi de: "+variacaoAnualOtimasBoas+"%\n");

        double variacaoAnualOPessimasRuins = ((pessimasRuins[mesAtual] - mediaPessimasRuins)/mediaPessimasRuins)*100;
        System.out.println("A variação anual de avaliações péssimas e ruins foi de: "+ variacaoAnualOPessimasRuins +"%\n");

        System.out.println("INDICADORES MENSAIS\n");
        double variacaoMensalTotal = ((double) ( totalMensal[mesAtual] - totalMensal[mesAnterior]) / totalMensal[mesAnterior]) * 100;
        System.out.println("A variação mensal no total de avalicações foi de: "+variacaoMensalTotal+"%\n");

        double variacaoMensalOtimasBoas = ((double) ( otimasBoas[mesAtual] - otimasBoas[mesAnterior]) / otimasBoas[mesAnterior]) * 100;
        System.out.println("A variação mensal de avaliações ótimas e boas foi de: "+variacaoMensalOtimasBoas+"%\n");

        double variacaoMensalPessimasRuins = ((double) ( pessimasRuins[mesAtual] - pessimasRuins[mesAnterior]) / pessimasRuins[mesAnterior]) * 100;
        System.out.println("A variação mensal de avaliações péssimas e ruins foi de: "+variacaoMensalOtimasBoas+"%\n");

    }

    }






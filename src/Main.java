

import java.text.DecimalFormat;
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
        System.out.println(String.format("A variação anual de avaliações ótimas e boas foi de: %.2f%%"+variacaoAnualOtimasBoas+"\n"));

        double variacaoAnualOPessimasRuins = ((pessimasRuins[mesAtual] - mediaPessimasRuins)/mediaPessimasRuins)*100;
        System.out.println(String.format("A variação anual de avaliações péssimas e ruins foi de: %.2f%%"+ variacaoAnualOPessimasRuins +"%\n"));

        System.out.println("|---INDICADORES MENSAIS---|\n");
        double variacaoMensalTotal = ((double) ( totalMensal[mesAtual] - totalMensal[mesAnterior]) / totalMensal[mesAnterior]) * 100;
        System.out.println("A variação mensal no total de avalicações foi de: "+variacaoMensalTotal+"%\n");

        double variacaoMensalOtimasBoas = ((double) ( otimasBoas[mesAtual] - otimasBoas[mesAnterior]) / otimasBoas[mesAnterior]) * 100;
        System.out.println("A variação mensal de avaliações ótimas e boas foi de: "+variacaoMensalOtimasBoas+"%\n");

        double variacaoMensalPessimasRuins = ((double) ( pessimasRuins[mesAtual] - pessimasRuins[mesAnterior]) / pessimasRuins[mesAnterior]) * 100;
        System.out.println("A variação mensal de avaliações péssimas e ruins foi de: "+variacaoMensalOtimasBoas+"%\n");


        Scanner sc2 = new Scanner(System.in);
        int [] chamadosResolvidos = new int [1];
        int [] chamadosCertificados = new int[1];
        String[] nomes = new String[100];
        double percentual [] = new double[1];
        int resolvidosIndividual = 0;
        int certificadosIndividual = 0;
        String analista;

        for (int i = 0; i < chamadosCertificados.length; i++){
            System.out.println("====CALCULOS PERCENTUAIS INDIVIDUAIS===\n");
            System.out.println("ANALISTA: ");
            System.out.println(" ");
            analista = sc2.next();
            System.out.println("TOTAL RESOLVIDOS: ");
            System.out.println(" ");
            resolvidosIndividual = sc2.nextInt();
            System.out.println("TOTAL CERTIFICADOS: ");
            System.out.println(" ");
            certificadosIndividual = sc2.nextInt();
            System.out.println(" ");


            chamadosResolvidos[i] = resolvidosIndividual;
            chamadosCertificados[i] = certificadosIndividual;

            percentual [i] = (double) certificadosIndividual / resolvidosIndividual;
            System.out.println("A porcentagem é: "+percentual[i]);

        }
        String [] equipe = {"Suporte - Gerencial", "Suporte - Integração" , "Suporte - Plataforma" , "Suporte - SAP"};
        int [] resolvidosEquipe = new int[4];
        int [] certificadosEquipe = new int [4];
        double [] percentualEquipe =  new double[4];
        int resolvidosEquipeVar = 0;
        int certificadosEquipeVar = 0;

         for (int i = 0; i < equipe.length ; i++) {
             System.out.println("====CALCULOS PERCENTUAIS EQUIPE===\n");

             System.out.println("EQUIPE: "+equipe[i]);
             System.out.println("TOTAL RESOLVIDOS: ");
             System.out.println(" ");
             resolvidosEquipeVar = sc2.nextInt();
             System.out.println("TOTAL CERTIFICADOS: ");
             System.out.println(" ");
             certificadosEquipeVar = sc2.nextInt();

             resolvidosEquipe[i] = resolvidosEquipeVar;
             certificadosEquipe[i] = certificadosEquipeVar;

             percentualEquipe [i] = (double) certificadosEquipeVar / resolvidosEquipeVar;
             System.out.println("A porcentagem é: "+percentualEquipe[i]);



        }

    }

    }






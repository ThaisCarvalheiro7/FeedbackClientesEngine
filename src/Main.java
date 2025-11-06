

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SuporteGerencial gerencial = new SuporteGerencial();
        System.out.println("--- SUPORTE GERENCIAL ---");
        gerencial.entradaDados();
        gerencial.mediaTotalAnual();
        gerencial.mediaAnualAvaliacoesBoas();
        gerencial.mediaAnualPessimas();

        gerencial.percentualTotalAnual();
        gerencial.percentualAnualAvaliacoesBoas();
        gerencial.percentualAnualPessimas();

        gerencial.percentualMensalTotal();
        gerencial.percentualMensalAvaliacoesBoas();
        gerencial.percentualMensalAvaliacoesRuins();

        gerencial.relatorioIndicesAnuais();
        gerencial.relatorioIndicesMensais();


    }
}







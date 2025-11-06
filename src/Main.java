

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SuporteGerencial gerencial = new SuporteGerencial();
        SuporteIntegracao integracao = new SuporteIntegracao();
        SuportePlataforma plataforma = new SuportePlataforma();
        SuporteSAP sap = new SuporteSAP();

    }
    public void executaGerencial(){
        SuporteGerencial gerencial = new SuporteGerencial();
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
    public void executaIntegracao(){
        SuporteIntegracao integracao = new SuporteIntegracao();
        integracao.entradaDados();
        integracao.mediaTotalAnual();
        integracao.mediaAnualAvaliacoesBoas();
        integracao.mediaAnualPessimas();

        integracao.percentualTotalAnual();
        integracao.percentualAnualAvaliacoesBoas();
        integracao.percentualAnualPessimas();

        integracao.percentualMensalTotal();
        integracao.percentualMensalAvaliacoesBoas();
        integracao.percentualMensalAvaliacoesRuins();

        integracao.relatorioIndicesAnuais();
        integracao.relatorioIndicesMensais();
    }
    public void executaPlataforma(){
        SuportePlataforma plataforma= new SuportePlataforma();
        plataforma.entradaDados();
        plataforma.mediaTotalAnual();
        plataforma.mediaAnualAvaliacoesBoas();
        plataforma.mediaAnualPessimas();
    }

}







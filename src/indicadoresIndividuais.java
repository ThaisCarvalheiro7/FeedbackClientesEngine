import java.util.Scanner;

public class indicadoresIndividuais {
    public void indicadoresAnalista(){
        Scanner sc2 = new Scanner(System.in);
        int [] chamadosResolvidos = new int [39];
        int [] chamadosCertificados = new int[39];
        String[] nomes = new String[39];
        double percentual [] = new double[39];
        int resolvidosIndividual = 0;
        int certificadosIndividual = 0;
        String analista;

        for (int i = 0; i < chamadosCertificados.length; i++){
            System.out.println("====CALCULOS PERCENTUAIS INDIVIDUAIS===\n");
            System.out.println("ANALISTA: ");
            analista = sc2.next();
            System.out.println(" ");
            System.out.println("TOTAL RESOLVIDOS: ");
            resolvidosIndividual = sc2.nextInt();
            System.out.println(" ");
            System.out.println("TOTAL CERTIFICADOS: ");
            certificadosIndividual = sc2.nextInt();
            System.out.println(" ");


            chamadosResolvidos[i] = resolvidosIndividual;
            chamadosCertificados[i] = certificadosIndividual;

            double percentual1 = (double) certificadosIndividual / resolvidosIndividual;
            double percentualCalc = percentual1 * 100;
            percentual[i] = percentualCalc;
            double percentualConvert = percentual[i];
            System.out.println(String.format("A porcentagem é: %.2f%%",percentualConvert));

        }
    }
}

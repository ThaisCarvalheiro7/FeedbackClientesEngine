import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Scanner;

public class percentualCertificadosEquipe {
    public void percentualEquipeCertificados(){
        Scanner sc2 = new Scanner(System.in);

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
            resolvidosEquipeVar = sc2.nextInt();

            System.out.println(" ");
            System.out.println("TOTAL CERTIFICADOS: ");
            certificadosEquipeVar = sc2.nextInt();
            System.out.println(" ");
            resolvidosEquipe[i] = resolvidosEquipeVar;
            certificadosEquipe[i] = certificadosEquipeVar;

            double percentualEquipe1 = (double) certificadosEquipeVar / resolvidosEquipeVar;
            double percentualCalc = percentualEquipe1 * 100;
            percentualEquipe[i] = percentualCalc;
            double percentualEquipeConvert = percentualEquipe[i];
            System.out.println(String.format("A porcentagem é: %.2f%%",percentualEquipeConvert));

        }
    }

}

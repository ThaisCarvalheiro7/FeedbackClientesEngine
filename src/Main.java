

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ótimo = 0;
        int bom= 0;
        int neutro = 0;
        int ruim = 0;
        int pessimo = 0;
        int somaJaneiro = 0;
        int somaFevereiro = 0;
        int somaMarço = 0;
        int somaAbril = 0;
        int somaMaio = 0;
        int somaJunho = 0;
        int somaJulho = 0;
        int somaAgosto = 0;
        int contador = 0;
        int nextSesion;
        int somaExcelentJaneiro =0;
        int somaExcelenteFevereiro = 0;
        int somaExcelenteMarco = 0;
        int somaExcelenteAbril = 0;
        int somaExcelenteMaio = 0;
        int somaExclenteJunho = 0;
        int somaExcelenteJulho = 0;
        int somaRuimPessimoJaneiro = 0;
        int somaRuimPessimoFevereiro = 0;
        int somaRuimPessimoMarco = 0;
        int somaRuimPessimoAbril = 0;
        int somaRuimPessimoMaio = 0;
        int somaRuimPessimoJunho = 0;
        int somaRuimPessimoJulho = 0;
        int somaRuimPessimoAgosto = 0;
        int somaExcelenteAgosto = 0;

        boolean b = false;

        do {
            contador++;
            System.out.println("=== Enter the month ====");
            System.out.println("=== 1 - Pesquisa por equipe (Índice por equipe) ====");
            System.out.println("=== 2 - Pesquisa por equipe (Índice individual) ====");
            System.out.println("=== 3 - Chamados abertos/resolvidos (Equipe ou individual) ====");




            System.out.println("Digite o que deseja calcular ");

            int month = sc.nextInt();
            switch (month) {
                case 1:
                    System.out.println("===JANUARY===");
                    System.out.println("Type number of excellent reviews: ");
                    int otimoJaneiro = sc.nextInt();
                    System.out.println("Type number of goods reviews: ");
                    int bomJaneiro = sc.nextInt();
                    System.out.println("Type number of neutrals reviews: ");
                    int neutroJaneiro = sc.nextInt();
                    System.out.println("Type number of bads reviews: ");
                    int ruimJaneiro = sc.nextInt();
                    System.out.println("Type number of terrible reviews: ");
                    int pessimoJaneiro = sc.nextInt();
                    sc.nextLine();

                    somaExcelentJaneiro = otimoJaneiro+ bomJaneiro;
                    somaRuimPessimoJaneiro = ruimJaneiro + pessimoJaneiro;
                    somaJaneiro = otimoJaneiro + bomJaneiro + neutroJaneiro + ruim + pessimo;
                    System.out.println("The total of number surveys answered this month was: " + somaJaneiro);
                    System.out.println("If you want to next session for calculate yours indicators type 1 ");
//================================================================================================================================//
                    System.out.println("===FEBRUARY===");
                    System.out.println("Type number of excellent reviews: ");
                    int otimoFevereiro = sc.nextInt();
                    System.out.println("Type number of goods reviews: ");
                    int bomFevereiro = sc.nextInt();
                    System.out.println("Type number of neutrals reviews: ");
                    int neutroFevereiro = sc.nextInt();
                    System.out.println("Type number of bads reviews: ");
                    int ruimFevereiro = sc.nextInt();
                    System.out.println("Type number of terrible reviews: ");
                    int pessimoFevereiro = sc.nextInt();
                    sc.nextLine();

                    somaRuimPessimoFevereiro = ruimFevereiro + pessimoFevereiro;
                    somaExcelenteFevereiro = otimoFevereiro+ bomFevereiro;
                    somaFevereiro = otimoFevereiro + bomFevereiro + neutroFevereiro + ruimFevereiro + pessimoFevereiro;
                    System.out.println("The total of number surveys answered this month was: " + somaFevereiro);
//================================================================================================================================//

                    System.out.println("===MARCH===");
                    System.out.println("Type number of excellent reviews: ");
                    int otimoMarco = sc.nextInt();
                    System.out.println("Type number of goods reviews: ");
                    int bomMarco = sc.nextInt();
                    System.out.println("Type number of neutrals reviews: ");
                    int neutroMarco = sc.nextInt();
                    System.out.println("Type number of bads reviews: ");
                    int ruimMarco = sc.nextInt();
                    System.out.println("Type number of terrible reviews: ");
                    int pessimoMarco = sc.nextInt();

                    somaRuimPessimoMarco = ruimMarco +pessimoMarco;
                    somaExcelenteMarco = otimoMarco + bomMarco;
                    somaMarço = otimoMarco + bomMarco + neutroMarco + ruimMarco + pessimoMarco;
                    System.out.println("The total of number surveys answered this month was: " + somaMarço);
                    //================================================================================================================================//
                    System.out.println("===APRIL===");
                    System.out.println("Type number of excellent reviews: ");
                    int otimoAbril = sc.nextInt();
                    System.out.println("Type number of goods reviews: ");
                    int bomAbril = sc.nextInt();
                    System.out.println("Type number of neutrals reviews: ");
                    int neutroAbril = sc.nextInt();
                    System.out.println("Type number of bads reviews: ");
                    int ruimAbril= sc.nextInt();
                    System.out.println("Type number of terrible reviews: ");
                    int pessimoAbril = sc.nextInt();

                    somaRuimPessimoAbril = ruimAbril+ pessimoAbril;
                    somaExcelenteAbril = otimoAbril + bomAbril;
                    somaAbril = otimoAbril + bomAbril + neutroAbril + ruimAbril + pessimoAbril;
                    System.out.println("The total of number surveys answered this month was: " + somaAbril);
                    //===============================================================================================//
                    System.out.println("===MAY===");
                    System.out.println("Type number of excellent reviews: ");
                    int otimoMaio = sc.nextInt();
                    System.out.println("Type number of goods reviews: ");
                    int bomMaio = sc.nextInt();
                    System.out.println("Type number of neutrals reviews: ");
                    int neutroMaio = sc.nextInt();
                    System.out.println("Type number of bads reviews: ");
                    int ruimMaio = sc.nextInt();
                    System.out.println("Type number of terrible reviews: ");
                    int pessimoMaio = sc.nextInt();

                    somaRuimPessimoMaio = ruimMaio + pessimoMaio;
                    somaExcelenteMaio = otimoMaio+bomMaio;
                    somaMaio = otimoMaio + bomMaio + neutroMaio + ruimMaio + pessimoMaio;
                    System.out.println("The total of number surveys answered this month was: " + somaMaio);
                    //===============================================================================================//
                    System.out.println("===JUNE===");
                    System.out.println("Type number of excellent reviews: ");
                    int otimoJunho = sc.nextInt();
                    System.out.println("Type number of goods reviews: ");
                    int bomJunho = sc.nextInt();
                    System.out.println("Type number of neutrals reviews: ");
                    int neutroJunho = sc.nextInt();
                    System.out.println("Type number of bads reviews: ");
                    int ruimJunho = sc.nextInt();
                    System.out.println("Type number of terrible reviews: ");
                    int pessimoJunho = sc.nextInt();

                    somaRuimPessimoJunho = ruimJunho+ pessimoJunho;
                    somaExclenteJunho = otimoJunho + bomJunho;
                    somaJunho = otimoJunho + bomJunho + neutroJunho + ruimJunho + pessimoJunho;
                    System.out.println("The total of number surveys answered this month was: " + somaJunho);
                    //===============================================================================================//
                    System.out.println("===JULY===");
                    System.out.println("Type number of excellent reviews: ");
                    int otimoJulho = sc.nextInt();
                    System.out.println("Type number of goods reviews: ");
                    int bomJulho = sc.nextInt();
                    System.out.println("Type number of neutrals reviews: ");
                    int neutroJulho = sc.nextInt();
                    System.out.println("Type number of bads reviews: ");
                    int ruimJulho = sc.nextInt();
                    System.out.println("Type number of terrible reviews: ");
                    int pessimoJulho = sc.nextInt();

                    somaRuimPessimoJulho = ruimJulho + pessimoJulho;
                    somaExcelenteJulho = otimoJulho + bomJulho;
                    somaJulho = otimoJulho + bomJulho + neutroJulho + ruimJulho + pessimoJulho;
                    System.out.println("The total of number surveys answered in this month was: " + somaJulho);
                    //===============================================================================================//
                    System.out.println("===AUGUST===");
                    System.out.println("Type number of excellent reviews: ");
                    int otimoAgosto = sc.nextInt();
                    System.out.println("Type number of goods reviews: ");
                    int bomAgosto = sc.nextInt();
                    System.out.println("Type number of neutrals reviews: ");
                    int neutrolAgosto = sc.nextInt();
                    System.out.println("Type number of bads reviews: ");
                    int ruimAgosto = sc.nextInt();
                    System.out.println("Type number of terrible reviews: ");
                    int pessimoAgosto = sc.nextInt();

                    somaRuimPessimoAgosto = ruimAgosto + pessimoAgosto;
                    somaExcelenteAgosto = otimoAgosto + bomAgosto;
                    somaAgosto = otimoAgosto + bomAgosto + neutrolAgosto + ruimAgosto + pessimoAgosto;
                    System.out.println("The total of number surveys answered in this month was: " + somaAgosto);

                    System.out.println("PESQUISA DE SATISFAÇÃO POR EQUIPE");
                    System.out.println(" ");
                    int totalAnualPesquisa = somaJaneiro+somaFevereiro+somaMarço+somaAbril+somaMaio+somaJunho+somaJulho+somaAgosto;
                    double mediaAnualPesquisa = (double) totalAnualPesquisa / 8;
                    double subMediaAnual = somaAgosto - mediaAnualPesquisa;
                    double percentualTotalAnual = (subMediaAnual/mediaAnualPesquisa) * 100;
                    System.out.println("|==============================================================|");
                    System.out.println("|A variação total anual foi de: "+percentualTotalAnual+"%");
                    System.out.println("|==============================================================|");
                    System.out.println(" ");
                    //============================================================================================================================//
                    int totalOtimasBoasAnual = somaExcelentJaneiro+somaExcelenteFevereiro+ somaExcelenteMarco +somaExcelenteAbril+somaExcelenteMaio+somaExclenteJunho+somaExcelenteJulho+somaExcelenteAgosto;
                    double mediaOtimasBoasAnual = (double) totalOtimasBoasAnual/8;
                    double subOtimasBoasAnual = somaExcelenteAgosto - mediaOtimasBoasAnual;
                    double percentualOtimasBoasAnual = (subOtimasBoasAnual/mediaOtimasBoasAnual) * 100;
                    System.out.println("|==========================================================================|");
                    System.out.println("|A variação de avaliações boas e ótimas foi: "+percentualOtimasBoasAnual+"%");
                    System.out.println("|==========================================================================|");
                    System.out.println(" ");
                    //===========================================================================================================================//
                    double totalRuinsAnual = somaRuimPessimoJaneiro + somaRuimPessimoFevereiro + somaRuimPessimoMarco + somaRuimPessimoAbril + somaRuimPessimoMaio + somaRuimPessimoJunho + somaRuimPessimoJulho + somaRuimPessimoAgosto;
                    double mediaRuinsAnual = (double) totalRuinsAnual/8;
                    double subRuinsAnual = somaRuimPessimoAgosto - mediaRuinsAnual;
                    double percentualRuinsAnual = (subRuinsAnual/mediaRuinsAnual) * 100;
                    System.out.println("|===========================================================================|");
                    System.out.println("|A variação de avaliações ruins e pessimas foi: "+percentualRuinsAnual+"%");
                    System.out.println("|===========================================================================|");
                    System.out.println(" ");
                    //================================================================================================================================//
                    double totalMensal = somaAgosto - somaJulho;
                    double percentualMensal = (double) (totalMensal/somaJulho) * 100;
                    System.out.println("|============================================================================|");
                    System.out.println("|A variação mensal total foi: "+percentualMensal+"%");
                    System.out.println("|============================================================================|");
                    System.out.println(" ");
                    //================================================================================================================//
                    double totalOtimasBoasMensal = somaExcelenteAgosto - somaExcelenteJulho;
                    double percentualOtimasBoasMensal = (double) (totalOtimasBoasMensal/somaExcelenteJulho) * 100;
                    System.out.println("|=================================================================================|");
                    System.out.println("|A variação de avaliações mensal boas e otimas foi:"+percentualOtimasBoasMensal+"%");
                    System.out.println("|=================================================================================|");
                    System.out.println(" ");
                    //====================================================================================================================//
                    double totalPessomasRuinsMensal = somaRuimPessimoAgosto - somaRuimPessimoJulho;
                    double percentualRuinsPessimosBoasMensal = (double) (totalPessomasRuinsMensal /somaRuimPessimoJulho) * 100;
                    System.out.println("|=================================================================================|");
                    System.out.println("|A variação de avaliações mensal boas e otimas foi:"+ percentualRuinsPessimosBoasMensal +"%");
                    System.out.println("|=================================================================================|");
                    System.out.println(" ");
                    continue;

                case 2:
                    System.out.println("Digite os resolvidos: ");
                    int resolvidos = sc.nextInt();
                    System.out.println("Digite os certificados: ");
                    int certificados = sc.nextInt();

                    double percentualIndividual = (double) certificados / resolvidos;
                    System.out.println("|=========================================|");
                    System.out.println("|O percentual é: "+percentualIndividual+"%|");
                    System.out.println("|========================================-|");

                    break;
                case 3:
                    System.out.println("Digite a quantidade de chamados abertos :");
                    int chamadosAbertos = sc.nextInt();
                    System.out.println("Digite a quantidade de chamados resolvidos: ");
                    int chamadosResolvidos = sc.nextInt();
                    double percentualResolvidos = (double) chamadosResolvidos / chamadosAbertos;
                    System.out.println("|=================================================================|");
                    System.out.println("|O percentual de chamados resolvidos foi:"+percentualResolvidos+"%|");
                    System.out.println("|=================================================================|");

                default:
                        if (month == 0){
                            b = true;
                            System.out.println("Program closed!");
                        }else {
                            System.out.println("Invalid option! Try again");
                            break;
                        }
            }
        } while (!b);
    }

}




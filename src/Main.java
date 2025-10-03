

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int escolha = 0;
        indicadoresIndividuais indicesIndividuais = new indicadoresIndividuais();
        indicesPesquisaTotal indicesTotais = new indicesPesquisaTotal();
        percentualCertificadosEquipe percentualEquipe = new percentualCertificadosEquipe();

        System.out.println("===CALCULADORA DE INDICADORES====\n");
        System.out.println("|--------------------|");
        System.out.println("|       MENU         |");
        System.out.println("|--------------------|\n");
        System.out.println("1 - Pesquisa de satisfação equipe\n");
        System.out.println("2 - Pesquisa de satisfação individual\n");
        System.out.println("3 - Relação chamados resolvidos e certificados (Equipe)\n");


do {
    System.out.println("Digite o indicador que deseja calcular: ");
    if(sc.hasNextInt()){
        escolha = sc.nextInt();
    } else {
        System.out.println("Digite apenas números!");
        sc.next();
    }
    if (escolha < 0 || escolha > 4){
        System.out.println("Escolha inválida!");
    }
    switch (escolha) {
        case 1:
            indicesTotais.indicadoresEquipe();

        case 2:
            indicesIndividuais.indicadoresAnalista();
        case 3:
            percentualEquipe.percentualEquipeCertificados();
    }
}while (true);



    }
}







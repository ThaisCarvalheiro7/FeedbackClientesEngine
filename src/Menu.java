
//bug menu switch que nao esta reconhecendo o F
// implementar verificações de erros
import java.util.Scanner;

public class Menu {
    SuporteGerencial gerencial = new SuporteGerencial();
    SuporteIntegracao integracao = new SuporteIntegracao();
    SuportePlataforma plataforma = new SuportePlataforma();
    SuporteSAP sap = new SuporteSAP();

    public void menu() {
        System.out.println("G - Gerencial");
        System.out.println("I - Integração");
        System.out.println("P - Plataforma");
        System.out.println("S - SAP");
        selecionarOpcao();
    }

    public void selecionarOpcao() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a equipe que deseja calcular os indices: ");
        System.out.println("(Para sair digite 'F')");
        String escolha = sc.nextLine();
        boolean b = true;

        switch (escolha) {
            case "G":
                gerencial.executarGerencial();
                retorno();
            case "I":
                integracao.executarIntegracao();
                retorno();
            case "P":
                plataforma.executarPlataforma();
                retorno();
            case "S":
                sap.executarSAP();
                retorno();
            case "F":
                System.out.println("Encerrando....");
            default:
                System.out.println("Opção inválida! Tente novamente");
                selecionarOpcao();
        }
    }
    public void retorno(){
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Deseja voltar ao menu principal ou encerrar o programa? ");
        System.out.println("1 - Menu principal");
        System.out.println("2 - Encerrar programa");
        int escolha = sc.nextInt();
        if (escolha == 1){
            menu();
        }else {
            System.out.println("Encerrando...");
        }

    }
}


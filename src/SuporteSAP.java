import java.util.Scanner;

public class SuporteSAP {
    Scanner sc = new Scanner(System.in);

    private double[] qntdTotalRepostas = new double[]{103, 98, 105, 118, 152, 100, 133, 136, 187};

    private int[] otimasBoasTotal = new int[]{90, 87, 99, 110, 149, 97, 127, 127, 180};
    private int[] pessimasRuinsTotal = new int[]{2, 0, 2, 1, 1, 1, 0, 5, 3};
    private int totalMes;

    private double mediaTotalAnual;
    private double mediaAnualPessimasRuins;
    private double variacaoAnualTotal;
    private double variacaoAnualPessimasRuins;
    private double variacaoAnualBoas;

    private double variacaoMensalTotal;
    private double variacaoMensalOtimasBoas;
    private double variacaoMensalPessimasRuins;
    private double mediaBoasMensal;

    private int otimasBoasAtual;
    private int pessimasRuinsAtual;

    {
        System.out.println("--- SUPORTE SAP ---");
    }
    public void entradaDados() {
        System.out.println("Digite a quantidade de avaliações ótimas esse mês: ");
        int otima = sc.nextInt();
        System.out.println("Digite a quantidade de avaliações boas esse mês: ");
        int boas = sc.nextInt();
        System.out.println("Digite a quantidade de avaliações neutras esse mês: ");
        int neutras = sc.nextInt();
        System.out.println("Digite a quantidade de avaliações ruins esse mês: ");
        int ruins = sc.nextInt();
        System.out.println("Digite a quantidade de avaliações péssimas esse mês:");
        int pessimas = sc.nextInt();

        totalMes = otima + boas + neutras + ruins + pessimas;
        otimasBoasAtual = otima + boas;
        pessimasRuinsAtual = ruins + pessimas;
    }

    public void mediaTotalAnual() {
        double soma = 0;
        for (int i = 0; i < qntdTotalRepostas.length; i++) {
            soma += qntdTotalRepostas[i];
        }
        mediaTotalAnual = soma / qntdTotalRepostas.length;

    }

    public void percentualTotalAnual() {

        variacaoAnualTotal = ((totalMes - mediaTotalAnual) / mediaTotalAnual);
    }

    public double percentualMensalTotal() {
        double setembro = qntdTotalRepostas[8];
        double outubro = totalMes;

        return variacaoMensalTotal = ((outubro - setembro) / setembro);
    }

    public void mediaAnualAvaliacoesBoas() {
        double soma = 0;
        for (int i = 0; i < otimasBoasTotal.length; i++) {
            soma += otimasBoasTotal[i];
        }
        mediaBoasMensal = soma / otimasBoasTotal.length;
    }

    public double percentualAnualAvaliacoesBoas() {
        return variacaoAnualBoas = ((otimasBoasAtual - mediaBoasMensal) / mediaBoasMensal) * 100;
    }

    public double percentualMensalAvaliacoesBoas() {
        double setembro = otimasBoasTotal[8];
        double outubro = otimasBoasAtual;
        variacaoMensalOtimasBoas = ((outubro - setembro) / setembro) * 100;
        return variacaoMensalOtimasBoas;
    }

    public double mediaAnualPessimas() {
        double soma = 0;
        for (int i = 0; i < pessimasRuinsTotal.length; i++) {
            soma += pessimasRuinsTotal[i];
        }
        mediaAnualPessimasRuins = soma / pessimasRuinsTotal.length;
        return mediaAnualPessimasRuins;
    }

    public double percentualAnualPessimas() {
        return variacaoAnualPessimasRuins = ((pessimasRuinsAtual - mediaAnualPessimasRuins) / mediaAnualPessimasRuins) * 100;
    }

    public double percentualMensalAvaliacoesRuins() {
        double setembro = pessimasRuinsTotal[8];
        double outubro = pessimasRuinsAtual;
        variacaoMensalPessimasRuins = ((outubro - setembro) / setembro) * 100;
        return variacaoMensalPessimasRuins;
    }


    public void relatorioIndicesAnuais() {
        System.out.println("========= INDICES ANUAIS ===========================");
        System.out.println("A variação anual no total de respostas foi: " + variacaoAnualTotal);
        System.out.println("A variação anual no total de respostas boas ou ótimas foi:  " + variacaoAnualBoas);
        System.out.println("A variação anual no total de respostas péssimas ou ruins foi: " + variacaoAnualPessimasRuins + "\n");
    }

    public void relatorioIndicesMensais() {
        System.out.println("======================= INDICES MENSAIS ====================================================");
        System.out.println("A variação mensal no total de respostas foi: " + variacaoMensalTotal);
        System.out.println("A variação mensal no total de respostas boas ou ótimas foi: " + variacaoMensalOtimasBoas);
        System.out.println("A variação mensal no total de respostas péssimas ou ruins foi: " + variacaoMensalPessimasRuins);
    }

    public double getVariacaoAnualTotal() {
        return variacaoAnualTotal;
    }

    public void setVariacaoAnualTotal(double variacaoAnualTotal) {
        this.variacaoAnualTotal = variacaoAnualTotal;
    }

    public double getMediaBoasMensal() {
        return mediaBoasMensal;
    }

    public void setMediaBoasMensal(double mediaBoasMensal) {
        this.mediaBoasMensal = mediaBoasMensal;
    }

    public double getVariacaoAnualBoas() {
        return variacaoAnualBoas;
    }

    public void setVariacaoAnualBoas(double variacaoAnualBoas) {
        this.variacaoAnualBoas = variacaoAnualBoas;
    }

    public double[] getQntdTotalRepostas() {
        return qntdTotalRepostas;
    }

    public void setQntdTotalRepostas(double[] qntdTotalRepostas) {
        this.qntdTotalRepostas = qntdTotalRepostas;
    }

    public int getOtimasBoasAtual() {
        return otimasBoasAtual;
    }

    public void setOtimasBoasAtual(int otimasBoasAtual) {
        this.otimasBoasAtual = otimasBoasAtual;
    }

    public int getTotalMes() {
        return totalMes;
    }

    public void setTotalMes(int totalMes) {
        this.totalMes = totalMes;
    }

    public int getPessimasRuinsAtual() {
        return pessimasRuinsAtual;
    }

    public void setPessimasRuinsAtual(int pessimasRuinsAtual) {
        this.pessimasRuinsAtual = pessimasRuinsAtual;
    }


    public int[] getOtimasBoasTotal() {
        return otimasBoasTotal;
    }

    public void setOtimasBoasTotal(int[] otimasBoasTotal) {
        this.otimasBoasTotal = otimasBoasTotal;
    }

    public int[] getPessimasRuins() {
        return pessimasRuinsTotal;
    }

    public void setPessimasRuins(int[] pessimasRuins) {
        this.pessimasRuinsTotal = pessimasRuins;
    }

    public double getMediaTotalAnual() {
        return mediaTotalAnual;
    }

    public void setMediaTotalAnual(double mediaTotalAnual) {
        this.mediaTotalAnual = mediaTotalAnual;
    }

    public double getMediaAnualPessimasRuins() {
        return mediaAnualPessimasRuins;
    }

    public void setMediaAnualPessimasRuins(double mediaAnualPessimasRuins) {
        this.mediaAnualPessimasRuins = mediaAnualPessimasRuins;
    }

    public double getVariacaoMensalTotal() {
        return variacaoMensalTotal;
    }

    public void setVariacaoMensalTotal(double variacaoMensalTotal) {
        this.variacaoMensalTotal = variacaoMensalTotal;
    }

    public double getVariacaoMensalOtimasBoas() {
        return variacaoMensalOtimasBoas;
    }

    public void setVariacaoMensalOtimasBoas(double variacaoMensalOtimasBoas) {
        this.variacaoMensalOtimasBoas = variacaoMensalOtimasBoas;
    }

    public double getVariacaoMensalPessimasRuins() {
        return variacaoMensalPessimasRuins;
    }

    public void setVariacaoMensalPessimasRuins(double variacaoMensalPessimasRuins) {
        this.variacaoMensalPessimasRuins = variacaoMensalPessimasRuins;
    }

    public double getVariacaoAnualPessimasRuins() {
        return variacaoAnualPessimasRuins;
    }

    public void setVariacaoAnualPessimasRuins(double variacaoAnualPessimasRuins) {
        this.variacaoAnualPessimasRuins = variacaoAnualPessimasRuins;
    }
}


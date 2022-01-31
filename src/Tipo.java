public class Tipo extends Fruta{

    private int quantCaroco;
    private String tipoSeiva;
    String nome, sabor, cor, tamanho, colheita;

    public Tipo(String nome, String sabor, String cor, String tamanho, String colheita) {
        super(nome, sabor, cor, tamanho, colheita);


    }

    public Tipo(String nome, String sabor, String cor, String tamanho, String colheita,
                int quantCaroco, String tipoSeiva) {
        super(nome, sabor, cor, tamanho, colheita);
        this.nome = getNome();
        this.sabor = getSabor();
        this.cor = getCor();
        this.tamanho = getTamanho();
        this.colheita = getColheita();

        setTipoSeiva(tipoSeiva);
        setQuantCaroco(quantCaroco);
    }

    @Override
    public void imprimir(){
        super.imprimir(toString());
    }

    @Override
    public String toString() {
        return "Fruta{" +
                "nome='" + nome + '\'' +
                ", sabor='" + sabor + '\'' +
                ", cor='" + cor + '\'' +
                ", tamanho='" + tamanho + '\'' +
                ", colheita='" + colheita + '\'' +
                ", Seiva='" + getTipoSeiva() + '\'' +
                ", Quantidade de caroço='" + getQuantCaroco() + '\'' +

                '}';
    }

    public int getQuantCaroco() {
        return quantCaroco;
    }

    public void setQuantCaroco(int quantCaroco) {
        this.quantCaroco = quantCaroco;
    }

    public String getTipoSeiva() {
        return tipoSeiva;
    }

    public void setTipoSeiva(String tipoSeiva) {
        this.tipoSeiva = tipoSeiva;
    }


}

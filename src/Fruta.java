public class Fruta {

    public static void main(String[] args){
        Tipo tipo = new Tipo("Caju", "Acido", "vermelhor",
                    "pequena", "novembro",
                    0, "LEITE");

        Fruta fruta = new Fruta("Manga", "Doce", "Verde", "Média", "Primavera");
        fruta.imprimir();

        tipo.imprimir();
    }

    private String nome;
    private String sabor;
    private String cor;
    private String tamanho;
    private String colheita;


    public Fruta(String nome, String sabor, String cor, String tamanho, String colheita) {
        setNome(nome);
        setColheita(colheita);
        setCor(cor);
        setTamanho(tamanho);
        setSabor(sabor);

    }

    public void imprimir(String descricao){
        System.out.println(descricao);
    }

    public void imprimir(String nome, String sabor, String cor, String colheita, String tamanho){
        System.out.println(toString());
    }

    public void imprimir(){
        System.out.println(toString());
    }

    public String toString() {
        return "Fruta{" +
                "nome='" + nome + '\'' +
                ", sabor='" + sabor + '\'' +
                ", cor='" + cor + '\'' +
                ", tamanho='" + tamanho + '\'' +
                ", colheita='" + colheita + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getColheita() {
        return colheita;
    }

    public void setColheita(String colheita) {
        this.colheita = colheita;
    }
}

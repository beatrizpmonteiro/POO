import java.io.Serializable;

public class Frutaria extends Mercearia implements Serializable{
    private int numProdutos;
    private double fatAnualProduto;

    public Frutaria() {
    }
    public Frutaria(String categoria, String nome, String distrito, Coordenada localizacao, double custoAnualLimpeza, int numProdutos, double fatAnualProduto) {
        super(categoria, nome, distrito, localizacao, custoAnualLimpeza);
        this.numProdutos = numProdutos;
        this.fatAnualProduto = fatAnualProduto;
    }
    public Frutaria(int numProdutos, double fatAnualProduto){
        this.numProdutos = numProdutos;
        this.fatAnualProduto = fatAnualProduto;
    }

    public int getNumProdutos() {
        return numProdutos;
    }
    public void setNumProdutos(int numProdutos) {
        this.numProdutos = numProdutos;
    }

    public double getFatAnualProduto() {
        return fatAnualProduto;
    }
    public void setFatAnualProduto(double fatAnualProduto) {
        this.fatAnualProduto = fatAnualProduto;
    }

    public String getTipo(){return "Frutaria";}

    public double despesaAnual(){
        return getCustoAnualLimpeza();
    }
    public double receitaAnual(){
        return (getNumProdutos() * getFatAnualProduto());
    }
    public double getLucroAnual(){return receitaAnual() - despesaAnual();}

    public String imprimeFicheiroTxt(){
        return super.imprimeFicheiroTxt() + numProdutos + "/" + fatAnualProduto;
    }

    @Override
    public String toString() {
        return "Frutaria{" +
                "numProdutos=" + getNumProdutos() +
                ", fatAnualProduto=" + getFatAnualProduto() +
                '}';
    }
}

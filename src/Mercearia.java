import java.io.Serializable;

public abstract class Mercearia extends Empresa implements Serializable{
    protected double custoAnualLimpeza;
    public Mercearia() {
    }
    public Mercearia(String categoria, String nome, String distrito, Coordenada localizacao, double custoAnualLimpeza) {
        super(categoria, nome, distrito, localizacao);
        this.custoAnualLimpeza = custoAnualLimpeza;
    }
    public Mercearia(double custoAnualLimpeza){
        this.custoAnualLimpeza = custoAnualLimpeza;
    }

    public double getCustoAnualLimpeza() {
        return custoAnualLimpeza;
    }
    public void setCustoAnualLimpeza(double custoAnualLimpeza) {
        this.custoAnualLimpeza = custoAnualLimpeza;
    }

    public abstract String getTipo();

    public abstract double despesaAnual();
    public abstract double receitaAnual();
    public abstract double getLucroAnual();


    public int capacidadeMaxima(){return 0;}

    public String imprimeFicheiroTxt(){
        return super.imprimeFicheiroTxt() + custoAnualLimpeza + "/";
    }

    @Override
    public String toString() {
        return "Mercearia{" +
                "custoAnualLimpeza=" + getCustoAnualLimpeza() +
                '}';
    }
}

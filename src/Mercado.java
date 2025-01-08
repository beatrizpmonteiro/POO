import java.io.Serializable;

public class Mercado extends Mercearia implements Serializable{
    private String tipoDeMercado;
    private double areaCorredores;
    private double fatAnualArea;

    public Mercado() {
    }

    public Mercado(String categoria, String nome, String distrito, Coordenada localizacao, double custoAnualLimpeza, String tipoDeMercado, double areaCorredores, double fatAnualArea) {
        super(categoria, nome, distrito, localizacao, custoAnualLimpeza);
        this.tipoDeMercado = tipoDeMercado;
        this.areaCorredores = areaCorredores;
        this.fatAnualArea = fatAnualArea;
    }

    public Mercado(String tipoDeMercado, double areaCorredores, double fatAnualArea){
        this.tipoDeMercado = tipoDeMercado;
        this.areaCorredores = areaCorredores;
        this.fatAnualArea = fatAnualArea;
    }

    public String getTipoDeMercado() {
        return tipoDeMercado;
    }
    public void setTipoDeMercado(String tipoDeMercado) {
        this.tipoDeMercado = tipoDeMercado;
    }

    public double getAreaCorredores() {
        return areaCorredores;
    }
    public void setAreaCorredores(double areaCorredores) {
        this.areaCorredores = areaCorredores;
    }

    public double getFatAnualArea() {
        return fatAnualArea;
    }
    public void setFatAnualArea(double fatAnualArea) {
        this.fatAnualArea = fatAnualArea;
    }

    public String getTipo(){return "Mercado";}

    public double despesaAnual(){
        return getCustoAnualLimpeza();
    }
    public double receitaAnual(){
        return (getAreaCorredores() * getFatAnualArea());
    }
    public double getLucroAnual(){return receitaAnual() - despesaAnual();}

    public String imprimeFicheiroTxt(){
        return super.imprimeFicheiroTxt() + tipoDeMercado + "/" + areaCorredores + "/" + fatAnualArea;
    }

    @Override
    public String toString() {
        return "Mercado{" +
                "tipo='" + getTipoDeMercado() + '\'' +
                ", areaCorredores=" + getAreaCorredores() +
                ", fatAnualArea=" + getFatAnualArea() +
                '}';
    }
}


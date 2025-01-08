import java.io.Serializable;

public class Cafe extends Restauracao implements Serializable{
    private int cafesDia;
    private double fatAnualCafeDia;

    public Cafe() {
    }

    public Cafe(String categoria, String nome, String distrito, Coordenada localizacao, int numEmpregadosMesa, int salarioMedioAnual, int clientesDiarios, int cafesDia, double fatAnualCafeDia) {
        super(categoria, nome, distrito, localizacao, numEmpregadosMesa, salarioMedioAnual, clientesDiarios);
        this.cafesDia = cafesDia;
        this.fatAnualCafeDia = fatAnualCafeDia;
    }

    public Cafe(int cafesDia, double fatAnualCafeDia){
        this.cafesDia = cafesDia;
        this.fatAnualCafeDia = fatAnualCafeDia;
    }

    public int getCafesDia() {
        return cafesDia;
    }
    public void setCafesDia(int cafesDia) {
        this.cafesDia = cafesDia;
    }

    public double getFatAnualCafeDia() {
        return fatAnualCafeDia;
    }
    public void setFatAnualCafeDia(int fatAnualCafeDia) {
        this.fatAnualCafeDia = fatAnualCafeDia;
    }

    public String getTipo(){return "Cafe";}

    public double despesaAnual(){
        return (getNumEmpregadosMesa() * getSalarioMedioAnual());
    }
    public double receitaAnual(){
        return (getCafesDia() * getFatAnualCafeDia());
    }
    public double getLucroAnual(){return receitaAnual() - despesaAnual();}

    public int capacidadeMaxima(){return super.getClientesDiarios();}

    public String imprimeFicheiroTxt(){
        return super.imprimeFicheiroTxt() + cafesDia + "/" + fatAnualCafeDia;
    }

    @Override
    public String toString() {
        return "Cafe{" +
                "cafesDia=" + cafesDia +
                ", fatAnualCafeDia=" + fatAnualCafeDia +
                '}';
    }
}

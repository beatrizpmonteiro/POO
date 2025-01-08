import java.io.Serializable;

public class Pastelaria extends Restauracao implements Serializable{
    private int bolosDia;
    private double fatAnualBoloDia;

    public Pastelaria() {
    }
    public Pastelaria(String categoria, String nome, String distrito, Coordenada localizacao, int numEmpregadosMesa, int salarioMedioAnual, int clientesDiarios, int bolosDia, double fatAnualBoloDia) {
        super(categoria, nome, distrito, localizacao, numEmpregadosMesa, salarioMedioAnual, clientesDiarios);
        this.bolosDia = bolosDia;
        this.fatAnualBoloDia = fatAnualBoloDia;
    }
    public Pastelaria (int bolosDia, double fatAnualBoloDia){
        this.bolosDia = bolosDia;
        this.fatAnualBoloDia = fatAnualBoloDia;
    }

    public int getBolosDia() {
        return bolosDia;
    }
    public void setBolosDia(int bolosDia) {
        this.bolosDia = bolosDia;
    }

    public double getFatAnualBoloDia() {
        return fatAnualBoloDia;
    }
    public void setFatAnualBoloDia(int fatAnualBoloDia) {
        this.fatAnualBoloDia = fatAnualBoloDia;
    }

    public String getTipo(){return "Pastelaria";}

    public double despesaAnual(){
        return (getNumEmpregadosMesa() * getSalarioMedioAnual());
    }
    public double receitaAnual(){
        return (getBolosDia() * getFatAnualBoloDia());
    }
    public double getLucroAnual(){return receitaAnual() - despesaAnual();}

    public int capacidadeMaxima(){return super.clientesDiarios;};

    public String imprimeFicheiroTxt(){
        return super.imprimeFicheiroTxt() + bolosDia + "/" + fatAnualBoloDia;
    }

    @Override
    public String toString() {
        return "Pastelaria{" +
                "bolosDia=" + getBolosDia() +
                ", fatAnualBoloDia=" + getFatAnualBoloDia() +
                '}';
    }
}

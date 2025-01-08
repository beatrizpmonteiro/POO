import java.io.Serializable;

public abstract class Restaurante extends Restauracao implements Serializable{
    protected int diasFuncionamentoAno;
    protected int mesasInterior;
    protected double fatMesaDia;

    public Restaurante() {
    }
    public Restaurante(String categoria, String nome, String distrito, Coordenada localizacao, int numEmpregadosMesa, int salarioMedioAnual, int clientesDiarios, int diasFuncionamentoAno, int mesasInterior, double fatMesaDia) {
        super(categoria, nome, distrito, localizacao, numEmpregadosMesa, salarioMedioAnual, clientesDiarios);
        this.diasFuncionamentoAno = diasFuncionamentoAno;
        this.mesasInterior = mesasInterior;
        this.fatMesaDia = fatMesaDia;
    }

    public Restaurante(int diasFuncionamentoAno, int mesasInterior, double fatMesaDia){
        this.diasFuncionamentoAno = diasFuncionamentoAno;
        this.mesasInterior = mesasInterior;
        this.fatMesaDia = fatMesaDia;
    }

    public int getDiasFuncionamentoAno() {
        return diasFuncionamentoAno;
    }
    public void setDiasFuncionamentoAno(int diasFuncionamentoAno) {
        this.diasFuncionamentoAno = diasFuncionamentoAno;
    }

    public int getMesasInterior() {
        return mesasInterior;
    }
    public void setMesasInterior(int mesasInterior) {
        this.mesasInterior = mesasInterior;
    }

    public double getFatMesaDia() {
        return fatMesaDia;
    }
    public void setFatMesaDia(double fatMesaDia) {
        this.fatMesaDia = fatMesaDia;
    }

    public abstract String getTipo();

    public abstract double despesaAnual();
    public abstract double receitaAnual();
    public abstract double getLucroAnual();

    public abstract int capacidadeMaxima();

    public String imprimeFicheiroTxt(){
        return super.imprimeFicheiroTxt() + diasFuncionamentoAno + "/" + mesasInterior + "/" + fatMesaDia + "/";
    }

    @Override
    public String toString() {
        return "Restaurante{" +
                "diasFuncionamentoAno=" + getDiasFuncionamentoAno() +
                ", mesasInterior=" + getMesasInterior() +
                ", fatMesaDia=" + getFatMesaDia() +
                '}';
    }
}

import java.io.Serializable;

public class Local extends Restaurante implements Serializable{
    private int mesasEsplanada;
    private double custoLicencaAnualMesaEsplanada;

    public Local() {
    }
    public Local(String categoria, String nome, String distrito, Coordenada localizacao, int numEmpregadosMesa, int salarioMedioAnual, int clientesDiarios, int diasFuncionamentoAno, int mesasInterior, double fatMesaDia, int mesasEsplanada, double custoLicencaAnualMesaEsplanada) {
        super(categoria, nome, distrito, localizacao, numEmpregadosMesa, salarioMedioAnual, clientesDiarios, diasFuncionamentoAno, mesasInterior, fatMesaDia);
        this.mesasEsplanada = mesasEsplanada;
        this.custoLicencaAnualMesaEsplanada = custoLicencaAnualMesaEsplanada;
    }
    public Local(int mesasEsplanada, double custoLicencaAnualMesaEsplanada){
        this.mesasEsplanada = mesasEsplanada;
        this.custoLicencaAnualMesaEsplanada = custoLicencaAnualMesaEsplanada;
    }

    public int getMesasEsplanada() {
        return mesasEsplanada;
    }
    public void setMesasEsplanada(int mesasEsplanada) {
        this.mesasEsplanada = mesasEsplanada;
    }

    public double getCustoLicencaAnualMesaEsplanada() {
        return custoLicencaAnualMesaEsplanada;
    }
    public void setCustoLicencaAnualMesaEsplanada(double custoLicencaAnualMesaEsplanada) {
        this.custoLicencaAnualMesaEsplanada = custoLicencaAnualMesaEsplanada;
    }

    public String getTipo(){return "Restaurante Local";}

    public double despesaAnual(){
        return ((getNumEmpregadosMesa() * getSalarioMedioAnual()) + (getMesasEsplanada() * getCustoLicencaAnualMesaEsplanada()));
    }
    public double receitaAnual(){
        return ((getMesasInterior() + getMesasEsplanada()) * getFatMesaDia() * getDiasFuncionamentoAno());
    }
    public double getLucroAnual(){return receitaAnual() - despesaAnual();}

    public int capacidadeMaxima(){
        return (getMesasEsplanada() * 4) + (super.getMesasInterior() * 4);
    }

    public String imprimeFicheiroTxt(){
        return super.imprimeFicheiroTxt() + mesasEsplanada + "/" + custoLicencaAnualMesaEsplanada;
    }

    @Override
    public String toString() {
        return "Local{" +
                "mesasEsplanada=" + mesasEsplanada +
                ", custoLicencaAnualMesaEsplanada=" + custoLicencaAnualMesaEsplanada +
                '}';
    }
}

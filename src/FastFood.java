import java.io.Serializable;

public class FastFood extends Restaurante implements Serializable{
    private int clientesDriveThru;
    private double fatClienteDriveThruDiario;

    public FastFood() {
    }

    public FastFood(String categoria, String nome, String distrito, Coordenada localizacao, int numEmpregadosMesa, int salarioMedioAnual, int clientesDiarios, int diasFuncionamentoAno, int mesasInterior, double fatMesaDia, int clientesDriveThru, double fatClienteDriveThruDiario) {
        super(categoria, nome, distrito, localizacao, numEmpregadosMesa, salarioMedioAnual, clientesDiarios, diasFuncionamentoAno, mesasInterior, fatMesaDia);
        this.clientesDriveThru = clientesDriveThru;
        this.fatClienteDriveThruDiario = fatClienteDriveThruDiario;
    }

    public FastFood(int clientesDriveThru, double fatClienteDriveThruDiario){
        this.clientesDriveThru = clientesDriveThru;
        this.fatClienteDriveThruDiario = fatClienteDriveThruDiario;
    }

    public int getClientesDriveThru() {
        return clientesDriveThru;
    }
    public void setClientesDriveThru(int clientesDriveThru) {
        this.clientesDriveThru = clientesDriveThru;
    }

    public double getFatClienteDriveThruDiario() {
        return fatClienteDriveThruDiario;
    }
    public void setFatClienteDriveThruDiario(double fatClienteDriveThruDiario) {
        this.fatClienteDriveThruDiario = fatClienteDriveThruDiario;
    }

    public String getTipo(){return "Restaurante FastFood";}

    public double despesaAnual(){
        return (getNumEmpregadosMesa() * getSalarioMedioAnual());
    }
    public double receitaAnual(){
        return ((getMesasInterior() * getFatMesaDia()) + (getClientesDriveThru() * getFatClienteDriveThruDiario()) * getDiasFuncionamentoAno());
    }
    public double getLucroAnual(){return receitaAnual() - despesaAnual();}

    public int capacidadeMaxima(){return clientesDriveThru + (4 * super.mesasInterior);}

    public String imprimeFicheiroTxt(){
        return super.imprimeFicheiroTxt() + clientesDriveThru + "/" + fatClienteDriveThruDiario;
    }

    @Override
    public String toString() {
        return "FastFood{" +
                "clientesDriveThru=" + clientesDriveThru +
                ", fatClienteDriveThruDiario=" + fatClienteDriveThruDiario +
                '}';
    }
}


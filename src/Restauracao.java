import java.io.Serializable;

public abstract class Restauracao extends Empresa implements Serializable{
    protected int numEmpregadosMesa;
    protected double salarioMedioAnual;
    protected int clientesDiarios;

    public Restauracao() {
    }
    public Restauracao(String categoria, String nome, String distrito, Coordenada localizacao, int numEmpregadosMesa, int salarioMedioAnual, int clientesDiarios) {
        super(categoria, nome, distrito, localizacao);
        this.numEmpregadosMesa = numEmpregadosMesa;
        this.salarioMedioAnual = salarioMedioAnual;
        this.clientesDiarios = clientesDiarios;
    }
    public Restauracao(int numEmpregadosMesa, int salarioMedioAnual, int clientesDiarios){
        this.numEmpregadosMesa = numEmpregadosMesa;
        this.salarioMedioAnual = salarioMedioAnual;
        this.clientesDiarios = clientesDiarios;
    }

    public int getNumEmpregadosMesa() {
        return numEmpregadosMesa;
    }
    public void setNumEmpregadosMesa(int numEmpregadosMesa) {
        this.numEmpregadosMesa = numEmpregadosMesa;
    }

    public double getSalarioMedioAnual() {
        return salarioMedioAnual;
    }
    public void setSalarioMedioAnual(double salarioMedioAnual) {
        this.salarioMedioAnual = salarioMedioAnual;
    }

    public int getClientesDiarios() {
        return clientesDiarios;
    }
    public void setClientesDiarios(int clientesDiarios) {
        this.clientesDiarios = clientesDiarios;
    }

    public abstract String getTipo();

    public abstract double despesaAnual();
    public abstract double receitaAnual();
    public abstract double getLucroAnual();

    public abstract int capacidadeMaxima();

    public String imprimeFicheiroTxt(){
        return super.imprimeFicheiroTxt() + numEmpregadosMesa + "/" + salarioMedioAnual + "/" + clientesDiarios + "/";
    }

    @Override
    public String toString() {
        return "Restauracao{" +
                "numEmpregadosMesa=" + getNumEmpregadosMesa() +
                ", salarioMedioAnual=" + getSalarioMedioAnual() +
                ", clientesDiarios=" + getClientesDiarios() +
                '}';
    }
}


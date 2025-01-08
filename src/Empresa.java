import java.io.Serializable;
import java.lang.Math;

public abstract class Empresa implements Serializable{
    protected String categoria;
    protected String nome;
    protected String distrito;
    protected Coordenada localizacao;

    public Empresa() {
    }
    public Empresa(String categoria, String nome, String distrito, Coordenada localizacao){
        this.categoria = categoria;
        this.nome = nome;
        this.distrito = distrito;
        this.localizacao = localizacao;
    }

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDistrito() {
        return distrito;
    }
    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public Coordenada getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(Coordenada localizacao) {
        this.localizacao = localizacao;
    }

    public abstract String getTipo();

    public abstract double despesaAnual();
    public abstract double receitaAnual();
    public abstract double getLucroAnual();

    public abstract int capacidadeMaxima();

    //verificar
    public String imprime(){
        String str = "";
        str += "Empresa " + nome + ":\n" +
                "\tTipo: " + categoria + ";\n" +
                "\tDistrito: " + distrito + ";\n" +
                "\tDespesa Anual: " + despesaAnual() + ";\n" +
                "\tReceita Anual: " + receitaAnual() + ";\n";
        if (receitaAnual() > despesaAnual()) {
            str += "\tLucro positivo de: " + Math.abs(receitaAnual() - despesaAnual()) + "\n";
        } else {
            str += "\tPrejuizo de: " +  Math.abs(receitaAnual() - despesaAnual()) + "\n";
        }
        return str;
    }

    public String imprimeFicheiroTxt(){
        return categoria + "/" + getTipo() + "/" + nome + "/" + distrito + "/" + localizacao.imprimeFicheiroTxt() + "/";
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "categoria='" + categoria + '\'' +
                ", nome='" + nome + '\'' +
                ", distrito='" + distrito + '\'' +
                ", localizacao=" + localizacao +
                '}';
    }
}

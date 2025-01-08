import java.io.*;
import java.util.ArrayList;

public class StarThrive{
    ArrayList<Empresa> empresas;
    private Ficheiro ficheiro;

    public static void main(String[] args) {
        StarThrive s = new StarThrive();


    }

    public StarThrive(){
        empresas = new ArrayList<>();
        Ficheiro f = new Ficheiro();
        f.lerFicheiroTXT(empresas);
    }

    //acho que o get e set nao é preiciso, conferir
    public ArrayList<Empresa> empresas() {
        return empresas;
    }

    public void setEmpresas(ArrayList<Empresa> empresas) {
        this.empresas = empresas;
    }


    //ex1
    public void listaEmpresas(){
        System.out.println("\nEmpresas:\n\n");
        for(Empresa empresa: empresas){
            System.out.println(empresa.imprime());
        }
    }

    //ex2
    public void empresaMaiorReceita(String tipo){
        double max = 0;
        System.out.println("Empresas do tipo " + tipo + "com maior receita anual: \n");
        String aux = "";
        for (Empresa empresa : empresas) {
            if (empresa.getTipo().equalsIgnoreCase(tipo)) {
                if (empresa.receitaAnual() > max) {
                    aux = "Nome da empresa: " + empresa.getNome() + "\nReceita anual da empresa: " + empresa.receitaAnual() + "\n";
                    max = empresa.receitaAnual();
                } else if (empresa.receitaAnual() == max) {
                    aux += "Nome da empresa: " + empresa.getNome() + "\nReceita anual da empresa: " + empresa.receitaAnual() + "\n";
                }
            }                   /*VER DEPOIS ****************************** */
        }
        if (aux.equalsIgnoreCase("")){
            System.out.println("Não há nenhuma empresa deste tipo\n");
        } else {
            System.out.println(aux);
        }
    }

    public void empresaMenorDespesa(String tipo){
        double min = empresas.get(0).despesaAnual();
        System.out.println("Empresas do tipo " + tipo + "com menor despesa anual: \n");
        String aux = "";
        for (Empresa empresa : empresas) {
            if (empresa.getTipo().equalsIgnoreCase(tipo)) {
                if (empresa.despesaAnual() < min) {
                    aux = "Nome da empresa: " + empresa.getNome() + "\nDespesa anual da empresa: " + empresa.despesaAnual() + "\n";
                    min = empresa.despesaAnual();
                } else if (empresa.despesaAnual() == min) {
                    aux += "Nome da empresa: " + empresa.getNome() + "\nDespesa anual da empresa: " + empresa.despesaAnual() + "\n";
                }
            }                        /*VER DEPOIS ****************************** */
        }
        if (aux.equalsIgnoreCase("")){
            System.out.println("Não há nenhuma empresa deste tipo\n");
        } else {
            System.out.println(aux);
        }
    }

    public void empresaMaiorLucro(String tipo){
        double max = 0;
        System.out.println("Empresas do tipo " + tipo + "com maior lucro anual: \n");
        String aux = "";
        for (Empresa empresa : empresas) {
            if (empresa.getTipo().equalsIgnoreCase(tipo)) {
                if (empresa.getLucroAnual() > max) {
                    aux = "Nome da empresa: " + empresa.getNome() + "\nLucro anual da empresa: " + empresa.getLucroAnual() + "\n";
                    max = empresa.getLucroAnual();
                } else if (empresa.getLucroAnual() == max) {
                    aux += "Nome da empresa: " + empresa.getNome() + "\nLucro anual da empresa: " + empresa.getLucroAnual() + "\n";
                }
            }                        /*VER DEPOIS ****************************** */
        }
        if (aux.equalsIgnoreCase("")){
            System.out.println("Não há nenhuma empresa deste tipo\n");
        } else {
            System.out.println(aux);
        }
    }

    //ex3
    public void maiorCapacidadeRestauracao(){
        /*VERIFICAR: funçao capacidadeMaxima se faz as contas corretas, duvida(?)
        + ver se esta bem para o caso de as capacidades serem iguais (IMPORTANTE)*/

        int aux, aux2;
        String str = "", str2 = "";

        //copia para a lista aux apenas as empresas do tipo restauraçao
        ArrayList<Empresa> listaAux = new ArrayList<>();
        for (Empresa empresa : empresas){
            if (empresa.getCategoria().equalsIgnoreCase("Restauracao")){
                listaAux.add(empresa);
            }
        }

        //ordena as primeiras duas posicoes aux>aux2
        if (listaAux.get(0).capacidadeMaxima() >= listaAux.get(1).capacidadeMaxima()){
            aux = listaAux.get(0).capacidadeMaxima();
            aux2 = listaAux.get(1).capacidadeMaxima();
            str = "Nome da empresa: " + listaAux.get(0).nome + "Valor da capacidade de clientes por dia: " + listaAux.get(0).capacidadeMaxima();
            str2 = "Nome da empresa: " + listaAux.get(1).nome + "Valor da capacidade de clientes por dia: " + listaAux.get(1).capacidadeMaxima();
        } else{
            aux = listaAux.get(1).capacidadeMaxima();
            aux2 = listaAux.get(0).capacidadeMaxima();
            str = "Nome da empresa: " + listaAux.get(1).nome + "Valor da capacidade de clientes por dia: " + listaAux.get(1).capacidadeMaxima();
            str2 = "Nome da empresa: " + listaAux.get(0).nome + "Valor da capacidade de clientes por dia: " + listaAux.get(0).capacidadeMaxima();
        }

        //vai buscar a capacidade das 2 empresas com mais capacidade
        System.out.println("Empresas do tipo Restauraçao com maior capacidade de clientes por dia");
        for (int i = 2; i < listaAux.size(); i++){
            if ((listaAux.get(i).capacidadeMaxima() > aux2) || (listaAux.get(i).capacidadeMaxima() == aux)) {
                aux2 = listaAux.get(i).capacidadeMaxima();
                str2 = "Nome da empresa: " + listaAux.get(i).nome + "Valor da capacidade de clientes por dia: " + aux2;
                if (aux2 > aux) {
                    aux2 = aux;
                    aux = listaAux.get(i).capacidadeMaxima();
                    String strAux = str2;
                    str2 = str;
                    str = strAux;
                }
            }
        }

        //imprime
        if ((str.equalsIgnoreCase("") && (str2.equalsIgnoreCase("")))){
            System.out.println("Não há nenhuma empresa deste tipo\n");
        } else {
            System.out.println(str);
            System.out.println(str2);
        }
    }
}


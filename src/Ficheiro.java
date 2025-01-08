import java.io.*;
import java.util.ArrayList;

public class Ficheiro {
    public void lerFicheiroTXT(ArrayList<Empresa> empresas){
        File ficheiro = new File("StarThrive.txt");
        if (ficheiro.exists() && ficheiro.isFile()) {
            try {
                FileReader fr = new FileReader(ficheiro);
                BufferedReader br = new BufferedReader(fr);
                String line;
                String[] result;
                while ((line = br.readLine()) != null) {
                    result = line.split("/");
                    if (result[1].equalsIgnoreCase("Café")){
                        empresas.add(new Cafe(result[0], result[2], result[3], new Coordenada(Double.parseDouble(result[4]), Double.parseDouble(result[5])), Integer.parseInt(result[6]), Integer.parseInt(result[7]), Integer.parseInt(result[8]), Integer.parseInt(result[9]), Double.parseDouble(result[10])));
                    } else if (result[1].equalsIgnoreCase("Pastelaria")){
                        empresas.add(new Pastelaria(result[0], result[2], result[3], new Coordenada(Double.parseDouble(result[4]), Double.parseDouble(result[5])), Integer.parseInt(result[6]), Integer.parseInt(result[7]), Integer.parseInt(result[8]), Integer.parseInt(result[9]), Double.parseDouble(result[10])));
                    } else if (result[1].equalsIgnoreCase("Restaurante Local")){
                        empresas.add(new Local(result[0], result[2], result[3], new Coordenada(Double.parseDouble(result[4]), Double.parseDouble(result[5])), Integer.parseInt(result[6]), Integer.parseInt(result[7]), Integer.parseInt(result[8]), Integer.parseInt(result[9]), Integer.parseInt(result[10]), Double.parseDouble(result[11]), Integer.parseInt(result[12]), Double.parseDouble(result[13])));
                    } else if (result[1].equalsIgnoreCase("Restaurante FastFood")){
                        empresas.add(new FastFood(result[0], result[2], result[3], new Coordenada(Double.parseDouble(result[4]), Double.parseDouble(result[5])), Integer.parseInt(result[6]), Integer.parseInt(result[7]), Integer.parseInt(result[8]), Integer.parseInt(result[9]), Integer.parseInt(result[10]), Double.parseDouble(result[11]), Integer.parseInt(result[12]), Double.parseDouble(result[13])));
                    } else if (result[1].equalsIgnoreCase("Frutaria")) {
                        empresas.add(new Frutaria(result[0], result[2], result[3], new Coordenada(Double.parseDouble(result[4]), Double.parseDouble(result[5])), Double.parseDouble(result[6]), Integer.parseInt(result[7]), Double.parseDouble(result[8])));
                    } else if (result[1].equalsIgnoreCase("Mercado")){
                        empresas.add(new Mercado(result[0], result[2], result[3], new Coordenada(Double.parseDouble(result[4]), Double.parseDouble(result[5])), Double.parseDouble(result[6]), result[7], Double.parseDouble(result[8]), Double.parseDouble(result[9])));
                    }
                }
                br.close();
            } catch (FileNotFoundException ex) {
                System.out.println("Erro a abrir ficheiro de texto.");
            } catch (IOException ex) {
                System.out.println("Erro a ler ficheiro de texto.");
            }
        } else {
            System.out.println("Ficheiro não existe.");
        }
    }

    public void escreverFicheiroTXT(ArrayList<Empresa> listaEmpresa){
        File ficheiro = new File("StarThrive.txt");
        try{
            FileWriter fw = new FileWriter(ficheiro);
            BufferedWriter bw = new BufferedWriter(fw);

            for(Empresa empresa : listaEmpresa){
                bw.write(empresa.imprimeFicheiroTxt());
                bw.newLine();
            }
            bw.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Erro a abrir ficheiro de texto.");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no ficheiro.");
        }
    }

    public void escreveFicheiroObj(ArrayList<Empresa> empresas) {
        File ficheiro = new File("StarThrive.obj");
        try (FileOutputStream fos = new FileOutputStream(ficheiro);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            for (Empresa empresa: empresas){
                oos.writeObject(empresa);
            }
            oos.close();
        } catch (FileNotFoundException e) {
            System.out.println("Erro a criar ficheiro");
        }
        catch (IOException e) {
            System.out.println("Erro a escrever no ficheiro.");
        }
    }

    public void lerFicheiroObj(ArrayList<Empresa> empresas) {
        File ficheiro = new File("StarThrive.obj");
        try (FileInputStream fis = new FileInputStream(ficheiro);
             ObjectInputStream ois = new ObjectInputStream(fis)){
            for (Empresa empresa: empresas){
                Empresa empresaX = (Empresa)ois.readObject();
                empresas.add(empresaX);
            }
            ois.close();
        } catch (FileNotFoundException e) {
            System.out.println("Erro de abertura do ficheiro.");
        } catch (IOException e) {
            System.out.println("Erro a ler ficheiro.");
        } catch (ClassNotFoundException e) {
            System.out.println("Erro a converter para objeto.");
        }
    }
}

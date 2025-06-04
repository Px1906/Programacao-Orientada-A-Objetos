import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Empregado {

    private String nome;
    private String cargo;
    private String id;
    private double salario;
    private int dependentes;
    private String filePath;

    public Empregado(String nome, String cargo, String id, double salario) {
        try {
            if (salario < 0) {
                throw new IllegalArgumentException("O salário não pode ser negativo.");
            }
        } catch (IllegalArgumentException e) {
                System.err.println(e);
            }
        this.nome = nome;
        this.cargo = cargo;
        this.id = id;
        this.salario = salario;
        this.dependentes = 0;
        this.filePath = "D:\\Unifor\\GitHub\\Programacao-Orientada-A-Objetos\\av3\\trabalhoAv3\\src\\" + this.getId() + ".txt";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        try (FileWriter teste = new FileWriter(this.filePath)) {
            teste.write(this.toString());
        } catch (IOException e) {
            System.out.println("deu errado isso ai");
        }
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
        try (FileWriter teste = new FileWriter(this.filePath)) {
            teste.write(this.toString());
        } catch (IOException e) {
            System.out.println("deu errado isso ai");
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
        try (FileWriter teste = new FileWriter(this.filePath)) {
            teste.write(this.toString());
        } catch (IOException e) {
            System.out.println("deu errado isso ai");
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        try {
            if (salario < 0) {
                throw new IllegalArgumentException("O salário não pode ser negativo.");
            }
        } catch (IllegalArgumentException e) {
                System.err.println(e);
            }
        
        this.salario = salario;

        try (FileWriter teste = new FileWriter(this.filePath)) {
            teste.write(this.toString());
        } catch (IOException e) {
            System.out.println("deu errado isso ai");
        }
    }

    public int getDependentes() {
        return this.dependentes;
    }

    public void setDependentes(int dependentes) {
        this.dependentes = dependentes;
        try (FileWriter teste = new FileWriter(this.filePath)) {
            teste.write(this.toString());
        } catch (IOException e) {
            System.out.println("deu errado isso ai");
        }
    }

    public String getFilePath() {
        return this.filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    
    @Override
    public String toString() {
        return "Empregado{" + "nome='" + nome + '\'' + ", cargo='" + cargo + '\'' + ", id='" + id + '\'' + ", salario=" + salario + '}';
    }

    public void criarArquivo() {
        try (FileWriter teste = new FileWriter(this.filePath)) {
            teste.write(this.toString());
        } catch (IOException e) {
            System.out.println("deu errado isso ai");
        }
    }

    public void deletarArquivo() {
        File arquivo = new File(this.filePath);
        arquivo.delete(); 
}

    public String Arquivo() {
        String saida = "";
        
        try(BufferedReader reader = new BufferedReader(new FileReader(this.filePath))) {
            String line;
            while((line = reader.readLine()) != null){
                saida += line;
            }
        } catch(FileNotFoundException e) {
            System.out.println("Nao achou o arquivo");
        } catch(IOException e) {
            System.out.println("deu errado isso ai");
        }
        return saida;
    }
}
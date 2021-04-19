
public class Pessoa {
    private String CPF;
    private String Nome;
    private int Idade;
    private char Sexo;

    public String getCPF() {
        return CPF;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    public void setCPF(String CPF){
        this.CPF = CPF;
    }
    public String imprimir(){
        return "CPF: " + CPF + "\nNome: " + Nome + "\nSexo - " + Sexo + "\nIdade: " + Idade;
    }
}

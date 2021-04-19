import javax.swing.JOptionPane;
public class Main {


    public static void main(String[] args) {
      int opc = 0, Idade;
    Pessoa pessoa = null;
    String Nome, CPF;
    char Sexo;
    Object[] opcSexo = {"Masculino", "Feminino"};
    while (opc != 3){
    opc = Integer.parseInt(
           JOptionPane.showInputDialog( "1 - Criar Pessoa\n2 - Mostrar Pessoa\n3 - Sair"));
       switch(opc){
             case 1 : 
                 CPF = JOptionPane.showInputDialog("Digite o CPF: ");
                 Nome = JOptionPane.showInputDialog("Digite o Nome: ");
                 Idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
                 Sexo = String.valueOf(JOptionPane.showInputDialog(null, "Defina seu sexo: ", "Opção", JOptionPane.QUESTION_MESSAGE,
                         null, opcSexo, opcSexo[0])).charAt(0);
                 pessoa = new Pessoa();
                 pessoa.setCPF(CPF);
                 pessoa.setNome(Nome);
                 pessoa.setIdade(Idade);
                 pessoa.setSexo(Sexo);
                 break;
             case 2 :
                 if(pessoa == null)
                     JOptionPane.showMessageDialog(null, "Nenhuma pessoa criada.", "Atenção", JOptionPane.WARNING_MESSAGE);
                 else
                 JOptionPane.showMessageDialog(null, pessoa.imprimir());
                 break;
             case 3 : break;
             default :
                  JOptionPane.showMessageDialog(null, "Opção Inválida", "Atenção", JOptionPane.ERROR_MESSAGE);
                 break;
    }
    
}
    }}
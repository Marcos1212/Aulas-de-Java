import java.util.Scanner;
import javax.swing.JOptionPane;

public class banco {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double saldo = 0;
        boolean sair = false;
        banco obj = new banco();
        while (sair == false){
            obj.Menu();
            int opcao = tcl.nextInt();
            switch (opcao){
                case 1:
                    obj.MostrarSaldo(saldo);
                    break;
                case 2:
                    saldo = obj.Sacar(saldo);
                    break;
                case 3:
                    saldo = obj.Depositar(saldo);
                    break;
                case 4:
                    sair = obj.Sair(sair);
                    break;
                default:
                    System.out.println("Digite uma opção valida!");
            }
        }
    }
    public void Menu(){
        System.out.println("Digite uma opcao");
        System.out.println("-------------");
        System.out.println("1 - ver saldo");
        System.out.println("2 - Sacar");
        System.out.println("3 - Depositar");
        System.out.println("4 - Sair");
        System.out.println("-------------");
    }
    public void MostrarSaldo(double saldo){
        System.out.println("Seu saldo é R$ " + saldo);
    }
    public double Sacar(double saldo){
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite o valor do saque");
        double valor = tcl.nextInt();
        saldo = saldo-valor;
        return saldo;
    }
    public double Depositar(double saldo){
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite o valor do deposito");
        double valor = tcl.nextInt();
        saldo = saldo+valor;
        return saldo;
    }
    public boolean Sair(boolean sair){
        Scanner tcl = new Scanner(System.in);
        System.out.println("Você realmente que sair (S/N)");
        String acao = tcl.next();
        if (acao.equals("S")){
            sair = true;
        }else{
            sair = false;
        }
        return sair;
    }
}
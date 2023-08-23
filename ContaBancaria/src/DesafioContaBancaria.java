import java.util.Scanner;

public class DesafioContaBancaria {
    public static void main(String[] args) {
        System.out.println("****************************************************************************");
        String nome = "Tatiane";
        String tipoConta = "Conta Corrente";
        double saldo = 1599.99;
        int opcaoCliente = 0;

        System.out.println("Nome: " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo atual: R$" + saldo);
        System.out.println("****************************************************************************");

        String menu = """
                    Escolha qual opção você deseja:
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    """;
        Scanner sc = new Scanner(System.in);

        while (opcaoCliente != 4) {
            System.out.println(menu);
            opcaoCliente = sc.nextInt();

            switch (opcaoCliente) {
                case 1:
                    System.out.println("Seu saldo é de R$" + saldo);
                    break;
                case 2:
                    System.out.println("Quanto você irá receber?");
                    double receberValor = sc.nextDouble();
                    saldo += receberValor;
                    System.out.println("Esse é seu valor atual: R$" + saldo);
                    break;
                case 3:
                    System.out.println("Quanto você irá transferir?");
                    double transferirValor = sc.nextDouble();
                    if( saldo < transferirValor){
                        System.out.println("Não é possível transferir, pois voc~e não tem saldo suficiente");
                    } else {
                        saldo -= transferirValor;
                        System.out.println("Você transferiu R$" + transferirValor + " Esse é seu saldo atual R$" + saldo);
                    }
                    break;
            }
        }
    }
}

import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome = "Marty McFly";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        double pix = 0;

        System.out.println("""
                ***************************************
                Dados iniciais do cliente:
                
                Nome:           %s
                Tipo da conta:  %s
                Saldo inicial:  R$ %.2f  
                ***************************************
                """.formatted(nome, tipoConta, saldo));

        while (true) {

            System.out.println("""
                    
                    Operações
                                        
                    1- Consultar saldo
                    2- Receber pix
                    3- Fazer pix
                    4- Sair
                                        
                    Digite a opção desejada:
                    """);
            int opcao = sc.nextInt();
            if (opcao == 1) {
                System.out.println(String.format("O saldo atual é de R$ %.2f", saldo));
            } else if (opcao == 2) {
                System.out.println("Informe o valor do pix a receber:");
                pix = sc.nextDouble();
                if (pix <= 0) {
                    System.out.println("Valor Inválido!");
                } else {
                    saldo += pix;
                    System.out.println(String.format("Saldo atualizado para R$ %.2f",saldo));
                }
            } else if (opcao == 3) {
                System.out.println("Informe o valor do pix que você deseja fazer:");
                pix = sc.nextDouble();
                if (pix <= 0){
                    System.out.println("Valor Inválido!");
                } else if (pix > saldo) {
                    System.out.println("Não há saldo suficiente para fazer essa transferência.");
                } else {
                    saldo -= pix;
                    System.out.println(String.format("Saldo atualizado para R$ %.2f",saldo));
                }
            } else if (opcao == 4) {
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }

    }
}
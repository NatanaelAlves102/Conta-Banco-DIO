
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       

        Scanner sc = new Scanner(System.in);


        //Atributo
        int numero = 1234;
        String agencia = "567-8";
        String nomeCliente = "Natanael";
        double saldo = 100.45;



        //Solicitando informanção da conta
        System.out.println("Bem-Vindo! ao nosso Banco.");
        System.out.println( "Por favor, digite o número da Agência !");

        int numeroConta = sc.nextInt();

        //Conferencia do login
        if(numeroConta == numero){
           
            System.out.println("Olá  "+nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é " +agencia+ ", conta "+numero+ " e seu saldo "+saldo+" já está disponível para saque");
       
        }else{

            System.out.println("Número da Agência tente novamente");

        }

        sc.close();
    }

        }



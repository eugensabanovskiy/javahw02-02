import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Укажите сумму пополнения счета: ");
        int topUpAccount = in.nextInt();
        int AccountBalance = 100;
        int x = 100;
        if (topUpAccount < 1000) {
            int balance = AccountBalance + topUpAccount;
            System.out.printf("Баланс Вашего счета составляет: %d \n", balance);}
        else {
            int balance = (AccountBalance + topUpAccount) + (topUpAccount / x);
            System.out.printf("Баланс Вашего счета составляет: %d \n", balance);
        }



    }
}
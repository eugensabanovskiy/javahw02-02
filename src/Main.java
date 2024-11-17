public class Main {
    public static void main(String[] args) {
        int topUpAccount = 1100;
        int accountBalance = 100;
        int bonus = 100;
        if (topUpAccount < 1000) {
            int finalBalance = accountBalance + topUpAccount;
            System.out.printf("Баланс Вашего счета составляет: %d \n", finalBalance);
        } else {
            int finalBalance = (accountBalance + topUpAccount) + (topUpAccount / bonus);
            System.out.printf("Баланс Вашего счета составляет: %d \n", finalBalance);
        }
    }
}
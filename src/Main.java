//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int score = 200; // стоимость билета
        int DepositAccount = 4000; // депозитный счет клиента

        int bonus;

        if (DepositAccount > 2000) {
            bonus = DepositAccount / 200; //формула подсчета бонусных рблей, за каждую внесенную 1000 рублей
        } else {
            bonus = 1;
        }
        int balance = score + DepositAccount + bonus;

        System.out.println("Ваш баланс составляет:" + balance + " Рублей");


    }
}
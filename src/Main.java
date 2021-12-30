public class Main {
    public static void main(String[] args) {

        double balance = 100.76;
        double payment = 1223.31;

        if (payment >= 1000) {
            int bonus = (int) (payment / 100); // 1 руб. за каждые 100 руб.
            double total = bonus + payment + balance;

            System.out.println("Ваш баланс " + total + " рублей");
            System.out.println("Вам начислено " + bonus + " баллов");

        } else {
            double total = balance + payment;

            System.out.println("Ваш баланс " + total + " рублей");
            System.out.println("Вам начислено 0 баллов");
        }
    }
}

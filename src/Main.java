public class Main {
    public static void main(String[] args) {
        int transfer = 999;
        long bonus = transfer / 100;
        if (transfer < 1000) {
            System.out.println("the minimum payment for crediting bonuses is 1000 rubles");
        } else {
            System.out.println(bonus);

        }
    }
}
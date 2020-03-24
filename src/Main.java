import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        long current = 1000;
        long put = 20000;
        int coefficient = 100;
        long limit = 1000;
        long bonus;
        if (put > limit) {
        bonus = put / coefficient;
        } else {
            bonus = 0;
        }

        System.out.println(bonus);
    }
}
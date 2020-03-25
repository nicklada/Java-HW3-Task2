import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int current = 1000;
        int put = 20000;
        int coefficient = 100;
        int treshold = 1000;
        int bonus;
        if (put > treshold) {
        bonus = put / coefficient;
        } else {
            bonus = 0;
        }

        System.out.println(bonus);
    }
}

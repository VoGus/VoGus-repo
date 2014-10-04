package Hospital;

import java.util.Scanner;

/**
 * Created by VoGus on 28.09.2014.
 */
public class Doctor extends Staff {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = 90, j = 30000, z=0, x=0, y=0;
    System.out.print(i + " врачей нуждаются в курсах повышения квалификации.\nСколько денег Вы готовы выделить на их обучение?\n");
    z = sc.nextInt();
    x=z/j;
        System.out.println(x + " врачей прошло курсы.");
    y=i-x;
            System.out.println(y + " врачей всё ещё нуждаются в курсах.");
    }
}

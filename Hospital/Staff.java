package Hospital;
import java.util.Scanner;
import javax.swing.Timer;
/**
 * Created by VoGus on 28.09.2014.
 */
public class Staff {
    public static void main(String[] args) {
        java.util.Timer timer2 = new java.util.Timer();
        Scanner sc = new Scanner(System.in);
        int i = 0, j = 200;
        System.out.print("У вас 200 человек персонала. Укажите среднюю зарплату: ");
        i = sc.nextInt();
        if (i < 20000) {
            for (j = 200; j >= Math.random()*150+30; j--)
                System.out.println(j + " человек персонала осталось у вас");
        } else {
            System.out.println("Персонал доволен!");
        }
    }
}
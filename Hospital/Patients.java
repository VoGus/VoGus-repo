package Hospital;
import java.util.Scanner;
/**
 * Created by VoGus on 28.09.2014.
 */
public class Patients {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int i = 0;
            System.out.print("Введите количество пациентов: ");
            i = sc.nextInt();
            if(i<=10) {
                System.out.println("Все хорошо!");
            } else {
                System.out.println("Много больных :(");
            }
        }
    }


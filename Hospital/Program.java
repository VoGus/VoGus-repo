package com.hospital;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Hospital pHospital;
        pHospital = new Hospital( 10, 10, 10 );
        int Choice = 0;
        do {
            System.out.print( "1)Добавить врача.\n2)Добавить медсестру.\n3)Добавить больного.\n4)Вывести на экран.\n0)Выход.\n" );
            Choice = in.nextInt();
            switch( Choice ){
                case 1 : pHospital.AddDoctor(); break;
                case 2 : pHospital.AddNurse(); break;
                case 3 : pHospital.AddPatient(); break;
                case 4 : pHospital.ShowAll(); break;
                case 0 : System.out.println( "До свидания." ); break;
                default: System.out.println( "Введите ещё раз." );
            }
        }
        while ( Choice != 0 );
    }
}
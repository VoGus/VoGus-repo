package com.hospital;
import java.util.Scanner;


public class Hospital {
    private
    Doctor[] aDoctors;
    Nurse[] aNurses;
    Patient[] aPatient;
    int nDoctorLen, nNurseLen, nPatientLen;
    int nDoctorCount, nNurseCount, nPatientCount;

    public Hospital(){
        nDoctorLen = 5;
        nNurseLen = 5;
        nPatientLen = 5;
        aDoctors = new Doctor[nDoctorLen];
        aNurses = new Nurse[nNurseLen];
        aPatient = new Patient[nPatientLen];
        nDoctorCount = 0;
        nNurseCount = 0;
        nPatientCount = 0;
    }

    public Hospital( int Doc, int Nur,int Pat ){
        nDoctorLen = Doc;
        nNurseLen = Nur;
        nPatientLen = Pat;
        aDoctors = new Doctor[nDoctorLen];
        aNurses = new Nurse[nNurseLen];
        aPatient = new Patient[nPatientLen];
        nDoctorCount = 0;
        nNurseCount = 0;
        nPatientCount = 0;
    }

    void AddDoctor(){
        if ( nDoctorCount < nDoctorLen )
        {
            Scanner in = new Scanner(System.in);
            System.out.println( "Введите имя" );
            String Name = in.next();
            System.out.println( "Введите фамилию" );
            String Surname = in.next();
            System.out.println( "Введите отчество" );
            String Pathronym = in.next();
            System.out.println( "Введите возраст" );
            int Age = in.nextInt();
            System.out.println( "Введите должность" );
            String Post = in.next();
            System.out.println( "Введите ученую степень" );
            String Degree = in.next();
            System.out.println( "Введите зарплату" );
            int Salary = in.nextInt();
            aDoctors[ nDoctorCount ] = new Doctor( Name, Surname, Pathronym, Age, Post, Degree, Salary);
            nDoctorCount += 1;
        }
        else
        {
            System.out.println( "Больше нет мест" );
        }
    }
    void AddNurse(){
        if ( nNurseCount < nNurseLen )
        {
            Scanner in = new Scanner(System.in);
            System.out.println( "Введите имя" );
            String Name = in.next();
            System.out.println( "Введите фамилию" );
            String Surname = in.next();
            System.out.println( "Введите отчество" );
            String Pathronym = in.next();
            System.out.println( "Введите возраст" );
            int Age = in.nextInt();
            System.out.println( "Введите ранг" );
            String Rank = in.next();
            aNurses[ nNurseCount ] = new Nurse( Name, Surname, Pathronym, Age, Rank );
            nNurseCount += 1;
        }
        else
        {
            System.out.println( "Больше нет мест" );
        }
    }
    void AddPatient(){
        if ( nPatientCount < nPatientLen )
        {
            Scanner in = new Scanner(System.in);
            System.out.println( "Введите имя" );
            String Name = in.next();
            System.out.println( "Введите фамилию" );
            String Surname = in.next();
            System.out.println( "Введите отчество" );
            String Pathronym = in.next();
            System.out.println( "Введите возраст" );
            int Age = in.nextInt();
            System.out.println( "Введите болезнь" );
            String Desease = in.next();
            System.out.println( "Введите лекарство" );
            String Drug = in.next();
            System.out.println( "Введите номер комнаты" );
            int Room = in.nextInt();
            aPatient[ nPatientCount ] = new Patient( Name, Surname, Pathronym, Age, Desease, Drug, Room);
            nPatientCount += 1;
        }
        else
        {
            System.out.println( "Больше нет мест" );
        }
    }
    void ShowAll(){
        System.out.println( "Доктора:" );
        if ( nDoctorCount != 0 )
            for ( int i =0; i < nDoctorCount; i++)
            {
                aDoctors[ i ].Show();
                System.out.println();
            }
        else
            System.out.println( "Докторов нет." );

        System.out.println( "Медсестры:" );
        if ( nNurseCount != 0 )
            for ( int i =0; i < nNurseCount; i++)
            {
                aNurses[ i ].Show();
                System.out.println();
            }
        else
            System.out.println( "Медсестер нет." );

        System.out.println( "Пациенты:" );
        if ( nPatientCount != 0 )
            for ( int i =0; i < nPatientCount; i++)
            {
                aPatient[ i ].Show();
                System.out.println();
            }
        else
            System.out.println( "Пациентов нет." );
        System.out.println();
    }
}
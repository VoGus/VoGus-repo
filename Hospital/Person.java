package com.hospital;

public class Person {
    private                              // Свойства декларированы как закрытые( private )
    String sName, sSurname, sPatronymic; //Свойства класса
    int nAge;
    // Методы записи
    Person() {
        sName = "";
        sSurname = "";
        sPatronymic = "";
        nAge = 0;
    }
    Person( String Name, String Surname, String Patronymic, int Age ) {
        sName = Name;
        sSurname = Surname;
        sPatronymic = Patronymic;
        nAge = Age;
    }
    public void SetName( String Name){  //функция типа void, т.е. не возвразначения ( процедура )
        sName = Name;                   // В свойво sName записывается значение формалной переменной Name
    }

    public void SetSurname( String Surname){
        sSurname = Surname;
    }

    public void SetPatronymic( String Patronymic){
        sPatronymic = Patronymic;
    }

    public void SetAge( int Age){
        nAge = Age;
    }
    //Методы чтения
    public String GetName(){            // Функция типа String возвращает объект класса String
        return sName;                   // возвращает значение свойства sName
    }

    public String GetSurname(){
        return sSurname;
    }

    public String GetPatronymic(){
        return sPatronymic;
    }

    public int GetAge(){
        return nAge;
    }

    public void Show(){
        System.out.print( sName + " " +sSurname + " " +sPatronymic + " " +nAge );
    }
}

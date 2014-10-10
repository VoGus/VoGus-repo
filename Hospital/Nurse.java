package com.hospital;

public class Nurse extends Person {
    private
    String sRank;

    public
    Nurse(  String Name, String Surname, String Patronymic, int Age, String Rank) {
        super( Name, Surname,Patronymic, Age);
        sRank = Rank;
    }
    void SetRank( String Rank )
    {
        sRank = Rank;
    }

    String GetRank()
    {
        return sRank;
    }

    public void Show(){
        super.Show();
        System.out.print( sRank );
    }
}

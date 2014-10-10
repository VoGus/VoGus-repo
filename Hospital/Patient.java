package com.hospital;

public class Patient extends Person {
    private
    String sDisease, sDrugs;
    int nRoom;

    public
    Patient( String Name, String Surname, String Patronymic, int Age, String Disease, String Drugs, int Room ) {
        super( Name, Surname,Patronymic, Age);
        sDisease = Disease;
        sDrugs = Drugs;
        nRoom = Room;
    }

    void SetDisease( String Disease)
    {
        sDisease = Disease;
    }

    void SetDrugs( String Drugs )
    {
        sDrugs = Drugs;
    }

    void SetRoom( int Room )
    {
        nRoom = Room;
    }

    String GetDisease()
    {
        return sDisease;
    }

    String GetDrugs()
    {
        return sDrugs;
    }

    int GetRoom()
    {
        return nRoom;
    }

    public void Show(){
        super.Show();
        System.out.print( sDisease + " " +sDrugs + " " +nRoom );
    }
}

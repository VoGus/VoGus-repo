package com.hospital;

public class Doctor extends Person {
    private
    String sPost, sDegree;
    int nSalary;

public
    Doctor( String Name, String Surname, String Patronymic, int Age, String Post, String Degree, int Salary ) {
        super( Name, Surname,Patronymic, Age);
        sPost = Post;
        sDegree = Degree;
        nSalary = Salary;
    }
    void SetPost( String Post ){
        sPost = Post;
    }

    void SetDegree( String Degree ){
        sDegree = Degree;
    }

    void SetSalary( int Salary ){
        nSalary = Salary;
    }

    String GetPost(){
        return sPost;
    }

    String GetDegree(){
        return sDegree;
    }

    int GetSalary(){
        return nSalary;
    }

    public void Show(){
        super.Show();
        System.out.print( sPost + " " +sDegree + " " +nSalary );
    }
}

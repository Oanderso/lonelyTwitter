package ca.ualberta.cs.lonelytwitter.model;

import java.util.Scanner;
import java.util.Date;

public class mood1 extends currentMood {

    mood1(){

        Date dateDefault = new Date();

        dateDefault = dateformat3.parse("01/01/2000");
        super.setDate(dateDefault); //set default date


        //take input for date
        Scanner scan = new Scanner(System.in);
        String datenow = scan.next();
        super.setDate(datenow);

    }


    public void message(){
        System.out.println("Feeling saucy" );
    }


}

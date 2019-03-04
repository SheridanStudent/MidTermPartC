/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Andrew
 */
public class TestUserprofile {
    
    static Scanner myScanner = new Scanner(System.in);
    static ArrayList<UserProfile> myArray = new ArrayList<UserProfile>();
    public static void main(String[] args){  
        
        String strName;
        int intGenre;
    
        do{
            System.out.print("Enter name: "); //"Comedy", "Drama", "Action", "Mystery"
            strName = myScanner.nextLine();
        }while(strName.length() == 0);
        
        do{
            System.out.println("0 - Comedy");
            System.out.println("1 - Drama");
            System.out.println("2 - Action");
            System.out.println("3 - Mystery");
            System.out.print("Enter number of your favourite genre: ");
            intGenre = myScanner.nextInt();
        }while(intGenre < 0 || 3 < intGenre);
        
        myArray.add(new UserProfile(strName, alterInput(intGenre)));
        System.out.println("User Profile Added Successfully");
    }
    
    public static String alterInput(int intInput){
        String strReturn = "";
        
        switch(intInput){
            case 0:
                strReturn = "Comedy";
                break;
            case 1:
                strReturn = "Drama";
                break;
            case 2:
                strReturn = "Action";
                break;
            case 3:
                strReturn = "Mystery";
                break;
        }
        
        return strReturn;
    }
}

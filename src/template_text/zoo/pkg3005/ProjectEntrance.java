package template_text.zoo.pkg3005;

import java.util.Scanner;

/**
 *  This is where it "all happens" - the main method is in here!
 * PUT THE TEAM MEMBER NAMES HERE!!!!!!!!!!!!!!
 */
public class ProjectEntrance {
    
    public static void main(String[] args) {
       Scanner GetUserInformation = new Scanner(System.in); // use this object to get your user's replies into your program

// YOUR CODE GOES HERE
       FirstSuperClass Zebranator  = new FirstSuperClass();
       SecondSuperClass Aardvandroid = new SecondSuperClass();
       ThirdSuperClass Birdnold = new ThirdSuperClass();
       TourGuide Tato = new TourGuide();
       String input;
       char choice;
       // work with beings
       Tato.SayGreeting();
       Tato.GetUsername(GetUserInformation.next());
       Tato.ConfirmUsername();
       
       Tato.BeginGuiding();
       input = GetUserInformation.next();
       choice = input.charAt(0);
       Tato.MainGoTo(choice);
       
       switch(Character.getNumericValue(choice)){
            case 1:
                Zebranator.WentTo();
                Zebranator.DetailChoice(GetUserInformation.next());
                break;
            case 2:
                Aardvandroid.WentTo();
                Aardvandroid.DetailChoice(GetUserInformation.next());
                break;
            case 3:
                Birdnold.WentTo();
                Birdnold.DetailChoice(GetUserInformation.next());
                break;
            default:
                   Zebranator.WrongChoiceIncineration();
       }
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
    }
    
}

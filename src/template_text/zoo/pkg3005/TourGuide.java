
package template_text.zoo.pkg3005;
import java.util.Scanner;

public class TourGuide {
    String Greeting = "Hello! and welcome! to our Bio-Botic zoo!"
            + "\nPlease enter how you would like for me to address you";
    String Username = "";
    
    Scanner input = new Scanner(System.in);
    
    public void SayGreeting()
    {
        System.out.println(Greeting);
    }
    public String GetUsername(String a)
    { 
        Username = a;
        
        return Username;
    }
    public void ConfirmUsername()
    {
        System.out.println("\nThank you " + Username + "!");
    }
    
    public String ReturnUsername() {
        return Username;
    }
    
    public void BeginGuiding(){
            
        System.out.println("In this zoo there is a variety of animals that are a mix of technology and biology.\n"
        + "We hope you like it! \n"
        + "In case you want to quit our awesome zoo (which you probably won't because it's awesome!) press q. \n"
        + "\nThese are the classes of bio-botic animals that we have:\n"
        + "1. Zebranator\n"
        + "2. Aardvandroid\n"
        + "3. Birdnold\n"
        + "\n Enter the number of where you want to go!");
        
    }
    
    public void WelcomeBack(){
        String wb;
        String a;
        char choice;
        wb = "Welcome Back! Where do you want to go next?                      press q to quit\n"
                + "1. Zebranator\n"
                + "2. Aardvandroid\n"
                + "3. Birdnold";
        System.out.println(wb);
        a = input.next();
        choice = a.charAt(0);
        MainGoTo(choice);
    }
    
    public void MainGoTo(char a) {
        String ZebranatorGreeting = "Great choice! Zebranators are awesome biobots! \n"
                + "FUN FACT: The average amount of people incinerated by zebranators per year is 980.\n\n ";
        String AardvandroidGreeting = "Nice! Aarvandroids are so weird and cool. Have fun!";
        String BirdnoldGreeting = "Nooooiiiice choice! the birdnold is very interesting. Hasta la vista baby!";
        switch(Character.getNumericValue(a)){
            case 1:
                System.out.println(ZebranatorGreeting);
                break;
            case 2:
                System.out.println(AardvandroidGreeting);
                break;
            case 3:
                System.out.println(BirdnoldGreeting);
                break;
            default:
                if(a == 'q'){
                    System.out.println("See ya later!");
                    System.exit(0);
                }
                else {
                    FirstSuperClass Zebranator = new FirstSuperClass();
                    Zebranator.WrongChoiceIncineration();
                    System.exit(0);
                }
        }
        
    }
}

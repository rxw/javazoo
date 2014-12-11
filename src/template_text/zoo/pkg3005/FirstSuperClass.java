package template_text.zoo.pkg3005;
import java.util.Scanner;

public class FirstSuperClass {
    Scanner getUserInput = new Scanner(System.in);
    
    String Attribute1 = "I can give 15 times more milk than a cow.\n";
    String Attribute2 = "I can smell things from 20 miles away.\n";
    String Attribute3 = "I can chew anything from wood to rocks.\n";
    String name = "Zebranator";
    
    public void WentTo(){
        String Greeting;
        TourGuide Tato = new TourGuide();
        Greeting = "Greetings " + Tato.Username + "! Today I’ll teach you all about the Zebranators!\n"
                + "Would you like to learn more about me?\n"
                + "1. Yes"
                + "2. No";
        System.out.println(Greeting);
    }
    
    public void DetailChoice(String a) {
        char choice;
        choice = a.charAt(0);
        switch(Character.getNumericValue(choice)){
            case 1:
                Details();
                break;
            case 2:
                String why;
                String leaves;
                char leaving;
                why = "Do you want to see oter animals?\n"
                        + "1. Yes, I want to see my options\n"
                        + "2. No, I want to leave the bio-botic zoo\n";
                System.out.println(why);
                leaves = getUserInput.next();
                leaving = leaves.charAt(0);
                switch(Character.getNumericValue(leaving)){
                    case 1:
                        TourGuide Tato = new TourGuide();
                        Tato.WelcomeBack();
                        break;
                    case 2:
                        System.out.println("See ya later!");
                        System.exit(0);
                    default:
                        if(leaving == 'q'){
                            System.out.println("See ya later!");
                            System.exit(0);
                        }
                        else {
                            WrongChoiceIncineration();
                            System.exit(0);
                        }
                }
                break;   
        
        
        }
    }
    
    public void Details(){
        String start;
        String i;
        char choice;
        start = "Zebranators are really cool ! These are some of my attributes are:\n";
        System.out.println(start + Attribute1 + Attribute2 + Attribute3);
        do {
            System.out.println("Which behavior would you like me to demonstrate, 1, 2 or 3? press e if you want to exit the behavior menu\n");
            i = getUserInput.next();
            choice = i.charAt(0);
            switch(Character.getNumericValue(choice)){
                case 1:
                    Behavior1();
                    break;
                case 2:
                    Behavior2();
                    break;
                case 3:
                    Behavior3();
                    break;
                default:
                    if(choice == 'q'){
                        System.out.println("See ya later!");
                        System.exit(0);
                    } else if(choice != 'e'){
                        WrongChoiceIncineration();
                        System.exit(0);
                    }
            }
        } while(choice != 'e');
        System.out.println("\nNow you can talk to the other zebranators. Press enter to continue");
        getUserInput.next();
        TourGuide Tato = new TourGuide();
        First_SubClassA Zebrocket = new First_SubClassA();
        First_SubClassB Zebratron = new First_SubClassB();
        First_SubClassC ZebranatorMedic = new First_SubClassC();
        Zebrocket.main();
        Zebratron.main();
        Tato.WelcomeBack();
    }
    
    public void Behavior1() {
        String behavior;
        behavior = "I see something that could be dangerous to me! * doesn't attack *";
        System.out.println(behavior);
    }
    
    public void Behavior2() {
        String behavior;
        behavior =  "I'm submerged in water! * breathes through his mask *";
        System.out.println(behavior);
    }
    
    public void Behavior3() {
        String behavior;
        behavior = "Is that a red rock behind me?! *turns red to camouflage*";
        System.out.println(behavior);
    }
    
    public void WrongChoiceIncineration() {
        String incineration;
        incineration = "YOU ENTERED AN INVALID CHARACTER AND RELEASED THE BIOBOTS!\n"
                + "THE ZEBRANATOR INCINERATED YOU!";
        System.out.println(incineration);
    }

    
    
    
}

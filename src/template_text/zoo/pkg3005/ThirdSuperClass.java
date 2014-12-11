package template_text.zoo.pkg3005;
import java.util.Scanner;

public class ThirdSuperClass {
    
    Scanner getUserInput = new Scanner(System.in);
    
    String Attribute1 = "I have infrared vision!\n";
    String Attribute2 = "I can see up to 15 times more than the human eye!\n";
    String Attribute3 = "I can see an animals heartbeat and tell whether they're calm or nervous.\n";
    
    public void WentTo(){
        String Greeting;
        TourGuide Tato = new TourGuide();
        Greeting = "Greetings " + Tato.Username + "! My species name is Aardvandroid!\n"
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
            case 2:
                String why;
                String leaves;
                char leaving;
                why = "Do you want to see other animals?\n"
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
                }
                    
        
        
        }
    }
    
    public void Details(){
        String start;
        String i;
        char choice;
        start = "Aardvandroids are really cool ! These are some of my attributes :\n";
        System.out.println(start + Attribute1 + Attribute2 + Attribute3);
        do {
            System.out.println("Which behavior would you like me to demonstrate, 1, 2 or 3? press e if you want to exit the behavior menu\n");
            i = getUserInput.next();
            choice = i.charAt(0);
            switch(choice){
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
                        FirstSuperClass Zebranator = new FirstSuperClass();
                        Zebranator.WrongChoiceIncineration();
                        System.exit(0);
                    }
            }
        } while(choice != 'e');
        TourGuide Tato = new TourGuide();
        Second_SubClassA AardvandroidFlyator = new Second_SubClassA();
        Second_SubClassB AardvandroidSonicified = new Second_SubClassB();
        Second_SubClassC AardvandroidCarrington = new Second_SubClassC();
        AardvandroidFlyator.main();
        AardvandroidSonicified.main();
        AardvandroidCarrington.main();
        Tato.WelcomeBack();
    }
    
    public void Behavior1() {
        String behavior;
        behavior = "I see potential danger to my babies! *attacks danger*";
        System.out.println();
    }
    
    public void Behavior2() {
        String behavior;
        behavior = "I just catched a living bird, should I give it to my babies? nah *eats living prey*";
        System.out.println();
    }
    
    public void Behavior3() {
        String behavior;
        behavior = "Wow I see a bear! *dies of sophocation*";
        System.out.println();
    }
    
}

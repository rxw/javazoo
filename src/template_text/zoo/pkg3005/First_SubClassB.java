package template_text.zoo.pkg3005;

public class First_SubClassB extends FirstSuperClass{
    
    String name1 = "Zebratron";
    
    String Attribute11 = "I have the strength of a thousand suns!\n";
    String Attribute12 = "I have robotic legs!\n";
    String Attribute13 = "I have thermal vision to trace my prey.\n";
    
    public void Behavior11() {
        String behavior;
        behavior = "I want to kill something *kills something*";
        System.out.println(behavior);
    }
    
    public void Behavior12() {
        String behavior;
        behavior =  "Someone is stealing my baby?! oh well *sleeps*";
        System.out.println(behavior);
    }
    
    public void Behavior13() {
        String behavior;
        behavior = "Is that a Dark Bird?! *runs away* ";
        System.out.println(behavior);
    }
 
    public void main() {
        String say = "Hello i'm " + name1 + ", some of my attributes are "
                + Attribute11 + Attribute12 + Attribute13
                + "and these are some things I often do:";
        System.out.println(say);
        Behavior11();
        Behavior12();
        Behavior13();
        System.out.println("\npress enter to move on");
        getUserInput.next();
    }
    
}

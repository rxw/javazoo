package template_text.zoo.pkg3005;

public class First_SubClassA extends FirstSuperClass{
    
    String name1 = "Zebrocket";
    
    String Attribute11 = "I have toxic saliva!\n";
    String Attribute12 = "I can run faster than all the other zebranators!\n";
    String Attribute13 = "I have the greatest reaction time! My reflexes are on point!\n";
    
    public void Behavior11() {
        String behavior;
        behavior = "I see something I want to eat *spits on it*";
        System.out.println(behavior);
    }
    
    public void Behavior12() {
        String behavior;
        behavior =  "*travels*";
        System.out.println(behavior);
    }
    
    public void Behavior13() {
        String behavior;
        behavior = "Is that the Aardvandroid sonicfied? *races him*";
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

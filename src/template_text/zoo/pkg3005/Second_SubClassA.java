package template_text.zoo.pkg3005;

public class Second_SubClassA extends SecondSuperClass{
    
    String name1 = "Aardvandroid Flyator";
    
    String Attribute11 = "I can fly up to 200 feet in less than 10 seconds!\n";
    String Attribute12 = "Even when I'm 200 feet high I can keep track of my prey.\n";
    String Attribute13 = "I can drop my waste on top of my enemies to blind them!\n";
    
    public void Behavior11() {
        String behavior;
        behavior = "I see and organism I'd like to eat *flies and attacks, then eats*";
        System.out.println(behavior);
    }
    
    public void Behavior12() {
        String behavior;
        behavior =  "I feel depressed *jumps to water and eventually comes up because he can't drown due to his inherent nature to survive*";
        System.out.println(behavior);
    }
    
    public void Behavior13() {
        String behavior;
        behavior = "I feel like playing *plays hide and seek*";
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

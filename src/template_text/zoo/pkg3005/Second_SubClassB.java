package template_text.zoo.pkg3005;

public class Second_SubClassB extends SecondSuperClass{
    
    String name1 = "Aardvandroid Sonicfied";
    
    String Attribute11 = "I gotta go fatsr\n";
    String Attribute12 = "I am an amphibious vehicle.\n";
    String Attribute13 = "I can overheat my wheels to the point where I can shoot lasers with my eyes.\n";
    
    public void Behavior11() {
        String behavior;
        behavior = "I see some people racing *joins*";
        System.out.println(behavior);
    }
    
    public void Behavior12() {
        String behavior;
        behavior =  "I am hungry *fries all the fish in the pond with lasers*";
        System.out.println(behavior);
    }
    
    public void Behavior13() {
        String behavior;
        behavior = "I see a female Aardvandroid Sonicfied *gotta go fatsr, gotta impress*";
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

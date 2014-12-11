package template_text.zoo.pkg3005;

public class Second_SubClassC extends SecondSuperClass {
    
    String name1 = "Aardvandroid Carrington";
    
    String Attribute11 = "I can carry 1500 pounds.\n";
    String Attribute12 = "I glow in the dark and create flashes!\n";
    String Attribute13 = "I can go on autopilot for 5 hours.\n";
    
    public void Behavior11() {
        String behavior;
        behavior = "I see some potential prey *smashes it with what he is carrying*";
        System.out.println(behavior);
    }
    
    public void Behavior12() {
        String behavior;
        behavior =  "I feel a little cold *attracts animals to sleep on his back*";
        System.out.println(behavior);
    }
    
    public void Behavior13() {
        String behavior;
        behavior = "I need a defense mechanism *intelligently decides that the best course of action would be to make strange noises while sleeping*";
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

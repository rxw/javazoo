package template_text.zoo.pkg3005;

public class First_SubClassC extends FirstSuperClass{
    
    String name1 = "ZebranatorMedic";
    
    String Attribute11 = "My saliva acts as a painkiller!\n";
    String Attribute12 = "I stop bleeding when I lick a wound.\n";
    String Attribute13 = "I can run up to 80 miles per hour!\n";
    
    public void Behavior11() {
        String behavior;
        behavior = "This guy is injured *carries him to a safe place*";
        System.out.println(behavior);
    }
    
    public void Behavior12() {
        String behavior;
        behavior =  "I think I can see an enemy *goes hide*";
        System.out.println(behavior);
    }
    
    public void Behavior13() {
        String behavior;
        behavior = "Is that an injured Zebrocket? I don't like him *doesn't help him*";
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

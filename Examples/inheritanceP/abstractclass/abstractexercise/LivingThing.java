package abstractexercise;

public abstract class LivingThing {
    public void breath(){
        System.out.println("Living Thing breathing...");
    }
    
    public void eat(){
        System.out.println("Living Thing eating...");
    }
    
    /**
     * abstract method walk
     * We want this method to be overridden by subclasses of
     * LivingThing
     */
    public abstract void walk();
}
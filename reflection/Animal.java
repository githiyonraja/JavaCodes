package reflection;

public class Animal {
    public String breed;
    private boolean canEat;
    Animal(){

    }

    public void Wild(){
        System.out.println("I am Wild Animal");
    }

    public void Domestic(){
        System.out.println("I am Domestic Animal");
    }

    public void myName(String name){
        System.out.println("I am an Animal an my name is "+name);
    }

    private boolean speak(){
        return false;
    }
}

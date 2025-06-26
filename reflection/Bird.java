package reflection;

public class Bird {

    public String breed;
    private boolean canEat;
    Bird(){

    }

    public void fly(){
        System.out.println("I can Fly");
    }

    private boolean speak(){
        return false;
    }
}

package main.java.com.example.templatemethod;

public abstract class Character extends ConstructMethod {
    private  ConstructMethod constructMethod;

    public Character(ConstructMethod constructMethod) {
        this.constructMethod = constructMethod;
    }

    public void construct(String building){
        constructMethod.construct(building);
    }

    public void changeMethod(ConstructMethod method) {
        this.constructMethod = method;
    }
}

package main.java.com.example.templatemethod;

public abstract class ConstructMethod {

    protected abstract void setGoal(String building);
    protected abstract String setMaterial(String building);
    protected abstract String design(String building);
    protected abstract void build(String building);

    public void construct(String building) {
        setGoal(building);
        building = setMaterial(building);
        building = design(building);
        build(building);
    }
}

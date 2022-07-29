package main.java.com.example.strategy;

public class Character {
    private String name;
    private Weapon weapon;

    public Character(String name, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack(){
        System.out.println(name + "(이)가 공격을 시도하다.");
        this.weapon.attack();
    }
}

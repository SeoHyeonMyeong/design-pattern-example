package main.java.com.example.adapter;

public class Character {
    private String name;
    private Weapon weapon;

    public Character(String name, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public void attack() {
        System.out.println(name + " (이)가 공격했다");
        weapon.attack();
    }
}

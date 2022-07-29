package main.java.com.example.strategy;

import main.java.com.example.strategy.weapons.WeaponGun;
import main.java.com.example.strategy.weapons.WeaponSword;

public class App {
    public static void main(String[] args) {

        var character = new Character("Seo",new WeaponSword());
        character.attack();

        character.setWeapon(new WeaponGun());
        character.attack();
    }
}

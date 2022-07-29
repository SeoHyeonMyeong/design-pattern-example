package main.java.com.example.strategy;

public class App {
    public static void main(String[] args) {

        var character = new Character("Seo",new WeaponSword());
        character.attack();

    }
}

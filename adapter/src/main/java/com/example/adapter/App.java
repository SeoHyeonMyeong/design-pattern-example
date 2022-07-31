package main.java.com.example.adapter;

public class App {
    public static void main(String[] args) {
        var character = new Character("Seo", new WeaponSwordAdapter());
        character.attack();

    }
}

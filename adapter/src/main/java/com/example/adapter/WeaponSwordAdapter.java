package main.java.com.example.adapter;

public class WeaponSwordAdapter implements Weapon{

    private final WeaponSword sword = new WeaponSword();

    public final void attack() {
        sword.attack();
    }
}

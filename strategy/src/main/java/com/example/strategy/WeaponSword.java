package main.java.com.example.strategy;

public class WeaponSword implements Weapon {
    @Override
    public void attack() {
        System.out.println("검으로 공격!");
    }
}

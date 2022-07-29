package main.java.com.example.strategy.weapons;

public class WeaponGun implements Weapon {
    @Override
    public void attack() {
        System.out.println("총으로 공격! 탕! 탕!");
    }
}

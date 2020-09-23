package com.company;

public class Main {

    public static void main(String[] args) {
	Boss boss = new Boss();
	boss.setHealth(500);
	boss.setDamage(300);
	Weapon weapon = new Weapon();
	weapon.setName("M416");
	weapon.setDamage(350);
	boss.setWeapon(weapon);
		System.out.println(boss.getHealth() + " " + boss.getDamage() + " " + boss.getWeapon().getName() + " " + boss.getWeapon().getDamage());

    }
}

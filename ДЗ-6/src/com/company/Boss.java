package com.company;

public class Boss extends GameEntity {
    private Weapon weapon;

    public Boss(Weapon weapon, int bossHealth, int bossDamage, String bossDefenceType, int heroHealth, int heroDamage, String herDefenceType) {
        super();
        this.setBossHealth(bossHealth);
        this.setBossDamage(bossDamage);
        this.setBossDefenceType(bossDefenceType);
        this.setHeroHealth(heroHealth);
        this.setHeroDamage(heroDamage);
        this.setHeroDefenceType(herDefenceType);
        this.weapon = weapon;
    }



    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}

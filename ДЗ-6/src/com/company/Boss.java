package com.company;

public class Boss extends GameEntity {
    private String weapon;

    public Boss( int health, int damage, String superAbility,String weapon) {
        super();
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}


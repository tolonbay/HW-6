package com.company;

public class Boss extends GameEntity {
    private String weapon;



    public Boss( int health, int damage,int attack, String superAbility,String weapon) {
        super();
        this.setHealth(health);
        this.setDefenceType(superAbility);
        this.setAttack(attack);
        this.setDamage(damage);
        this.weapon = weapon;

    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String printInfo(){
        return super.printInfo() + this.weapon;
    }
    
}


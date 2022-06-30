package com.company;

public class Skeleton extends Boss {
    private int bone;

    public Skeleton(int health, int damage, int attack, String superAbility, String weapon, int bone) {
        super(health, damage, attack, superAbility, weapon);
        this.bone = bone;
        }

    public int getBone() {
        return bone;
    }

    public void setBone(int bone) {
        this.bone = bone;
    }
    public String printInfo(){
        return super.printInfo() + this.bone;
    }
}

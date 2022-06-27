package com.company;

public class Boss {
    private int bossHealth;
    private int boosDamage;
    private String bossDefenceType;

    public Boss(int bossHealth, int boosDamage, String bossDefenceType) {
        this.bossHealth = bossHealth;
        this.boosDamage = boosDamage;
        this.bossDefenceType = bossDefenceType;
    }

    public int getBossHealth() {
        return bossHealth;
    }

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public int getBoosDamage() {
        return boosDamage;
    }

    public void setBoosDamage(int boosDamage) {
        this.boosDamage = boosDamage;
    }

    public String getBossDefenceType() {
        return bossDefenceType;
    }

    public void setBossDefenceType(String bossDefenceType) {
        this.bossDefenceType = bossDefenceType;
    }
}








package com.company;

public class GameEntity {
    private int bossHealth;
    private  int bossDamage;
    private String bossDefenceType;
    private int heroHealth;
    private int heroDamage;
    private String heroDefenceType;

    public GameEntity(int bossHealth, int bossDamage, String bossDefenceType, int heroHealth, int heroDamage, String heroDefenceType) {
        this.bossHealth = bossHealth;
        this.bossDamage = bossDamage;
        this.bossDefenceType = bossDefenceType;
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
        this.heroDefenceType = heroDefenceType;
    }

    public int getBossHealth() {
        return bossHealth;
    }

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public int getBossDamage() {
        return bossDamage;
    }

    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public String getBossDefenceType() {
        return bossDefenceType;
    }

    public void setBossDefenceType(String bossDefenceType) {
        this.bossDefenceType = bossDefenceType;
    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public void setHeroHealth(int heroHealth) {
        this.heroHealth = heroHealth;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public void setHeroDamage(int heroDamage) {
        this.heroDamage = heroDamage;
    }

    public String getHeroDefenceType() {
        return heroDefenceType;
    }

    public void setHeroDefenceType(String heroDefenceType) {
        this.heroDefenceType = heroDefenceType;
    }
}
